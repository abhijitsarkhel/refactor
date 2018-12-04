package com.tui.search.composer.clients;

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
public interface SearchComposerClient {

	void execute();
}
