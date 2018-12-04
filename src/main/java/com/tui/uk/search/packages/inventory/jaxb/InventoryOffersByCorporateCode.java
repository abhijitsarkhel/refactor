package com.tui.uk.search.packages.inventory.jaxb;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.tui.uk.search.packages.inventory.jaxb.InventoryListByAccommodationResponse.AniteOffer;

public class InventoryOffersByCorporateCode<T> extends HashMap<String, Set<AniteOffer<T>>>
{
   /**
    * 
    */
   private static final long serialVersionUID = -6254175410544324643L;

   public void addAniteOffer(String aniteCode, AniteOffer<T> offer)
   {
      Set<AniteOffer<T>> offers = get(aniteCode);
      if (null == offers)
      {
         offers = new HashSet<>();
         put(aniteCode, offers);
      }
      offers.add(offer);
   }
}
