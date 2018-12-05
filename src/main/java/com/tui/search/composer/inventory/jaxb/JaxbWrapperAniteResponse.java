// $Rev: 789 $
package com.tui.search.composer.inventory.jaxb;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.list.UnmodifiableList;
import org.apache.commons.collections.map.UnmodifiableMap;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.time.FastDateFormat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.util.CollectionUtils;

import com.tui.elastic.anite.jaxb.response.AvCache;
import com.tui.elastic.anite.jaxb.response.AvCache.Result;
import com.tui.elastic.anite.jaxb.response.AvCache.Result.Offers;
import com.tui.elastic.anite.jaxb.response.AvCache.Result.Offers.Facets;
import com.tui.elastic.anite.jaxb.response.AvCache.Result.Offers.Facets.Cat;
import com.tui.elastic.anite.jaxb.response.AvCache.Result.Offers.Facets.Cat.Facet;
import com.tui.elastic.anite.jaxb.response.AvCache.Result.Offers.Lists;
import com.tui.elastic.anite.jaxb.response.AvCache.Result.Offers.Lists.Dc;
import com.tui.elastic.anite.jaxb.response.AvCache.Result.Offers.Offer;
import com.tui.elastic.anite.jaxb.response.AvCache.Result.Offers.Offer.Accom;
import com.tui.elastic.anite.jaxb.response.AvCache.Result.Offers.Offer.Accom.Unit.Occ;
import com.tui.elastic.anite.jaxb.response.AvCache.Result.Offers.Offer.Transport.Route;
import com.tui.search.composer.models.DcUnit;

public class JaxbWrapperAniteResponse implements InventoryListByAccommodationResponse
{

   public static final String DATE_FORMAT_PATTERN = "yyyy-MM-dd";

   protected AvCache response;

   protected String dateFormatPattern = DATE_FORMAT_PATTERN;

   protected ThreadLocal<SimpleDateFormat> threadLocalDateFormat = new DateFormats();

   private static final Logger LOGGER = LogManager.getLogger(JaxbWrapperAniteResponse.class);

   protected Transformer jaxbOffer2aniteOfferTransformer;

   protected List<AniteOffer<? extends Object>> offersList;

   protected List<AniteFacetCategory> facetCategories;

   protected volatile Map<String, AniteFacetCategory> facets;

   protected AniteLists lists;

   protected volatile Map<String, AniteFacetCategory> boardBasisBrandfacets;

   protected volatile Map<String, AniteFacetCategory> departingfacets;

   protected AniteListsUnit listsUnit;

   protected static final String EMPTY_STR = "";

   public JaxbWrapperAniteResponse(AvCache response)
   {
      this.response = response;
   }

   public JaxbWrapperAniteResponse(AvCache response, String dateFormatPattern)
   {
      this(response);
      setDateFormatPattern(dateFormatPattern);
   }

   @Override
   public String toString()
   {
      StringBuilder b = new StringBuilder("Status: " + getStatus());
      int i = 0;
      for (AniteOffer offer : getOffers())
      {
         if (i++ > 0)
         {
            b.append(", ");
         }
         b.append(offer.toString());
      }
      return b.toString();
   }

   protected List<Offer> getInnerOffers()
   {
      try
      {
         return response.getResult().getOffers().getOffer();
      }
      catch (Exception e)
      {
         LOGGER.error(e.getMessage(), e);
         return Collections.emptyList();
      }
   }

   @Override
   public int getOfferCount()
   {
      return getInnerOffers().size();
   }

   @SuppressWarnings("unchecked")
   public List<AniteOffer<? extends Object>> getOffersList()
   {
      if (null == offersList)
      {
         List<Offer> innerOffers = getInnerOffers();
         ArrayList<AniteOffer<? extends Object>> arrayList = new ArrayList<>(innerOffers.size());
         innerOffers.forEach(offer -> arrayList
            .add((AniteOffer<? extends Object>) getTransformer().transform(offer)));
         offersList = UnmodifiableList.decorate(arrayList);
      }
      return offersList;
   }

   protected Transformer getTransformer()
   {
      if (null == jaxbOffer2aniteOfferTransformer)
      {
         jaxbOffer2aniteOfferTransformer =
            input -> new JaxbWrapperAniteResponse.JaxbAniteOffer((Offer) input);
      }
      return jaxbOffer2aniteOfferTransformer;
   }

   @Override
   public Iterable<AniteOffer<? extends Object>> getOffers()
   {
      return new Iterable<AniteOffer<? extends Object>>()
      {
         Iterator<Offer> inner;

         protected Iterator<Offer> getInnerIterator()
         {
            if (null == inner)
            {
               inner = getInnerOffers().iterator();
            }
            return inner;
         }

         @Override
         public Iterator<AniteOffer<? extends Object>> iterator()
         {
            return new Iterator<AniteOffer<? extends Object>>()
            {
               @Override
               public boolean hasNext()
               {
                  return getInnerIterator().hasNext();
               }

               @Override
               public AniteOffer<? extends Object> next()
               {
                  return (AniteOffer) getTransformer().transform(getInnerIterator().next());
               }

               @Override
               public void remove()
               {
                  LOGGER.error("Remove unimplemented");
               }
            };
         }
      };
   }

   @Override
   public AniteStatus getStatus()
   {
      return () -> JaxbWrapperAniteResponse.this.response.getStatus().getTotal().getCount()
         .longValue();
   }

   protected class DateFormats extends ThreadLocal<SimpleDateFormat>
   {
      @Override
      protected SimpleDateFormat initialValue()
      {
         return new SimpleDateFormat(getDateFormatPattern());
      }
   }

   public static final class EmptyAniteLists implements AniteLists
   {
      public static final EmptyAniteLists SINGLETON = new EmptyAniteLists();

      @Override
      public String getOutSlots()
      {
         return EMPTY_STR;
      }

      @Override
      public String getInSlots()
      {
         return EMPTY_STR;
      }

      @Override
      public String getDreamliner()
      {
         return EMPTY_STR;
      }

      @Override
      public String getDeparturePoint()
      {
         return EMPTY_STR;
      }

      @Override
      public String getBoard()
      {
         return EMPTY_STR;
      }
   }

   public class JaxbAniteOffer implements InventoryListByAccommodationResponse.AniteOffer<Offer>
   {
      public class JaxbAniteRoute implements AniteRoute
      {
         Route route;

         public JaxbAniteRoute(Route route)
         {
            this.route = route;
         }

         @Override
         public String toString()
         {
            return "Depart " + getDeparturePoint() + " on "
               + getResponseDateFormat().format(getDepartureDate()) + " at " + getDepartureTime()
               + " to " + getArrivalPoint();
         }

         @Override
         public String getDeparturePoint()
         {
            return route.getDepPt();
         }

         @Override
         public String getDepartureDate()
         {
            FastDateFormat fmt = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ssZ");
            return fmt.format(route.getDepDate());
         }

         @Override
         public String getArrivalPoint()
         {
            return route.getArrPt();
         }

         @Override
         public String getDepartureTime()
         {
            return route.getDepTime();
         }

         @Override
         public String getClazz()
         {
            return route.getClazz();
         }

         @Override
         public String getSrc()
         {
            return route.getSrc();
         }
      }

      public class JaxbAniteAccommodation implements AniteAccommodation
      {
         protected Accom accom;

         public JaxbAniteAccommodation()
         {

         }

         public JaxbAniteAccommodation(Accom accom)
         {
            this.accom = accom;
         }

         public class JaxbAniteUnit implements AniteUnit
         {
            public class JaxbAniteOccupancy implements AniteOccupancy
            {
               protected Occ occ;

               public JaxbAniteOccupancy(Occ occ)
               {
                  this.occ = occ;
               }

               @Override
               public String toString()
               {
                  return getAdults() + "a/" + getChildren() + "c/" + getInfants() + "i";
               }

               @Override
               public short getAdults()
               {
                  return occ.getAd();
               }

               @Override
               public short getChildren()
               {
                  return occ.getCh();
               }

               @Override
               public short getInfants()
               {
                  return occ.getIn();
               }
            }

            @Override
            public String toString()
            {
               return getQuantity() + "x code " + getCode() + " on " + getBoard() + " board"
                  + " / occupancy: " + getOccupancy();
            }

            @Override
            public int getQuantity()
            {
               return (int) offer.getAccom().get(0).getUnit().get(0).getQty();
            }

            @Override
            public AniteOccupancy getOccupancy()
            {
               return new JaxbAniteOccupancy(offer.getAccom().get(0).getUnit().get(0).getOcc());
            }

            @Override
            public String getCode()
            {
               return offer.getAccom().get(0).getUnit().get(0).getCode();
            }

            @Override
            public String getBoard()
            {
               return offer.getAccom().get(0).getUnit().get(0).getBoard();
            }

            @Override
            public Long getMin()
            {
               return offer.getAccom().get(0).getUnit().get(0).getMin();
            }

            @Override
            public Long getMax()
            {
               return offer.getAccom().get(0).getUnit().get(0).getMax();
            }

            @Override
            public Long getMinAd()
            {
               return offer.getAccom().get(0).getUnit().get(0).getMinAd();
            }

            @Override
            public Long getMaxAd()
            {
               return offer.getAccom().get(0).getUnit().get(0).getMaxAd();
            }

            @Override
            public Long getMinCh()
            {
               return offer.getAccom().get(0).getUnit().get(0).getMinCh();
            }

            @Override
            public Long getMaxCh()
            {
               return offer.getAccom().get(0).getUnit().get(0).getMaxCh();
            }

            @Override
            public Long getMaxIn()
            {
               return offer.getAccom().get(0).getUnit().get(0).getMaxIn();
            }
         }

         @Override
         public String toString()
         {
            return "[ code: " + getCode() + ", rating: " + getRating() + ", unit: "
               + getUnit().toString() + ", commercialPriority: " + getCommercialPriority() + "]";
         }

         @Override
         public String getCode()
         {
            return offer.getAccom().get(0).getId();
         }

         @Override
         public String getRating()
         {
            return offer.getAccom().get(0).getRating();
         }

         @Override
         public AniteUnit getUnit()
         {
            return new JaxbAniteUnit();
         }

         @Override
         public String getCommercialPriority()
         {
            return offer.getAccom().get(0).getCommPri();
         }
      }

      protected Offer offer;

      @Override
      public String toString()
      {
         return getResponseDateFormat().format(getDate()) + " for " + getStay() + " days for "
            + getPrice() + "[ accommodation: " + getAccommodation().toString() + ", routes: "
            + getRoutes().toString() + "]";
      }

      public JaxbAniteOffer(Offer offer)
      {
         this.offer = offer;
      }

      @Override
      public String getDate()
      {
         return offer.getDate();
      }

      @Override
      public int getStay()
      {
         return offer.getStay();
      }

      @Override
      public Number getPrice()
      {
         return offer.getPrice();
      }

      @Override
      public List<AniteAccommodation> getAccommodation()
      {

         Iterator<AniteAccommodation> itt =
            IteratorUtils.transformedIterator(offer.getAccom().iterator(),
               (Object input) -> new JaxbAniteAccommodation((Accom) input));
         return IteratorUtils.toList(itt);
      }

      @Override
      public Iterable<AniteRoute> getRoutes()
      {
         return () -> IteratorUtils.transformedIterator(
            offer.getTransport().get(0).getRoute().iterator(),
            input -> new JaxbAniteRoute((Route) input));
      }

      @Override
      public Offer getBackingObject()
      {
         return offer;
      }

      @Override
      public String getBrand()
      {
         return offer.getAccom().get(0).getBrand();
      }

   }

   public DateFormat getResponseDateFormat()
   {
      return threadLocalDateFormat.get();
   }

   public String getDateFormatPattern()
   {
      return dateFormatPattern;
   }

   public void setDateFormatPattern(String dateFormatPattern)
   {
      this.dateFormatPattern = dateFormatPattern;
      this.threadLocalDateFormat = new DateFormats();
   }

   public String getAniteResponseVersion()
   {
      return response.getVersion();
   }

   public class JaxbAniteLists implements AniteLists, BackedObject<Lists>
   {
      protected final Lists lists;

      public JaxbAniteLists(Lists lists)
      {
         this.lists = lists;
      }

      public String getBoard()
      {
         return StringUtils.defaultIfEmpty(lists.getBoard(), EMPTY_STR);
      }

      public String getDeparturePoint()
      {
         return StringUtils.defaultIfEmpty(lists.getDepPt(), EMPTY_STR);
      }

      public String getDreamliner()
      {
         if (null != lists.getDreamLiner())
         {
            return lists.getDreamLiner().toString();
         }
         return EMPTY_STR;

      }

      public String getInSlots()
      {
         return StringUtils.defaultIfEmpty(lists.getInSlots(), EMPTY_STR);
      }

      public String getOutSlots()
      {
         return StringUtils.defaultIfEmpty(lists.getOutSlots(), EMPTY_STR);
      }

      @Override
      public Lists getBackingObject()
      {
         return lists;
      }
   }

   public class JaxbAniteListsUnit implements AniteListsUnit
   {

      protected final Lists listsUnit;

      public JaxbAniteListsUnit(Lists listsUnit)
      {
         this.listsUnit = listsUnit;
      }

      @Override
      public String getBoard()
      {
         return StringUtils.defaultIfEmpty(listsUnit.getBoard(), EMPTY_STR);
      }

      @Override
      public String getDeparturePoint()
      {
         return StringUtils.defaultIfEmpty(listsUnit.getDepPt(), EMPTY_STR);
      }

      @Override
      public String getDeparturePort()
      {
         return StringUtils.defaultIfEmpty(listsUnit.getDepPort(), EMPTY_STR);
      }

      @Override
      public String getDreamliner()
      {
         if (null != listsUnit.getDreamLiner())
         {
            return listsUnit.getDreamLiner().toString();
         }
         return EMPTY_STR;
      }

      @Override
      public String getInSlots()
      {
         return StringUtils.defaultIfEmpty(listsUnit.getInSlots(), EMPTY_STR);
      }

      @Override
      public String getOutSlots()
      {
         return StringUtils.defaultIfEmpty(listsUnit.getOutSlots(), EMPTY_STR);
      }

      @Override
      public String getPrice()
      {
         return StringUtils.defaultIfEmpty(listsUnit.getPrice(), EMPTY_STR);
      }

      @Override
      public String getPricePP()
      {
         return StringUtils.defaultIfEmpty(listsUnit.getPricePP(), EMPTY_STR);
      }

      @Override
      public String getDiscount()
      {
         return StringUtils.defaultIfEmpty(listsUnit.getDiscount(), EMPTY_STR);
      }

      @Override
      public String getCarrier()
      {
         return StringUtils.defaultIfEmpty(listsUnit.getCarrier(), EMPTY_STR);
      }

      @Override
      public List<DcUnit> getDc()
      {
         if (!CollectionUtils.isEmpty(listsUnit.getDc()))
         {
            List<Dc> dcList = listsUnit.getDc();
            List<DcUnit> dcUnitList = new ArrayList<DcUnit>();
            for (Dc dc : dcList)
            {
               DcUnit dcUnit = new DcUnit();
               dcUnit.setValue(dc.getValue().toString());
               dcUnit.setDate(dc.getDate());
               dcUnitList.add(dcUnit);
            }
            return new ArrayList<DcUnit>();
         }
         return new ArrayList<DcUnit>();
      }

   }

   public AniteLists getLists()
   {
      if (null == lists)
      {
         lists = buildLists();
      }
      return lists;
   }

   protected synchronized AniteLists buildLists()
   {
      if (null == lists)
      {
         try
         {
            if (null != response && null != response.getResult()
               && null != response.getResult().getOffers()
               && null != response.getResult().getOffers().getLists())
            {
               lists = new JaxbAniteLists(response.getResult().getOffers().getLists());
            }
         }
         catch (Exception e)
         {
            LOGGER.error("Error getting lists", e);
            lists = EmptyAniteLists.SINGLETON;
         }
      }
      if (null == lists)
      {
         lists = EmptyAniteLists.SINGLETON;
      }
      return lists;
   }

   public AniteListsUnit getListsUnit()
   {
      if (null == listsUnit)
      {
         listsUnit = buildListsUnit();
      }
      return listsUnit;
   }

   protected synchronized AniteListsUnit buildListsUnit()
   {
      if (null == listsUnit)
      {
         try
         {
            if (null != response && null != response.getResult()
               && null != response.getResult().getOffers()
               && null != response.getResult().getOffers().getLists())
            {
               listsUnit = new JaxbAniteListsUnit(response.getResult().getOffers().getLists());
            }
         }
         catch (Exception e)
         {
            LOGGER.error("Error getting lists", e);
            listsUnit = EmptyAniteListsUnit.SINGLETON;
         }
      }
      return listsUnit;
   }

   public static final class EmptyAniteListsUnit implements AniteListsUnit
   {
      public static final EmptyAniteListsUnit SINGLETON = new EmptyAniteListsUnit();

      @Override
      public String getBoard()
      {
         return EMPTY_STR;
      }

      @Override
      public String getDeparturePoint()
      {
         return EMPTY_STR;
      }

      @Override
      public String getDeparturePort()
      {
         return EMPTY_STR;
      }

      @Override
      public String getDreamliner()
      {
         return EMPTY_STR;
      }

      @Override
      public String getInSlots()
      {
         return EMPTY_STR;
      }

      @Override
      public String getOutSlots()
      {
         return EMPTY_STR;
      }

      @Override
      public String getPrice()
      {
         return EMPTY_STR;
      }

      @Override
      public String getPricePP()
      {
         return EMPTY_STR;
      }

      @Override
      public String getDiscount()
      {
         return EMPTY_STR;
      }

      @Override
      public String getCarrier()
      {
         return EMPTY_STR;
      }

      @Override
      public List<DcUnit> getDc()
      {
         return new ArrayList<DcUnit>();
      }
   }

   public class JaxbAniteFacetCategory implements AniteFacetCategory, BackedObject<Cat>
   {
      protected final Cat category;

      protected volatile ArrayList<AniteFacetRefinement> facetRefinements;

      public JaxbAniteFacetCategory(Cat category)
      {
         this.category = category;
      }

      @Override
      public String getCode()
      {
         return category.getCode();
      }

      public class JaxbAniteFacetRefinement implements AniteFacetRefinement
      {
         protected Facet facetRefinement;

         public JaxbAniteFacetRefinement(Facet facetRefinement)
         {
            this.facetRefinement = facetRefinement;
         }

         @Override
         public String getCode()
         {
            return facetRefinement.getCode();
         }

         @Override
         public long getCount()
         {
            return facetRefinement.getCount();
         }

         @Override
         public BigDecimal getMin()
         {
            return facetRefinement.getMin();
         }

         @Override
         public BigDecimal getMax()
         {
            return facetRefinement.getMax();
         }

         @Override
         public String toString()
         {
            ToStringBuilder b = new ToStringBuilder(this);
            b.append(getCode());
            b.append(getMin());
            b.append(getMax());
            b.append(getCount());
            return b.toString();
         }
      }

      @Override
      public List<AniteFacetRefinement> getFacetRefinements()
      {
         if (null == facetRefinements)
         {
            synchronized (this)
            {
               if (null == facetRefinements)
               {
                  List<Facet> facetList = category.getFacet();
                  facetRefinements = new ArrayList<>(facetList.size());
                  facetList
                     .forEach(facet -> facetRefinements.add(new JaxbAniteFacetRefinement(facet)));
               }
            }
         }
         return facetRefinements;
      }

      @Override
      public Cat getBackingObject()
      {
         return this.category;
      }
   }

   @SuppressWarnings("unchecked")
   public List<AniteFacetCategory> getFacetCategories()
   {
      if (null == facetCategories)
      {
         facetCategories = buildFacetCategories();
      }
      if (null == facetCategories)
      {
         facetCategories = ListUtils.EMPTY_LIST;
      }
      return UnmodifiableList.decorate(facetCategories);
   }

   protected synchronized List<AniteFacetCategory> buildFacetCategories()
   {
      if (null == facetCategories)
      {
         try
         {
            if (null != response)
            {
               Result result = response.getResult();
               if (null != result && null != result.getOffers()
                  && null != result.getOffers().getFacets())
               {
                  Offers offers = result.getOffers();
                  Facets facets2 = offers.getFacets();
                  List<Cat> cats = facets2.getCat();
                  ArrayList<AniteFacetCategory> categories = new ArrayList<>(cats.size());
                  cats.forEach(cat -> categories.add(new JaxbAniteFacetCategory(cat)));
                  facetCategories = categories;
                  facetCategories = UnmodifiableList.decorate(facetCategories);

               }
            }
         }
         catch (Exception e)
         {
            LOGGER.error("Error retrieving facets", e);
            facetCategories = ListUtils.EMPTY_LIST;
         }

      }
      return facetCategories;
   }

   @Override
   public Map<String, AniteFacetCategory> getFacetCategoriesByCode()
   {
      if (null == facets)
      {
         synchronized (this)
         {
            if (null == facets)
            {
               facets = new HashMap<>(getFacetCategories().size());
               getFacetCategories().forEach(cat -> facets.put(cat.getCode(), cat));
               facets = (Map<String, AniteFacetCategory>) UnmodifiableMap.decorate(facets);
            }
         }
      }
      return facets;
   }

   /**
    * Process Board Basis and Brand Facets from Anite Offers list
    * 
    * @return boardBasisBrandfacets
    */
   public Map<String, AniteFacetCategory> getBoardBasisBrandFacetCategories()
   {
      if (null == boardBasisBrandfacets)
      {
         synchronized (this)
         {
            if (null == boardBasisBrandfacets)
            {
               boardBasisBrandfacets = new HashMap<>(2);
               buildBoardBasisAndBrandCode();
               return (Map<String, AniteFacetCategory>) UnmodifiableMap
                  .decorate(boardBasisBrandfacets);
            }
         }
      }
      return boardBasisBrandfacets;

   }

   /**
    * Process Board Basis and Brand Codes.
    *
    * @param categories
    */
   public void buildBoardBasisAndBrandCode()
   {
      if (null != response)
      {
         try
         {
            Result result = response.getResult();
            if (null != result)
            {
               Offers offers = result.getOffers();
               if (null != offers && null != offers.getOffer() && !offers.getOffer().isEmpty())
               {
                  List<Offer> offersList1 = offers.getOffer();
                  Map<String, List<String>> boardsMap = new HashMap<>();
                  Map<String, List<String>> brandsMap = new HashMap<>();
                  offersList1.stream().map(offer -> {
                     addBrand(offer.getAccom().get(0).getBrand(), brandsMap);
                     // Consider first unit board basis
                     addBoard(offer.getAccom().get(0).getUnit().get(0).getBoard(), boardsMap);
                     return offer.getAltBoard();
                  }).filter(altBoards -> null != altBoards).map(altBoards -> altBoards.getBoard())
                     .flatMap(boardsList -> boardsList.stream())
                     .forEach(altBoard -> addBoard(altBoard.getCode(), boardsMap));
                  // add Board details
                  addBoardCategory(boardsMap);
                  // add brand detals
                  addBrandCategory(brandsMap);

               }
            }

         }
         catch (Exception e)
         {
            LOGGER.error("Error retrieving facets", e);
         }
      }
   }

   /**
    * Add Brand Category to Facets Map
    *
    * @param brandsMap
    * @param categories
    */
   private void addBrandCategory(Map<String, List<String>> brandsMap)
   {
      // add brand details
      Category category = new Category();
      category.setCode("BRAND");
      List<Facet> brandFacetList = new ArrayList<>(brandsMap.size());
      Iterator<Entry<String, List<String>>> iterator = brandsMap.entrySet().iterator();
      while (iterator.hasNext())
      {
         Entry<String, List<String>> entry = iterator.next();
         Facet facet = new Facet();
         facet.setCode(entry.getKey());
         facet.setCount(entry.getValue().size());
         brandFacetList.add(facet);
      }
      category.setFacet(brandFacetList);
      boardBasisBrandfacets.put(category.getCode(), new JaxbAniteFacetCategory(category));

   }

   /**
    * Add Board Category to Facets Map
    *
    * @param boardsMap
    * @param categories
    */
   private void addBoardCategory(Map<String, List<String>> boardsMap)
   {
      Category category = new Category();
      category.setCode("BOARDBASIS");
      List<Facet> facetList = new ArrayList<>(boardsMap.size());
      Iterator<Entry<String, List<String>>> iterator = boardsMap.entrySet().iterator();
      while (iterator.hasNext())
      {
         Entry<String, List<String>> entry = iterator.next();
         Facet facet = new Facet();
         facet.setCode(entry.getKey());
         facet.setCount(entry.getValue().size());
         facetList.add(facet);
      }
      category.setFacet(facetList);
      boardBasisBrandfacets.put(category.getCode(), new JaxbAniteFacetCategory(category));

   }

   /**
    * Map Board Basis to board specific list.
    *
    * @param board board type
    * @param boardsMap board map
    */
   private void addBoard(String board, Map<String, List<String>> boardsMap)
   {
      if (null != boardsMap.get(board))
      {
         boardsMap.get(board).add(board);
      }
      else
      {
         List<String> list = new ArrayList<>();
         list.add(board);
         boardsMap.put(board, list);
      }

   }

   /**
    * Map Brand details to brand specific list.
    *
    * @param brand brand type
    * @param brandsMap brands map
    */
   private void addBrand(String brand, Map<String, List<String>> brandsMap)
   {
      if (null != brandsMap.get(brand))
      {
         brandsMap.get(brand).add(brand);
      }
      else
      {
         List<String> list = new ArrayList<>();
         list.add(brand);
         brandsMap.put(brand, list);
      }

   }

   /**
    *
    * SubClass of Cat used to set Brand,Board Basis and departing specific Facets.
    *
    */
   public class Category extends Cat
   {

      private List<String> datesList;

      private long count;

      public long getCount()
      {
         return count;
      }

      public void setCount(long count)
      {
         this.count = count;
      }

      public void setFacet(List<Facet> facet)
      {
         super.facet = facet;
      }

      public void setDatesList(List<String> datesList)
      {
         this.datesList = datesList;

      }

      public List<String> getDatesList()
      {
         return datesList;
      }
   }

   /**
    * API is used to construct the departing dates by iterating the anite offers.
    */
   @SuppressWarnings("unchecked")
   @Override
   public Map<String, AniteFacetCategory> getDepartingFacetCategory()
   {
      if (null == departingfacets)
      {
         synchronized (this)
         {
            if (null == departingfacets)
            {
               departingfacets = new HashMap<>(1);
               buildDepartingDates();
               return (Map<String, AniteFacetCategory>) UnmodifiableMap.decorate(departingfacets);
            }
         }
      }
      return departingfacets;
   }

   /**
    * Supporting API for iterating the offers.
    */

   public void buildDepartingDates()
   {
      if (null != response)
      {
         try
         {
            Result result = response.getResult();
            if (null != result)
            {
               Offers offers = result.getOffers();
               if (null != offers && null != offers.getOffer() && !offers.getOffer().isEmpty())
               {
                  List<Offer> offersList1 = offers.getOffer();
                  Category category = new Category();
                  category.setCode("DEPARTING");
                  Set<String> datesList = new HashSet<>(offersList1.size());
                  offersList1.forEach(offer -> datesList.add(offer.getDate()));
                  List<String> datesArrayList = new ArrayList<>(datesList);
                  Collections.sort(datesArrayList);
                  category.setDatesList(datesArrayList);
                  category.setCount(datesArrayList.size());
                  departingfacets.put(category.getCode(), new JaxbElasticFacetCategory(category));
               }

            }

         }
         catch (Exception e)
         {
            LOGGER.error("Error retrieving departing facets", e);
         }
      }
   }

   public static class JaxbAniteOfferDate
   {

      protected Date date;

      public JaxbAniteOfferDate(Date date)
      {

         this.date = date;
      }

      public Date getDate()
      {
         return date;
      }
   }

   public class JaxbElasticFacetCategory implements AniteFacetCategory
   {
      protected final Category category;

      public JaxbElasticFacetCategory(Category category)
      {
         this.category = category;
      }

      @Override
      public String getCode()
      {
         return category.getCode();
      }

      public long getCount()
      {
         return category.getCount();
      }

      public List<String> getDatesList()
      {
         return category.getDatesList();
      }

      public List<AniteFacetRefinement> getFacetRefinements()
      {
         return new ArrayList<>();
      }

   }

   @Override
   public String getResponseVersion()
   {
      return response.getVersion();
   }

   @Override
   public String getXsd()
   {
      return response.getXsd();
   }

   @Override
   public String getNode()
   {
      return response.getNode();
   }
}
