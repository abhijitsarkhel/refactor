package com.tui.search.composer.request.builders;

import com.tui.search.composer.request.SearchComposerRequest;

/**
 * Builds a request for client.
 * 
 * @author sarkh
 *
 */
public interface SearchComposerRequestBuilder {

	default SearchComposerRequest build() {
		return null;
	}
}
