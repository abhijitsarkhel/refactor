package com.tui.search.composer.inventory.jaxb;

import java.util.Collection;

import com.tui.elastic.anite.jaxb.response.AvCache.Result.Offers.Offer;

public class OfferAttribute extends Attribute<Offer>
{
   
   /** The Constant serialVersionUID. */
   private static final long serialVersionUID = 515684554755666125L;

   public OfferAttribute()
   {
   }

   public OfferAttribute(Offer offer)
   {
      add(offer);
   }

   public OfferAttribute(Collection<Offer> offers)
   {
      addAll(offers);
   }
}