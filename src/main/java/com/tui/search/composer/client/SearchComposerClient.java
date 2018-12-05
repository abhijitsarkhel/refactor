package com.tui.search.composer.client;

/**
 * Represent a Search Composer Client.
 * It can be:
 * <ul>
 * 	<li>Elastic Client</li>
 *  <li>Rules Client</li>
 *  <li>Inventory Client</li>
 * </ul>
 * @author sarkh
 *
 */
public interface SearchComposerClient<P, R extends SearchComposerClientParams, S> {

	SearchComposerClientResponse<S> execute(SearchComposerClientRequest<P> request);
	
	R getParams();
	
}
