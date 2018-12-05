package com.tui.search.composer.response;

import com.tui.search.composer.client.SearchComposerClientResponse;
import com.tui.search.composer.request.params.SearchComposerRequestParams;

public interface SearchComposerResponseHandler<S> {
	
	void handle(SearchComposerClientResponse<S> source, SearchComposerResponse target,
			SearchComposerRequestParams params);
}
