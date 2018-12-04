package com.tui.uk.search.packages.inventory.jaxb;

public enum InventoryQueryType
{
      LIST_BY_ACCOMMODATION(3, InventoryListByAccommodationResponse.class),
      CALENDAR(1, InventoryCalendarResponse.class), DURATIONS(2, InventoryDurationsResponse.class),
      SINGLE_ACCOMMODATION(4, InventoryListByAccommodationResponse.class),
      CRUISE_SINGLE_ACCOMMODATION(4, InventoryListByAccommodationResponse.class),
      VILLA_AVAILABILITY(5, InventoryListByAccommodationResponse.class),
      SINGLE_ACCOMM_CHEAPEST_PER_DAY(5, InventoryListByAccommodationResponse.class),
      LIST_BY_CRUISE(5, InventoryListByAccommodationResponse.class),
      LIST_BY_CRUISE_HOLIDAY_OPTIONS(7, InventoryListByAccommodationResponse.class),
      SINGLE_ACCOMM_PAX_AUTO_ALLOCATION(8, InventoryListByAccommodationResponse.class),
      SINGLE_ACCOMM_ALL_ROOMS(9, InventoryListByAccommodationResponse.class);
   public final int searchType;

   public final Class<? extends Object> responseType;

   private InventoryQueryType(int searchType, Class<? extends Object> responseType)
   {
      this.searchType = searchType;
      this.responseType = responseType;
   }
}
