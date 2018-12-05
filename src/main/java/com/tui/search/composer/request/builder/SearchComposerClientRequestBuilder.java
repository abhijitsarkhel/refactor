package com.tui.search.composer.request.builder;

import com.tui.search.composer.client.SearchComposerClientParams;
import com.tui.search.composer.client.SearchComposerClientRequest;
import com.tui.search.composer.client.SearchComposerClientResponse;
import com.tui.search.composer.request.params.SearchComposerRequestParams;

// TODO - SearchComposerRequestParams, SearchComposerClientParams to be inducted during creation, SearchComposerClientResponse to be injected by observer.
public interface SearchComposerClientRequestBuilder<S> {

	//SearchComposerClientRequest<S> build(SearchComposerRequestParams source, SearchComposerClientParams clientParams,
		//	SearchComposerClientResponse clientResp);
	
	SearchComposerClientRequest<S> build();
}
