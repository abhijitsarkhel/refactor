package com.tui.uk.search.packages.inventory.jaxb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.list.UnmodifiableList;

public class CombinedInventoryDurationsResponse implements InventoryDurationsResponse
{
   protected List<Short> stays = Collections.emptyList();

   protected String responseVersion;

   protected long count = 0;

   public CombinedInventoryDurationsResponse(List<Object> responses)
   {
      setResponses(responses);
   }

   protected void setResponses(List<Object> responses)
   {
      count = 0;
      stays = new ArrayList<>();
      responses.stream().map(object -> (InventoryDurationsResponse) object).forEach(d -> {
         responseVersion = d.getResponseVersion();
         count += d.getCount();
         stays.addAll(d.getStays());
      });
   }

   @Override
   public List<Short> getStays()
   {
      return UnmodifiableList.unmodifiableList(stays);
   }

   @Override
   public String getResponseVersion()
   {
      return responseVersion;
   }

   @Override
   public long getCount()
   {
      return count;
   }
}
