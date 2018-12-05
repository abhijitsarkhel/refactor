package com.tui.search.composer.inventory.jaxb;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.commons.collections.list.UnmodifiableList;

import com.tui.elastic.anite.jaxb.response.calendar.AvCache;
import com.tui.elastic.anite.jaxb.response.calendar.AvCache.Result.Offers.Offer;
import com.tui.elastic.anite.jaxb.response.calendar.YesNo;

public class JaxbCalendarResponse implements InventoryCalendarResponse, BackedObject<AvCache>
{
   SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");

   public static class JaxbAniteResponseDateAndAvailability
      implements InventoryCalendarResponseDateAndAvailability
   {
      protected boolean available;

      protected GregorianCalendar date;

      protected String dateSt;

      public JaxbAniteResponseDateAndAvailability(GregorianCalendar date, boolean available)
      {
         super();
         this.available = available;
         this.date = date;
      }

      public JaxbAniteResponseDateAndAvailability(String dateSt, boolean available)
      {
         super();
         this.available = available;
         this.dateSt = dateSt;
      }

      @Override
      public String getDate()
      {
         return dateSt;

      }

      @Override
      public boolean isAvailable()
      {
         return available;
      }

      public void setAvailable(boolean available)
      {
         this.available = available;
      }

   }

   protected AvCache response;

   protected List<InventoryCalendarResponseDateAndAvailability> dateAndAvailabilityList;

   private Object dateAndAvailabilityListLock = new Object();

   public JaxbCalendarResponse(AvCache response)
   {
      this.response = response;
   }

   @SuppressWarnings("unchecked")
   @Override
   public List<InventoryCalendarResponseDateAndAvailability> getDateAndAvailabilityList()
   {
      if (null == dateAndAvailabilityList)
      {
         synchronized (dateAndAvailabilityListLock)
         {
            if (null == dateAndAvailabilityList && null != response.getResult())
            {
               List<Offer> offersList = response.getResult().getOffers().getOffer();
               dateAndAvailabilityList = new ArrayList<>(offersList.size());
               offersList.forEach(
                  offer -> dateAndAvailabilityList.add(new JaxbAniteResponseDateAndAvailability(
                     offer.getDate(), YesNo.Y == offer.getAvail())));
               dateAndAvailabilityList = UnmodifiableList.decorate(dateAndAvailabilityList);
            }
         }
      }
      return dateAndAvailabilityList;
   }

   @Override
   public String getResponseVersion()
   {
      return response.getVersion();
   }

   @Override
   public AvCache getBackingObject()
   {
      return this.response;
   }

}
