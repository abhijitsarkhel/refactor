package com.tui.uk.search.packages.inventory.jaxb;

import java.util.List;

public interface InventoryDurationsResponse
{
   List<Short> getStays();

   String getResponseVersion();

   long getCount();

}
