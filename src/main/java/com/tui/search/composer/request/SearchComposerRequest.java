package com.tui.search.composer.request;

import com.tui.search.composer.clients.SearchComposerClient;
import com.tui.search.composer.constants.ExecutionType;
import com.tui.search.composer.executors.EventCompleteObserver;
import com.tui.search.composer.executors.EventCompletePublisher;
import com.tui.search.composer.executors.EventCompleteSubscriber;

/**
 * Represents a Search Composer Request.
 * 
 * @author sarkh
 *
 */
public class SearchComposerRequest implements EventCompletePublisher, EventCompleteSubscriber {

	private EventCompleteObserver observer;

	private SearchComposerClient client;

	private ExecutionType executionType;

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

}
