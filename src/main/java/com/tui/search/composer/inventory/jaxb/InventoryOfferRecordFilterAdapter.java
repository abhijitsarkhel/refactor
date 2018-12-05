package com.tui.search.composer.inventory.jaxb;

import java.util.Set;

import com.tui.search.composer.inventory.jaxb.InventoryListByAccommodationResponse.AniteOffer;

public interface InventoryOfferRecordFilterAdapter<T>
{
   static interface AniteCodeAndRecordFilter
   {
      String getAniteCode();

      String getRecordFilter();
      
      String getAniteBrand();
   }

   AniteCodeAndRecordFilter buildAniteCodeAndRecordFilter(AniteOffer<T> offer,
      Set<String> aniteCorporateCodes) throws InventoryException;
}