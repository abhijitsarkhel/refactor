package com.tui.search.composer.request;

import com.tui.search.composer.client.SearchComposerClient;
import com.tui.search.composer.client.SearchComposerClientParams;
import com.tui.search.composer.constants.ExecutionType;
import com.tui.search.composer.executors.event.EventCompleteObserver;
import com.tui.search.composer.executors.event.EventCompletePublisher;
import com.tui.search.composer.executors.event.EventCompleteSubscriber;
import com.tui.search.composer.request.builder.SearchComposerClientRequestBuilder;
import com.tui.search.composer.request.params.SearchComposerRequestParams;
import com.tui.search.composer.response.SearchComposerResponseHandler;

/**
 * Represents a Search Composer Request.
 * 
 * @author sarkh
 *
 */
public class SearchComposerRequest<P, Q extends SearchComposerClientParams, R, S>
		implements EventCompletePublisher, EventCompleteSubscriber {

	private SearchComposerClient<P, Q, R> client;

	private SearchComposerClientRequestBuilder<P> requestBuilder;

	private SearchComposerResponseHandler<S> handler;

	private EventCompleteObserver observer;

	private ExecutionType executionType;

	private SearchComposerRequestParams requestParams;

	private SearchComposerRequest dependsOn;

	protected SearchComposerRequest(EventCompleteObserver observer, SearchComposerClient client,
			ExecutionType executionType) {
		this.observer = observer;
		this.executionType = executionType;
	}

	protected SearchComposerRequest(EventCompleteObserver observer, SearchComposerClient client,
			ExecutionType executionType, SearchComposerRequest dependsOn) {
		this.observer = observer;
		this.executionType = executionType;
		this.dependsOn = dependsOn;
	}

	public SearchComposerClient getClient() {
		return client;
	}

	public ExecutionType getExecutionType() {
		return executionType;
	}

	@Override
	public void update() {
		this.executionType = ExecutionType.ASYNC;
		this.observer.unSuscribeFromCompleteEvent(this, dependsOn);
	}

	@Override
	public void suscribe() {
		this.suscribe(this.observer, dependsOn);
	}

	@Override
	public void publishCompletion() {
		this.publishCompletion(this.observer);
	}

	public SearchComposerClientRequestBuilder<P> getRequestBuilder() {
		return requestBuilder;
	}

	public void setRequestBuilder(SearchComposerClientRequestBuilder<P> requestBuilder) {
		this.requestBuilder = requestBuilder;
	}

	public SearchComposerResponseHandler<S> getHandler() {
		return handler;
	}

	public void setHandler(SearchComposerResponseHandler<S> handler) {
		this.handler = handler;
	}

	public SearchComposerRequestParams getRequestParams() {
		return requestParams;
	}

	public void setRequestParams(SearchComposerRequestParams requestParams) {
		this.requestParams = requestParams;
	}

}
