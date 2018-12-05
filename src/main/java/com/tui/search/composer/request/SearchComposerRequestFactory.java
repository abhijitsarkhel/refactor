package com.tui.search.composer.request;

import java.util.Objects;

import javax.annotation.Resource;

import com.tui.search.composer.client.SearchComposerClient;
import com.tui.search.composer.client.SearchComposerClientParams;
import com.tui.search.composer.constants.ExecutionType;
import com.tui.search.composer.executors.event.EventCompleteObserver;

public class SearchComposerRequestFactory {

	@Resource
	private EventCompleteObserver observer;

	public <P, Q, R extends SearchComposerClientParams> SearchComposerRequest<P, Q, R> build(
			SearchComposerClient<P, R> client, SearchComposerRequest<?, ?, ?> dependsOn) {
		SearchComposerRequest<P, Q, R> request = null;
		if (Objects.isNull(dependsOn)) {
			request = new SearchComposerRequest<>(observer, client, ExecutionType.ASYNC);
		} else {
			request = new SearchComposerRequest<>(observer, client, ExecutionType.SYNC, dependsOn);
		}
		return request;
	}
}
