package com.tui.search.composer.inventory.jaxb;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.tui.search.composer.models.DcUnit;

public interface InventoryListByAccommodationResponse
{
   public interface AniteStatus
   {
      public long getCount();

   }

   public interface AniteOffer<T> extends BackedObject<T>
   {
      String getBrand();

      T getBackingObject();

      String getDate();

      int getStay();

      Number getPrice();

      List<AniteAccommodation> getAccommodation();

      Iterable<AniteRoute> getRoutes();

      public interface AniteAccommodation
      {
         String getCode();

         String getRating();

         AniteUnit getUnit();

         String getCommercialPriority();

         public interface AniteUnit
         {
            public interface AniteOccupancy
            {
               short getAdults();

               short getChildren();

               short getInfants();
            }

            String getCode();

            int getQuantity();

            String getBoard();

            AniteOccupancy getOccupancy();

            Long getMin();

            Long getMax();

            Long getMinAd();

            Long getMaxAd();

            Long getMinCh();

            Long getMaxCh();

            Long getMaxIn();
         }
      }

      public interface AniteRoute
      {
         String getDeparturePoint();

         String getArrivalPoint();

         String getDepartureDate();

         String getDepartureTime();

         String getClazz();

         String getSrc();
      }
   }

   Iterable<AniteOffer<? extends Object>> getOffers();

   List<AniteOffer<? extends Object>> getOffersList();

   int getOfferCount();

   AniteStatus getStatus();

   public interface AniteLists
   {
      String getBoard();

      String getDeparturePoint();

      String getDreamliner();

      String getInSlots();

      String getOutSlots();
   }

   public interface AniteListsUnit
   {
      public String getBoard();

      public String getDeparturePoint();

      public String getDeparturePort();

      public String getDreamliner();

      public String getInSlots();

      public String getOutSlots();

      public String getPrice();

      public String getPricePP();

      public String getDiscount();

      public String getCarrier();

      public List<DcUnit> getDc();

   }

   public interface AniteFacetCategory
   {
      String getCode();

      public interface AniteFacetRefinement
      {
         String getCode();

         long getCount();

         BigDecimal getMin();

         BigDecimal getMax();
      }

      List<AniteFacetRefinement> getFacetRefinements();
   }

   List<AniteFacetCategory> getFacetCategories();

   Map<String, AniteFacetCategory> getFacetCategoriesByCode();

   Map<String, AniteFacetCategory> getBoardBasisBrandFacetCategories();

   Map<String, AniteFacetCategory> getDepartingFacetCategory();

   AniteLists getLists();

   AniteListsUnit getListsUnit();

   String getResponseVersion();

   String getXsd();

   String getNode();
}
