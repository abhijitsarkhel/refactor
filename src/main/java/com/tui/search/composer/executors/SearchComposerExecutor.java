package com.tui.search.composer.executors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.tui.search.composer.constants.ExecutionType;
import com.tui.search.composer.request.SearchComposerRequest;
import com.tui.search.composer.response.SearchComposerResponse;

/**
 * Executes a sequence of search composer requests.
 * 
 * @author sarkh
 *
 */
public class SearchComposerExecutor {

	private BlockingQueue<List<SearchComposerRequest>> requestQueue = new LinkedBlockingQueue<>();

	public void execute(List<SearchComposerRequest> sequence, SearchComposerResponse response) {
		try {
			requestQueue.put(segregateAsyncRequest(sequence));
		} catch (InterruptedException e) {
			// TODO Throw proper exception.
		}
		executeInternal(sequence, response);
	}

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
				// TODO - throw exception that execution type is not set.
			}
		}
		return result;
	}

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

	private void executeInternal(List<SearchComposerRequest> sequence, SearchComposerResponse response) {
		do {
			try {
				executeAsync(requestQueue.take(), response);
				List<SearchComposerRequest> newRequest = segregateAsyncRequestNext(sequence);
				// TODO - Use utils
				if (!newRequest.isEmpty()) {
					requestQueue.put(newRequest);
				}
			} catch (InterruptedException e) {
				// TODO Throw proper exception.
				e.printStackTrace();
			}
		} while (!requestQueue.isEmpty());
	}

	private void executeAsync(List<SearchComposerRequest> requestList, SearchComposerResponse response) {
		requestList.parallelStream().forEach(req -> {
			// TODO - Update
			req.getClient().execute();
		});

	}
}
