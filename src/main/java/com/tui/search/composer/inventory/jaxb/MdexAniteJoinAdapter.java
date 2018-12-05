package com.tui.search.composer.inventory.jaxb;

import com.tui.search.composer.inventory.jaxb.ErecToInventoryAccommodationCodeAdapter;
import com.tui.search.composer.inventory.jaxb.InventoryOfferRecordFilterAdapter;

public interface MdexAniteJoinAdapter<BackingObjectType, AniteSideIdentifier>
   extends ErecToInventoryAccommodationCodeAdapter<AniteSideIdentifier, BackingObjectType>,
   InventoryOfferRecordFilterAdapter<BackingObjectType>
{
   void setSiteId(String siteId);
}
