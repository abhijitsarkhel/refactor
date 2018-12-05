package com.tui.search.composer.inventory.jaxb;

import java.util.List;

public interface InventoryDurationsResponse
{
   List<Short> getStays();

   String getResponseVersion();

   long getCount();

}
