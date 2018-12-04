package com.tui.search.composer.models;

import java.util.Set;

import com.tui.elastic.anite.jaxb.response.AvCache.Result.Offers.Offer;

public class SingleAccommodationSlot
{
   private String type;

   private String totalOffers;

   private Set<Offer> offers;

   private String attachOffers;

   public String getType()
   {
      return type;
   }

   public void setType(String type)
   {
      this.type = type;
   }

   public String getTotalOffers()
   {
      return totalOffers;
   }

   public void setTotalOffers(String totalOffers)
   {
      this.totalOffers = totalOffers;
   }

   public Set<Offer> getOffers()
   {
      return offers;
   }

   public void setOffers(Set<Offer> offers)
   {
      this.offers = offers;
   }

   public String getAttachOffers()
   {
      return attachOffers;
   }

   public void setAttachOffers(String attachOffers)
   {
      this.attachOffers = attachOffers;
   }

}
