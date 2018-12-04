package com.tui.search.composer.response;

import com.tui.search.composer.client.SearchComposerClientResponse;
import com.tui.search.composer.exception.InventoryException;
import com.tui.search.composer.request.params.DealsRequestParams;

public interface SearchComposerResponseHandler
{
   void handle(SearchComposerClientResponse source, SearchComposerResponse target,
      DealsRequestParams params) throws InventoryException;   
}
