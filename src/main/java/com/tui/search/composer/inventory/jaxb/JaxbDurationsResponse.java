package com.tui.search.composer.inventory.jaxb;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.list.UnmodifiableList;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tui.elastic.anite.jaxb.response.durations.AvCache;
import com.tui.elastic.anite.jaxb.response.durations.AvCache.Result.Offers.Offer;

public class JaxbDurationsResponse implements InventoryDurationsResponse
{
   protected AvCache response;

   protected long count;

   protected String responseVersion;

   public JaxbDurationsResponse()
   {
   }

   protected static final Transformer OFFER2STAY = (Object input) -> ((Offer) input).getStay();

   protected List stays;

   private static final Logger LOGGER = LogManager.getLogger(JaxbDurationsResponse.class);

   public JaxbDurationsResponse(AvCache response)
   {
      this.response = response;
   }

   @Override
   @SuppressWarnings("unchecked")
   public List<Short> getStays()
   {
      if (null == stays)
      {
         stays = buildStays();
      }
      return stays;
   }

   protected synchronized List buildStays()
   {
      if (null == stays)
      {
         try
         {
            stays = UnmodifiableList.decorate((List) CollectionUtils
               .collect(response.getResult().getOffers().getOffer(), OFFER2STAY));
         }
         catch (Exception e)
         {
            LOGGER.error(e.getMessage(), e);
            stays = ListUtils.EMPTY_LIST;
         }
      }
      return stays;
   }

   @Override
   public String getResponseVersion()
   {
      return response.getVersion();
   }

   public void setResponseVersion(String responseVersion)
   {
      this.responseVersion = responseVersion;
   }

   @Override
   public long getCount()
   {
      try
      {
         return response.getResult().getOffers().getCount();
      }
      catch (Exception e)
      {
         LOGGER.error("Error getting offer count", e);
         return 0;
      }

   }

   @Override
   public String toString()
   {
      return StringUtils.join(getStays(), ',');
   }

   public void setCount(long count)
   {
      this.count = count;
   }
}
