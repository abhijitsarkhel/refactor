package com.tui.search.composer.executors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.commons.collections.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tui.search.composer.client.SearchComposerClientResponse;
import com.tui.search.composer.constants.ExecutionType;
import com.tui.search.composer.exception.SearchComposerServiceException;
import com.tui.search.composer.request.SearchComposerRequest;
import com.tui.search.composer.response.SearchComposerResponse;

/**
 * Executes a sequence of search composer requests.
 * 
 * @author sarkh
 *
 */
public class SearchComposerExecutor {

	/** The Logger */
	private static final Logger LOGGER = LogManager.getLogger(SearchComposerExecutor.class);

	/** The queue for holding async request batches */
	private BlockingQueue<List<SearchComposerRequest>> requestQueue = new LinkedBlockingQueue<>();

	private Map<SearchComposerRequest, SearchComposerClientResponse> responseMap = new HashMap<>();

	/**
	 * Executes a sequence of request.
	 * 
	 * @param sequence the request sequence
	 * @param response the final response
	 * @throws InterruptedException
	 */
	public void execute(List<SearchComposerRequest> sequence, SearchComposerResponse response)
			throws InterruptedException {
		requestQueue.put(segregateAsyncRequest(sequence));
		executeInternal(sequence, response);
	}

	/**
	 * performs the initial segregation of async requests.
	 * 
	 * @param sequence the request sequence
	 * @return the async request batch
	 */
	private List<SearchComposerRequest> segregateAsyncRequest(List<SearchComposerRequest> sequence) {
		List<SearchComposerRequest> result = new ArrayList<>();
		Iterator<SearchComposerRequest> requestIterator = sequence.iterator();
		while (requestIterator.hasNext()) {
			SearchComposerRequest request = requestIterator.next();
			if (ExecutionType.ASYNC.equals(request.getExecutionType())) {
				result.add(request);
				requestIterator.remove();
			} else if (ExecutionType.SYNC.equals(request.getExecutionType())) {
				request.suscribe();
			} else {
				LOGGER.error("Unknown execution type set for the request.");
				throw new SearchComposerServiceException("Unknown execution type set for the request.", 500);
			}
		}
		return result;
	}

	/**
	 * Separates all the async requests post first segregation.
	 * 
	 * @param sequence the request sequence
	 * @return the async request batch
	 */
	private List<SearchComposerRequest> segregateAsyncRequestNext(List<SearchComposerRequest> sequence) {
		List<SearchComposerRequest> result = new ArrayList<>();
		Iterator<SearchComposerRequest> requestIterator = sequence.iterator();
		while (requestIterator.hasNext()) {
			SearchComposerRequest request = requestIterator.next();
			if (ExecutionType.ASYNC.equals(request.getExecutionType())) {
				result.add(request);
				requestIterator.remove();
			}
		}
		return result;
	}

	/**
	 * Executes the request batch created and stored in queue and updates the queue
	 * with new batch of request.
	 * 
	 * @param sequence the request batch
	 * @param response the final response
	 */
	private void executeInternal(List<SearchComposerRequest> sequence, SearchComposerResponse response) {
		do {
			try {
				executeAsync(requestQueue.take(), response);
				List<SearchComposerRequest> newRequest = segregateAsyncRequestNext(sequence);
				if (CollectionUtils.isNotEmpty(newRequest)) {
					requestQueue.put(newRequest);
				}
			} catch (InterruptedException e) {
				LOGGER.error("Error while executing request", e);
				throw new SearchComposerServiceException("Error while executing request", e, 500);
			}
		} while (!requestQueue.isEmpty());
	}

	/**
	 * Executes the batch of async requests.
	 * 
	 * @param requestList async request batch
	 * @param response    the final response.
	 */
	private void executeAsync(List<SearchComposerRequest> requestList, SearchComposerResponse response) {
		requestList.parallelStream().forEach(req -> {
			// TODO - Update
			SearchComposerClientResponse resp = req.getClient().execute(req.getRequestBuilder().build());
			responseMap.put(req, resp);
			req.getHandler().handle(resp, response, req.getRequestParams());
		});

	}
}
