package com.tui.uk.search.packages.inventory.jaxb;

import com.tui.uk.search.packages.inventory.jaxb.ErecToInventoryAccommodationCodeAdapter;
import com.tui.uk.search.packages.inventory.jaxb.InventoryOfferRecordFilterAdapter;

public interface MdexAniteJoinAdapter<BackingObjectType, AniteSideIdentifier>
   extends ErecToInventoryAccommodationCodeAdapter<AniteSideIdentifier, BackingObjectType>,
   InventoryOfferRecordFilterAdapter<BackingObjectType>
{
   void setSiteId(String siteId);
}
