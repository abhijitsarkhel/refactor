package com.tui.search.composer.inventory.jaxb;

import java.util.List;

public interface InventoryCalendarResponse
{
   List<InventoryCalendarResponseDateAndAvailability> getDateAndAvailabilityList();

   String getResponseVersion();

   public interface InventoryCalendarResponseDateAndAvailability
   {

      String getDate();

      boolean isAvailable();
   }
}
