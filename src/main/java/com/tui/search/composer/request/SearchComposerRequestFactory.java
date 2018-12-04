package com.tui.search.composer.request;

import java.util.Objects;

import javax.annotation.Resource;

import com.tui.search.composer.client.SearchComposerClient;
import com.tui.search.composer.constants.ExecutionType;
import com.tui.search.composer.executors.EventCompleteObserver;

public class SearchComposerRequestFactory {

	@Resource
	private EventCompleteObserver observer;

	SearchComposerRequest build(SearchComposerClient client, SearchComposerRequest dependsOn) {
		SearchComposerRequest request = null;
		if (Objects.isNull(dependsOn)) {
			request = new SearchComposerRequest(observer, client, ExecutionType.ASYNC);
		} else {
			request = new SearchComposerRequest(observer, client, ExecutionType.SYNC, dependsOn);
		}
		return request;
	}
}
