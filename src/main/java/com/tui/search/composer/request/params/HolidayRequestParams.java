package com.tui.search.composer.request.params;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.tui.search.composer.constants.DiscType;
import com.tui.search.composer.models.HolidayType;
import com.tui.search.composer.models.RulesRequest;
import com.tui.search.composer.models.rules.Destination;
import com.tui.search.composer.utils.SyntacticSugar;

/**
 * The Class HolidayRequestParameters.
 */
@Component
public class HolidayRequestParams extends SearchComposerRequestParams
{

   /** The Constant PASSTHROUGH_PARAM_FACETING. */
   public static final String PASSTHROUGH_PARAM_FACETING = "f";

   /** The date format pattern. */
   protected String dateFormatPattern = "yyyy-MM-dd";
   
   @Resource
   private SyntacticSugar syntacticSugar;

   /**
    * The Class DateFormatPatterns.
    */
   protected class DateFormatPatterns extends ThreadLocal<DateFormat>
   {

      /*
       * (non-Javadoc)
       * 
       * @see java.lang.ThreadLocal#initialValue()
       */
      
      protected DateFormat initialValue()
      {
         return new SimpleDateFormat(getDateFormatPattern());
      }
   }

   /** The dep airports. */
   private Set<String> depAirports;

   /** The dest airports. */
   private Set<String> destAirports;

   /** The when. */
   private String when;

   /** The search key. */
   private String searchKey;

   /** The top collections. */
   private Set<String> topCollections;

   /** The req type. */
   private String reqType;

   /** The flexible. */
   private String flexible;

   /** The multi select. */
   private String multiSelect;

   /** The is one way. */
   private Boolean isOneWay;

   /** The start date. */
   private String startDate;

   /** The end date. */
   private String endDate;

   /** The month. */
   private String month;

   /** The days. */
   private String days;

   /** The years. */
   private String years;

   /** The deals flag. */
   private String dealsFlag;

   /** The top destinations. */
   private Set<String> topDestinations;

   /** The add A stay. */
   private String addAStay;

   /** The duration. */
   private String duration;

   /** The rules request. */
   private RulesRequest rulesRequest;

   /** The query map. */
   private Map<String, List<String>> queryMap;

   /** The brand. */
   private Set<String> brand = new HashSet<>();

   /** The accommodations. */
   protected Collection<String> accommodations = new ArrayList<>();

   /** The date formats. */
   protected DateFormatPatterns dateFormats = new DateFormatPatterns();

   /** The accommodations string. */
   protected String accommodationsString;

   /** The departure airports string. */
   protected String departureAirportsString = "";

   /** The durations string. */
   protected String durationsString = "";

   /** The earliest departure date string. */
   protected String earliestDepartureDateString;

   /** The latest departure date string. */
   protected String latestDepartureDateString;

   /** The rating. */
   protected String rating;

   /** The adult pax. */
   protected int adultPax = 0;

   /** The room count. */
   protected int roomCount = 0;

   /** The child ages. */
   protected int[] childAges = new int[0];

   /** The passthrough map. */
   protected Map<String, String> passthroughMap = new HashMap<>();

   /** The market. */
   protected String market;

   /** The holiday type. */
   protected HolidayType holidayType;

   /** The promotions. */
   protected String[] promotions;

   /** The promotions string. */
   protected String promotionsString;

   /** The board basis. */
   protected String boardBasis;

   /** The dream liner. */
   protected String dreamLiner;

   /** The candidate durations string. */
   protected String candidateDurationsString;

   /** The sorting parameter. */
   private String sortingParameter;

   /** The search type. */
   private String searchType;

   /** The cruise stay duration. */
   private String cruiseStayDuration;

   /** The cruise accom duration. */
   private String cruiseAccomDuration;

   /** The cruise order. */
   private String cruiseOrder;

   /** The site id. */
   private String siteId;

   /** The anite query type. */
   private int aniteQueryType;

   /** The first rec num. */
   private String firstRecNum;

   /** The rec per page. */
   private String recPerPage;

   /** The child age. */
   private String childAge;

   /** The main search type. */
   private String mainSearchType;

   /** The holiday category. */
   private String holidayCategory;

   /** The cache enable. */
   private String cacheEnable;

   private String cacheName;

   /** The system info. */
   private String systemInfo;

   /** The anite request. */
   private String aniteRequest;

   /** The template id. */
   private String templateId;

   /** The session id. */
   private String sessionId;

   /** The stop over. */
   protected String stopOver;

   /** The cabin. */
   protected String cabin;

   /** The cruise trai. */
   protected String cruiseTrai;

   /** The cruise trao. */
   protected String cruiseTrao;

   /** The cruise type. */
   protected String cruiseType;

   /** The p type. */
   protected String priceType;

   /** The seats. */
   protected String seats;

   /** The f. */
   protected String facetParam;

   /** The rooms. */
   protected String rooms;

   /** The room. */
   protected String room;

   /** The roombb. */
   protected String roombb;

   /** The channel. */
   protected String channel;

   /** The page name. */
   private String pageName;

   /** The product range. */
   private Set<String> productRange = new HashSet<>();

   /** The best for. */
   private Set<String> bestFor = new HashSet<>();

   /** The item type. */
   private String itemType;

   /** The item sub type. */
   private String itemSubType;

   /** The accom features. */
   private Set<String> accomFeatures = new HashSet<>();

   /** The hotel type. */
   private String hotelType;

   /** The arr airport. */
   private Set<String> arrAirport = new HashSet<>();

   /** The dep port. */
   private String depPort;

   /** The cabin only. */
   private String cabinOnly;

   /** The uk port. */
   private String ukPort;

   /** The linked product code. */
   private String linkedProductCode;

   /** The t rating. */
   private String tRating;

   /** The trip advisor rating. */
   private String tripAdvisorRating;

   /** The free kid. */
   private String freeKid;

   /** The ship name. */
   private Set<String> shipName = new HashSet<>();;

   /** The group method. */
   private String groupMethod;

   /** The cruise dest. */
   private String cruiseDest;

   /** The stay location. */
   private String stayLocation;

   /** The disc type. */
   private DiscType discType;

   /** The hlo. */
   private String hlo;

   /** The tpa. */
   private String tpa;

   /** The tpf. */
   private String tpf;

   /** The response type. */
   private String responseType;

   /** The page type. */
   private String pageType;

   /** The pkg date. */
   private String pkgDate;

   /** The pkg airport. */
   private String pkgAirport;

   /** The pkg info. */
   private String pkgInfo;

   /** The pkg. */
   private String pkg;

   /** The tra O. */
   private String traO;

   /** The tra I. */
   private String traI;

   /** The available airports string. */
   private String availableAirportsString;

   /** The brws. */
   private String brws;

   /** The destinations. */
   private Set<Destination> destinations = new HashSet<>();

   /** The cabin class. */
   private String cabinClass;

   /** The accom name. */
   private Set<String> accomName = new HashSet<>();

   /** The holiday sub type. */
   private Set<String> holidaySubType = new HashSet<>();

   /** The type. */
   private Set<String> type = new HashSet<>();

   /** The list durations. */
   private String listDurations;

   /** The init start date. */
   private String initStartDate;

   /** The init end date. */
   private String initEndDate;

   /** The holiday type set. */
   private Set<String> holidayTypeSet = new HashSet<>();

   /** The holiday type agg flag. */
   protected Boolean holidayTypeAggFlag = false;

   /** The product range agg flag. */
   protected Boolean productRangeAggFlag = false;

   /** The stay param. */
   private String stayParam;

   /** The language. */
   private String language;

   /** The accommodationTypeSet. */
   private Set<String> accommodationTypeSet = new HashSet<>();

   /** The holidayOperator. */
   private Set<String> holidayOperator = new HashSet<>();

   /** Deals PageID */
   private String pageID;

   private String requestType;

   private String pageNumber;

   private String requestUri;
   
   private String sType;
   
   /** Deals seasonYear   */
   private String seasonYear;
   
   /** Deals type1Duration   */
   private String type1Duration;

   /**
    * Gets the cruise dest.
    *
    * @return the cruiseDest
    */
   
   public String getCruiseDest()
   {
      return cruiseDest;
   }

   /**
    * Sets the cruise dest.
    *
    * @param cruiseDest the cruiseDest to set
    */
   
   public void setCruiseDest(String cruiseDest)
   {
      this.cruiseDest = cruiseDest;
   }

   /**
    * Gets the stay location.
    *
    * @return the stayLocation
    */
   
   public String getStayLocation()
   {
      return stayLocation;
   }

   /**
    * Sets the stay location.
    *
    * @param stayLocation the stayLocation to set
    */
   
   public void setStayLocation(String stayLocation)
   {
      this.stayLocation = stayLocation;
   }

   /**
    * Gets the ship name.
    *
    * @return the shipName
    */
   
   public Set<String> getShipName()
   {
      return shipName;
   }

   /**
    * Sets the ship name.
    *
    * @param shipName the shipName to set
    */
   
   public void setShipName(Set<String> shipName)
   {
      this.shipName = shipName;
   }

   /**
    * Gets the dep airports.
    *
    * @return the depAirports
    */

   public Set<String> getDepAirports()
   {
      return depAirports;
   }

   /**
    * Sets the dep airports.
    *
    * @param depAirports the depAirports to set
    */
   public void setDepAirports(Set<String> depAirports)
   {
      this.depAirports = depAirports;
   }

   /**
    * Gets the dest airports.
    *
    * @return the destAirports
    */
   public Set<String> getDestAirports()
   {
      return destAirports;
   }

   /**
    * Sets the dest airports.
    *
    * @param destAirports the destAirports to set
    */
   public void setDestAirports(Set<String> destAirports)
   {
      this.destAirports = destAirports;
   }

   /**
    * Gets the when.
    *
    * @return the when
    */
   public String getWhen()
   {
      return when;
   }

   /**
    * Sets the when.
    *
    * @param when the when to set
    */
   public void setWhen(String when)
   {
      this.when = when;
   }

   /**
    * Gets the search key.
    *
    * @return the searchKey
    */
   public String getSearchKey()
   {
      return searchKey;
   }

   /**
    * Sets the search key.
    *
    * @param searchKey the searchKey to set
    */
   public void setSearchKey(String searchKey)
   {
      this.searchKey = searchKey;
   }

   /**
    * Gets the top collections.
    *
    * @return the topCollections
    */
   public Set<String> getTopCollections()
   {
      return topCollections;
   }

   /**
    * Sets the top collections.
    *
    * @param topCollections the topCollections to set
    */
   public void setTopCollections(Set<String> topCollections)
   {
      this.topCollections = topCollections;
   }

   /**
    * Gets the req type.
    *
    * @return the reqType
    */
   public String getReqType()
   {
      return reqType;
   }

   /**
    * Sets the req type.
    *
    * @param reqType the reqType to set
    */
   public void setReqType(String reqType)
   {
      this.reqType = reqType;
   }

   /**
    * Gets the flexible.
    *
    * @return the flexible
    */
   public String getFlexible()
   {
      return flexible;
   }

   /**
    * Sets the flexible.
    *
    * @param flexible the flexible to set
    */
   public void setFlexible(String flexible)
   {
      this.flexible = flexible;
   }

   /**
    * Gets the multi select.
    *
    * @return the multiSelect
    */
   public String getMultiSelect()
   {
      return multiSelect;
   }

   /**
    * Sets the multi select.
    *
    * @param multiSelect the multiSelect to set
    */
   public void setMultiSelect(String multiSelect)
   {
      this.multiSelect = multiSelect;
   }

   /**
    * Gets the checks if is one way.
    *
    * @return the isOneWay
    */
   public Boolean getIsOneWay()
   {
      return isOneWay;
   }

   /**
    * Sets the checks if is one way.
    *
    * @param isOneWay the isOneWay to set
    */
   public void setIsOneWay(Boolean isOneWay)
   {
      this.isOneWay = isOneWay;
   }

   /**
    * Gets the start date.
    *
    * @return the startDate
    */
   public String getStartDate()
   {
      return startDate;
   }

   /**
    * Sets the start date.
    *
    * @param startDate the startDate to set
    */
   public void setStartDate(String startDate)
   {
      this.startDate = startDate;
   }

   /**
    * Gets the end date.
    *
    * @return the endDate
    */
   public String getEndDate()
   {
      return endDate;
   }

   /**
    * Sets the end date.
    *
    * @param endDate the endDate to set
    */
   public void setEndDate(String endDate)
   {
      this.endDate = endDate;
   }

   /**
    * Gets the month.
    *
    * @return the month
    */
   public String getMonth()
   {
      return month;
   }

   /**
    * Sets the month.
    *
    * @param month the month to set
    */
   public void setMonth(String month)
   {
      this.month = month;
   }

   /**
    * Gets the days.
    *
    * @return the days
    */
   public String getDays()
   {
      return days;
   }

   /**
    * Sets the days.
    *
    * @param days the days to set
    */
   public void setDays(String days)
   {
      this.days = days;
   }

   /**
    * Gets the years.
    *
    * @return the years
    */
   public String getYears()
   {
      return years;
   }

   /**
    * Sets the years.
    *
    * @param years the years to set
    */
   public void setYears(String years)
   {
      this.years = years;
   }

   /**
    * Gets the deals flag.
    *
    * @return the dealsFlag
    */
   public String getDealsFlag()
   {
      return dealsFlag;
   }

   /**
    * Sets the deals flag.
    *
    * @param dealsFlag the dealsFlag to set
    */
   public void setDealsFlag(String dealsFlag)
   {
      this.dealsFlag = dealsFlag;
   }

   /**
    * Gets the top destinations.
    *
    * @return the topDestinations
    */
   public Set<String> getTopDestinations()
   {
      return topDestinations;
   }

   /**
    * Sets the top destinations.
    *
    * @param topDestinations the topDestinations to set
    */
   public void setTopDestinations(Set<String> topDestinations)
   {
      this.topDestinations = topDestinations;
   }

   /**
    * Gets the adds the A stay.
    *
    * @return the addAStay
    */
   public String getAddAStay()
   {
      return addAStay;
   }

   /**
    * Sets the adds the A stay.
    *
    * @param addAStay the addAStay to set
    */
   public void setAddAStay(String addAStay)
   {
      this.addAStay = addAStay;
   }

   /**
    * Gets the duration.
    *
    * @return the duration
    */
   public String getDuration()
   {
      return duration;
   }

   /**
    * Sets the duration.
    *
    * @param duration the duration to set
    */
   public void setDuration(String duration)
   {
      this.duration = duration;
   }

   /**
    * Gets the rules request.
    *
    * @return the rulesRequest
    */
   public RulesRequest getRulesRequest()
   {
      return this.rulesRequest;
   }

   /**
    * Gets the query map.
    *
    * @return the queryMap
    */
   public Map<String, List<String>> getQueryMap()
   {
      if (org.apache.commons.collections4.MapUtils.isEmpty(queryMap))
      {
         return new HashMap<>();
      }
      return queryMap;
   }

   /**
    * Sets the query map.
    *
    * @param queryMap the queryMap to set
    */
   public void setQueryMap(Map<String, List<String>> queryMap)
   {
      this.queryMap = queryMap;
   }

   /**
    * Gets the brand.
    *
    * @return the brand
    */
   
   public Set<String> getBrand()
   {
      return brand;
   }

   /**
    * Sets the brand.
    *
    * @param brand the brand to set
    */
   
   public void setBrand(Set<String> brand)
   {
      this.brand = brand;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setRoomCount(int)
    */
   
   public void setRoomCount(int roomCount)
   {
      this.roomCount = roomCount;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#
    * setLatestDepartureDateString(java.lang. String)
    */
   
   public void setLatestDepartureDateString(String latestDepartureDateString)
   {
      this.latestDepartureDateString = latestDepartureDateString;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#
    * setEarliestDepartureDateString(java.lang. String)
    */
   
   public void setEarliestDepartureDateString(String earliestDepartureDateString)
   {
      this.earliestDepartureDateString = earliestDepartureDateString;

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setDurationsString(java. lang.String)
    */
   
   public void setDurationsString(String durationsString)
   {
      this.durationsString = durationsString;

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setDepartureAirportsString (java.lang.
    * String)
    */
   
   public void setDepartureAirportsString(String departureAirportsString)
   {
      this.departureAirportsString = departureAirportsString;

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setChildAges(int[])
    */
   
   public void setChildAges(int[] childAges)
   {
      int[] tmp = Arrays.copyOf(childAges, childAges.length);
      this.childAges = tmp;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setAdultPax(int)
    */
   
   public void setAdultPax(int adultPax)
   {
      this.adultPax = adultPax;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setDateFormatPattern(java.
    * lang.String)
    */
   
   public void setDateFormatPattern(String dateFormatPattern)
   {
      this.dateFormatPattern = dateFormatPattern;
      this.dateFormats = new DateFormatPatterns();

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setAccommodationsString(
    * java.lang.String)
    */
   
   public void setAccommodationsString(String accommodationsString)
   {
      this.accommodationsString = accommodationsString;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setAccommodations(java. lang.String[])
    */
   
   public void setAccommodations(String[] accommodations)
   {
      setAccommodationsString(StringUtils.join(accommodations, ','));
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setAccommodations(java.
    * util.Collection)
    */
   
   public void setAccommodations(Collection<String> accommodations)
   {
      this.accommodations = accommodations;
      setAccommodationsString(StringUtils.join(accommodations, ','));
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setFaceting(boolean)
    */
   
   public void setFaceting(boolean facetingActive)
   {
      getPassthroughMap().put(PASSTHROUGH_PARAM_FACETING, facetingActive ? "Y" : "N");

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setMarket(java.lang. String)
    */
   
   public void setMarket(String market)
   {
      this.market = market;

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setPromotionsString(java. lang.String)
    */
   
   public void setPromotionsString(String promotionsString)
   {
      this.promotionsString = promotionsString;
      this.promotions = null;

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setPromotions(java.lang. String[])
    */
   
   public synchronized void setPromotions(String... promotionStrings)
   {
      this.promotions = promotionStrings;
      this.promotionsString = null;

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setBoardBasis(java.lang. String)
    */
   
   public void setBoardBasis(String boardBasis)
   {
      this.boardBasis = boardBasis;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setDreamLiner(java.lang. String)
    */
   
   public void setDreamLiner(String dreamLiner)
   {
      this.dreamLiner = dreamLiner;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#
    * setCandidateDurationsString(java.lang. String)
    */
   
   public void setCandidateDurationsString(String durations)
   {
      this.candidateDurationsString = durations;

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setSearchType(java.lang. String)
    */
   
   public void setSearchType(String searchTypeString)
   {
      this.searchType = searchTypeString;

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setSiteId(java.lang. String)
    */
   
   public void setSiteId(String siteId)
   {
      this.siteId = siteId;

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setCruiseStayDuration(java
    * .lang.String)
    */
   
   public void setCruiseStayDuration(String cruiseStayDuration)
   {
      this.cruiseStayDuration = cruiseStayDuration;

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setCruiseAccomDuration(
    * java.lang.String)
    */
   
   public void setCruiseAccomDuration(String cruiseAccomDuration)
   {
      this.cruiseAccomDuration = cruiseAccomDuration;

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setCruiseOrder(java.lang. String)
    */
   
   public void setCruiseOrder(String cruiseOrder)
   {
      this.cruiseOrder = cruiseOrder;

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getEarliestDepartureDate()
    */
   
   public Date getEarliestDepartureDate() throws ParseException
   {
      return getDateFormat().parse(getEarliestDepartureDateString());
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getDateFormatPattern()
    */
   
   public String getDateFormatPattern()
   {
      return dateFormatPattern;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getPassthroughMap()
    */
   
   public Map<String, String> getPassthroughMap()
   {
      return passthroughMap;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#isFaceting()
    */
   
   public boolean isFaceting()
   {
      return StringUtils.equals(getPassthroughMap().get(PASSTHROUGH_PARAM_FACETING), "Y");
   }

   /**
    * Gets the board basis.
    *
    * @return the boardBasis
    */
   
   public String getBoardBasis()
   {
      return boardBasis;
   }

   /**
    * Gets the dream liner.
    *
    * @return the dreamLiner
    */
   
   public String getDreamLiner()
   {
      return dreamLiner;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getAccommodationsString()
    */
   
   public String getAccommodationsString()
   {
      return accommodationsString;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getAccommodationsCount()
    */
   
   public int getAccommodationsCount()
   {
      String strings = getAccommodationsString();
      if (null == strings)
      {
         return 0;
      }
      else
      {
         return strings.split(",").length;
      }
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getDepartureAirportsString ()
    */
   
   public String getDepartureAirportsString()
   {
      return departureAirportsString;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getAdultPax()
    */
   
   public int getAdultPax()
   {
      return adultPax;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getChildAges()
    */
   
   public int[] getChildAges()
   {
      return this.childAges;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getRoomCount()
    */
   
   public int getRoomCount()
   {
      return this.roomCount;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters# getEarliestDepartureDateString()
    */
   
   public String getEarliestDepartureDateString()
   {
      return earliestDepartureDateString;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters# getLatestDepartureDateString()
    */
   
   public String getLatestDepartureDateString()
   {
      return latestDepartureDateString;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getDurationsString()
    */
   
   public String getDurationsString()
   {
      return durationsString;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getMarket()
    */
   
   public String getMarket()
   {
      return this.market;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getPromotionsString()
    */
   
   public String getPromotionsString()
   {
      return this.promotionsString;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getPromotionsCount()
    */
   
   public int getPromotionsCount()
   {
      return null == getPromotions() ? 0 : getPromotions().length;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getSearchType()
    */
   
   public String getSearchType()
   {
      return this.searchType;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getCruiseStayDuration()
    */
   
   public String getCruiseStayDuration()
   {
      return this.cruiseStayDuration;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getCruiseAccomDuration()
    */
   
   public String getCruiseAccomDuration()
   {
      return this.cruiseAccomDuration;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getCruiseOrder()
    */
   
   public String getCruiseOrder()
   {
      return this.cruiseOrder;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getSiteId()
    */
   
   public String getSiteId()
   {
      return this.siteId;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setEarliestDepartureDate(
    * java.util.Date)
    */
   
   public void setEarliestDepartureDate(Date startDate)
   {
      setEarliestDepartureDateString(getDateFormat().format(startDate));
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setLatestDepartureDate(
    * java.util.Date)
    */
   
   public void setLatestDepartureDate(Date date)
   {
      setLatestDepartureDateString(getDateFormat().format(date));
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getAccommodations()
    */
   
   public Collection<String> getAccommodations()
   {
      return this.accommodations;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getPromotions()
    */
   public synchronized String[] getPromotions()
   {
      if (null == promotions)
      {
         promotions = StringUtils.split(promotionsString, ',');
      }
      return promotions;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setHolidayTypeString(java.
    * lang.String)
    */
   
   public void setHolidayTypeString(String holidayType)
   {
      setHolidayType(HolidayType.valueOf(holidayType));
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getHolidayType()
    */
   public HolidayType getHolidayType()
   {
      return holidayType;
   }

   /**
    * Sets the holiday type.
    *
    * @param holidayType the new holiday type
    */
   public void setHolidayType(HolidayType holidayType)
   {
      this.holidayType = holidayType;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setChildAgeStrings(java.
    * lang.String[])
    */
   
   public void setChildAgeStrings(String[] ageStrings)
   {
      int[] newAges = new int[ageStrings.length];
      for (int i = 0; i < ageStrings.length; i++)
      {
         newAges[i] = Integer.parseInt(ageStrings[i]);
      }
      setChildAges(newAges);
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setDepartureAirports(java.
    * lang.String[])
    */
   
   public void setDepartureAirports(String[] airports)
   {
      setDepartureAirportsString(StringUtils.join(airports, ','));
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setDurations(java.lang. String[])
    */
   
   public void setDurations(String[] durations)
   {
      setDurationsString(StringUtils.join(durations, ','));
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters# getCandidateDurationsString()
    */
   
   public String getCandidateDurationsString()
   {
      return candidateDurationsString;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getAniteQueryType()
    */
   
   public int getAniteQueryType()
   {
      return aniteQueryType;
   }

   /**
    * Sets the anite query type.
    *
    * @param aniteQueryType the aniteQueryType to set
    */
   
   public void setAniteQueryType(int aniteQueryType)
   {
      this.aniteQueryType = aniteQueryType;
   }

   /**
    * Gets the first rec num.
    *
    * @return the firstRecNum
    */
   
   public String getFirstRecNum()
   {
      return firstRecNum;
   }

   /**
    * Sets the first rec num.
    *
    * @param firstRecNum the firstRecNum to set
    */
   
   public void setFirstRecNum(String firstRecNum)
   {
      this.firstRecNum = firstRecNum;
   }

   /**
    * Gets the rec per page.
    *
    * @return the recPerPage
    */
   
   public String getRecPerPage()
   {
      return recPerPage;
   }

   /**
    * Sets the rec per page.
    *
    * @param recPerPage the recPerPage to set
    */
   
   public void setRecPerPage(String recPerPage)
   {
      this.recPerPage = recPerPage;
   }

   /**
    * Sets the passthrough map.
    *
    * @param passthroughMap the passthroughMap to set
    */
   public void setPassthroughMap(Map<String, String> passthroughMap)
   {
      this.passthroughMap = passthroughMap;
   }

   public void setRequestUri(String requestUri)
   {
      this.requestUri = requestUri;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setRuleRequest(com.tui.uk.
    * search.packages. pojos.RulesRequest)
    */
   
   public void setRulesRequest(RulesRequest rulesRequest)
   {
      this.rulesRequest = rulesRequest;
   }

   /**
    * Gets the child age.
    *
    * @return the child age
    */
   public String getChildAge()
   {
      return childAge;
   }

   /**
    * Sets the child age.
    *
    * @param childAge the new child age
    */
   public void setChildAge(String childAge)
   {
      this.childAge = childAge;
   }

   /**
    * Gets the main search type.
    *
    * @return the mainSearchType
    */
   
   public String getMainSearchType()
   {
      return mainSearchType;
   }

   /**
    * Sets the main search type.
    *
    * @param mainSearchType the mainSearchType to set
    */
   
   public void setMainSearchType(String mainSearchType)
   {
      this.mainSearchType = mainSearchType;
   }

   /**
    * Gets the holiday category.
    *
    * @return the holidayCategory
    */
   
   public String getHolidayCategory()
   {
      return holidayCategory;
   }

   /**
    * Sets the holiday category.
    *
    * @param holidayCategory the holidayCategory to set
    */
   
   public void setHolidayCategory(String holidayCategory)
   {
      this.holidayCategory = holidayCategory;
   }

   /**
    * Gets the date format.
    *
    * @return the date format
    */
   public DateFormat getDateFormat()
   {
      return dateFormats.get();
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getSessionId()
    */
   
   public String getSessionId()
   {
      return sessionId;
   }

   
   public void setSessionId(String sessionId)
   {
      this.sessionId = sessionId;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getCacheEnable()
    */
   
   public String getCacheEnable()
   {
      return cacheEnable;
   }

   
   public void setCacheEnable(String cacheEnable)
   {
      this.cacheEnable = cacheEnable;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getSystemInfo()
    */
   
   public String getSystemInfo()
   {
      return systemInfo;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setSystemInfo(java.lang. String)
    */
   
   public void setSystemInfo(String systemInfo)
   {
      this.systemInfo = systemInfo;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getAniteRequest()
    */
   
   public String getAniteRequest()
   {
      return aniteRequest;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setAniteRequest(java.lang. String)
    */
   
   public void setAniteRequest(String aniteRequest)
   {
      this.aniteRequest = aniteRequest;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getTemplateId()
    */
   public String getTemplateId()
   {
      return templateId;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setTemplateId(java.lang. String)
    */
   public void setTemplateId(String templateId)
   {
      this.templateId = templateId;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getStopOver()
    */
   
   public String getStopOver()
   {
      return stopOver;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setStopOver(java.lang. String)
    */
   
   public void setStopOver(String stopOver)
   {
      this.stopOver = stopOver;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getCruiseType()
    */
   
   public String getCruiseType()
   {
      return cruiseType;
   }

   /**
    * Sets the cruise type.
    *
    * @param cruiseType the new cruise type
    */
   
   public void setCruiseType(String cruiseType)
   {
      this.cruiseType = cruiseType;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getRequestType()
    */
   
   public String getRequestType()
   {
      return requestType;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getHlo()
    */
   
   public String getHlo()
   {
      return this.hlo;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getTpa()
    */
   
   public String getTpa()
   {
      return this.tpa;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getAniteSearchType()
    */
   
   public String getAniteSearchType()
   {
      return null;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getReqSdate()
    */
   
   public String getReqSdate()
   {
      return null;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getReqEdate()
    */
   
   public String getReqEdate()
   {
      return null;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getMerchandiseDurations()
    */
   
   public String getMerchandiseDurations()
   {
      return null;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getPageNumber()
    */
   
   public String getPageNumber()
   {
      return pageNumber;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getSeasonYear()
    */
   
   public String getSeasonYear()
   {
      return this.seasonYear;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getType1Duration()
    */
   
   public String getType1Duration()
   {
      return this.type1Duration;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getMinDisc()
    */
   
   public String getMinDisc()
   {
      return null;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getMaxDisc()
    */
   
   public String getMaxDisc()
   {
      return null;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getRequestUri()
    */
   
   public String getRequestUri()
   {
      return requestUri;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getCabin()
    */
   public String getCabin()
   {
      return cabin;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setCabin(java.lang.String)
    */
   public void setCabin(String cabin)
   {
      this.cabin = cabin;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getCruiseTrai()
    */
   public String getCruiseTrai()
   {
      return cruiseTrai;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setCruiseTrai(java.lang. String)
    */
   public void setCruiseTrai(String cruiseTrai)
   {
      this.cruiseTrai = cruiseTrai;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getCruiseTrao()
    */
   public String getCruiseTrao()
   {
      return cruiseTrao;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setCruiseTrao(java.lang. String)
    */
   public void setCruiseTrao(String cruiseTrao)
   {
      this.cruiseTrao = cruiseTrao;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getSeats()
    */
   public String getSeats()
   {
      return seats;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setSeats(java.lang.String)
    */
   public void setSeats(String seats)
   {
      this.seats = seats;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getF()
    */
   public String getFacetParam()
   {
      return facetParam;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setF(java.lang.String)
    */
   public void setFacetParam(String f)
   {
      this.facetParam = f;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getHolidayTypeString()
    */
   
   public String getHolidayTypeString()
   {
      if (holidayType != null)
      {
         return this.holidayType.toString();
      }
      return null;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getSortingParameter()
    */
   
   public String getSortingParameter()
   {
      return this.sortingParameter;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setSortingParameter(java. lang.String)
    */
   
   public void setSortingParameter(String ns)
   {
      this.sortingParameter = ns;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getRooms()
    */
   
   public String getRooms()
   {
      return rooms;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setRooms(java.lang.String)
    */
   public void setRooms(String rooms)
   {
      this.rooms = rooms;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setRoom(java.lang.String)
    */
   
   public void setRoom(String room)
   {
      this.room = room;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getRoom()
    */
   
   public String getRoom()
   {
      return this.room;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setRoomBB(java.lang. String)
    */
   
   public void setRoomBB(String roombb)
   {
      this.roombb = roombb;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getRoomBB()
    */
   
   public String getRoomBB()
   {
      return this.roombb;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getChannel()
    */
   
   public String getChannel()
   {
      return this.channel;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setChannel(java.lang. String)
    */
   
   public void setChannel(String channel)
   {
      this.channel = channel;

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setPageName(java.lang. String)
    */
   
   public void setPageName(String pageName)
   {
      this.pageName = pageName;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getPageName()
    */
   
   public String getPageName()
   {
      return this.pageName;
   }

   /**
    * Gets the product range.
    *
    * @return the productRange
    */
   public Set<String> getProductRange()
   {
      return productRange;
   }

   /**
    * Sets the product range.
    *
    * @param productRange the productRange to set
    */
   public void setProductRange(Set<String> productRange)
   {
      this.productRange = productRange;
   }

   /**
    * Gets the best for.
    *
    * @return the bestFor
    */
   
   public Set<String> getBestFor()
   {
      return bestFor;
   }

   /**
    * Sets the best for.
    *
    * @param bestFor the bestFor to set
    */
   
   public void setBestFor(Set<String> bestFor)
   {
      this.bestFor = bestFor;
   }

   /**
    * Gets the item type.
    *
    * @return the itemType
    */
   public String getItemType()
   {
      return itemType;
   }

   /**
    * Sets the item type.
    *
    * @param itemType the itemType to set
    */
   public void setItemType(String itemType)
   {
      this.itemType = itemType;
   }

   /**
    * Gets the item sub type.
    *
    * @return the itemSubType
    */
   public String getItemSubType()
   {
      return itemSubType;
   }

   /**
    * Sets the item sub type.
    *
    * @param itemSubType the itemSubType to set
    */
   public void setItemSubType(String itemSubType)
   {
      this.itemSubType = itemSubType;
   }

   /**
    * Gets the accom features.
    *
    * @return the accomFeatures
    */
   
   public Set<String> getAccomFeatures()
   {
      return accomFeatures;
   }

   /**
    * Sets the accom features.
    *
    * @param accomFeatures the accomFeatures to set
    */
   
   public void setAccomFeatures(Set<String> accomFeatures)
   {
      this.accomFeatures = accomFeatures;
   }

   /**
    * Gets the hotel type.
    *
    * @return the hotelType
    */
   public String getHotelType()
   {
      return hotelType;
   }

   /**
    * Sets the hotel type.
    *
    * @param hotelType the hotelType to set
    */
   public void setHotelType(String hotelType)
   {
      this.hotelType = hotelType;
   }

   /**
    * Gets the arr airport.
    *
    * @return the arrAirport
    */
   public Set<String> getArrAirport()
   {
      return arrAirport;
   }

   /**
    * Sets the arr airport.
    *
    * @param arrAirport the arrAirport to set
    */
   public void setArrAirport(Set<String> arrAirport)
   {
      this.arrAirport = arrAirport;
   }

   /**
    * Gets the dep port.
    *
    * @return the depPort
    */
   public String getDepPort()
   {
      return depPort;
   }

   /**
    * Sets the dep port.
    *
    * @param depPort the depPort to set
    */
   public void setDepPort(String depPort)
   {
      this.depPort = depPort;
   }

   /**
    * Gets the cabin only.
    *
    * @return the cabinOnly
    */
   public String getCabinOnly()
   {
      return cabinOnly;
   }

   /**
    * Sets the cabin only.
    *
    * @param cabinOnly the cabinOnly to set
    */
   public void setCabinOnly(String cabinOnly)
   {
      this.cabinOnly = cabinOnly;
   }

   /**
    * Gets the uk port.
    *
    * @return the uKPort
    */
   public String getUkPort()
   {
      return ukPort;
   }

   /**
    * Sets the uk port.
    *
    * @param ukPort the new uk port
    */
   public void setUkPort(String ukPort)
   {
      this.ukPort = ukPort;
   }

   /**
    * Gets the linked product code.
    *
    * @return the linkedProductCode
    */
   public String getLinkedProductCode()
   {
      return linkedProductCode;
   }

   /**
    * Sets the linked product code.
    *
    * @param linkedProductCode the linkedProductCode to set
    */
   public void setLinkedProductCode(String linkedProductCode)
   {
      this.linkedProductCode = linkedProductCode;
   }

   /**
    * Gets the t rating.
    *
    * @return the tRating
    */
   public String gettRating()
   {
      return tRating;
   }

   /**
    * Sets the t rating.
    *
    * @param tRating the tRating to set
    */
   public void settRating(String tRating)
   {
      this.tRating = tRating;
   }

   /**
    * Gets the trip advisor rating.
    *
    * @return the tripAdvisorRating
    */
   public String getTripAdvisorRating()
   {
      return tripAdvisorRating;
   }

   /**
    * Sets the trip advisor rating.
    *
    * @param tripAdvisorRating the tripAdvisorRating to set
    */
   public void setTripAdvisorRating(String tripAdvisorRating)
   {
      this.tripAdvisorRating = tripAdvisorRating;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setGroupMethod(java.lang. String)
    */
   
   public void setGroupMethod(String groupMethod)
   {
      this.groupMethod = groupMethod;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getGroupMethod()
    */
   
   public String getGroupMethod()
   {
      return groupMethod;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getDiscType()
    */
   public DiscType getDiscType()
   {
      return discType;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setDiscType(com.tui.uk.
    * search.packages. pojos.DiscType)
    */
   public void setDiscType(DiscType discType)
   {
      this.discType = discType;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setHlo(java.lang.String)
    */
   public void setHlo(String hlo)
   {
      this.hlo = hlo;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setTpa(java.lang.String)
    */
   public void setTpa(String tpa)
   {
      this.tpa = tpa;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getResponseType()
    */
   
   public String getResponseType()
   {
      return responseType;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setResponseType(java.lang. String)
    */
   
   public void setResponseType(String responseType)
   {
      this.responseType = responseType;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getPageType()
    */
   
   public String getPageType()
   {
      return pageType;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setPageType(java.lang. String)
    */
   
   public void setPageType(String pageType)
   {
      this.pageType = pageType;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getPackageDateString()
    */
   
   public String getPackageDateString()
   {
      return pkgDate;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setPackageDateString(java.
    * lang.String)
    */
   
   public void setPackageDateString(String pkgDate)
   {
      this.pkgDate = pkgDate;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getPackageAirport()
    */
   
   public String getPackageAirport()
   {
      return pkgAirport;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setPackageAirport(java. lang.String)
    */
   
   public void setPackageAirport(String pkgAirport)
   {
      this.pkgAirport = pkgAirport;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getPackageInfo()
    */
   
   public String getPackageInfo()
   {
      return pkgInfo;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setPackageInfo(java.lang. String)
    */
   
   public void setPackageInfo(String pkgInfo)
   {
      this.pkgInfo = pkgInfo;

   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setTpf(java.lang.String)
    */
   
   public void setTpf(String tpf)
   {
      this.tpf = tpf;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getTpf()
    */
   public String getTpf()
   {
      return tpf;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setPkg(java.lang.String)
    */
   
   public void setPkg(String pkg)
   {
      this.pkg = pkg;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getPkg()
    */
   
   public String getPkg()
   {
      return pkg;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setTraO(java.lang.String)
    */
   
   public void setTraO(String traO)
   {
      this.traO = traO;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getTraO()
    */
   
   public String getTraO()
   {
      return traO;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setTraI(java.lang.String)
    */
   
   public void setTraI(String traI)
   {
      this.traI = traI;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getTraI()
    */
   
   public String getTraI()
   {
      return traI;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setBrws(java.lang.String)
    */
   
   public void setBrws(String brws)
   {
      this.brws = brws;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getBrws()
    */
   
   public String getBrws()
   {
      return brws;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setAvailableAirports(java.
    * lang.String[])
    */
   
   public void setAvailableAirports(String[] availableAirports)
   {
      setAvailableAirportsString(StringUtils.join(availableAirports, ','));
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setAvailableAirportsString (java.lang.
    * String)
    */
   
   public void setAvailableAirportsString(String availableAirportsString)
   {
      this.availableAirportsString = availableAirportsString;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getAvailableAirportsString ()
    */
   
   public String getAvailableAirportsString()
   {
      return availableAirportsString;
   }

   /**
    * Gets the destinations.
    *
    * @return the destinations
    */
   
   public Set<Destination> getDestinations()
   {
      return destinations;
   }

   /**
    * Sets the destinations.
    *
    * @param destinations the destinations to set
    */
   public void setDestinations(Set<Destination> destinations)
   {
      this.destinations = destinations;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setCabinClass(java.lang. String)
    */
   public void setCabinClass(String cabinClass)
   {
      this.cabinClass = cabinClass;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getCabinClass()
    */
   
   public String getCabinClass()
   {
      return cabinClass;
   }

   /**
    * Gets the accom name.
    *
    * @return the accomName
    */
   
   public Set<String> getAccomName()
   {
      return accomName;
   }

   /**
    * Sets the accom name.
    *
    * @param accomName the accomName to set
    */
   
   public void setAccomName(Set<String> accomName)
   {
      this.accomName = accomName;
   }

   /**
    * Gets the holiday sub type.
    *
    * @return the holidaySubType
    */
   
   public Set<String> getHolidaySubType()
   {
      return holidaySubType;
   }

   /**
    * Sets the holiday sub type.
    *
    * @param holidaySubType the holidaySubType to set
    */
   
   public void setHolidaySubType(Set<String> holidaySubType)
   {
      this.holidaySubType = holidaySubType;
   }

   /**
    * Gets the type.
    *
    * @return the type
    */
   
   public Set<String> getType()
   {
      return type;
   }

   /**
    * Sets the type.
    *
    * @param type the type to set
    */
   
   public void setType(Set<String> type)
   {
      this.type = type;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getListDurations()
    */
   /*
    * @return the listDurations
    */
   
   public String getListDurations()
   {
      return listDurations;
   }

   /**
    * Sets the list durations.
    *
    * @param listDurations the listDurations to set
    */
   
   public void setListDurations(String listDurations)
   {
      this.listDurations = listDurations;
   }

   /**
    * Gets the inits the start date.
    *
    * @return the initStartDate
    */
   
   public String getInitStartDate()
   {
      return initStartDate;
   }

   /**
    * Sets the inits the start date.
    *
    * @param initStartDate the initStartDate to set
    */
   
   public void setInitStartDate(String initStartDate)
   {
      this.initStartDate = initStartDate;
   }

   /**
    * Gets the inits the end date.
    *
    * @return the initEndDate
    */
   
   public String getInitEndDate()
   {
      return initEndDate;
   }

   /**
    * Sets the inits the end date.
    *
    * @param initEndDate the initEndDate to set
    */
   
   public void setInitEndDate(String initEndDate)
   {
      this.initEndDate = initEndDate;
   }

   /**
    * Gets the holiday type set.
    *
    * @return the holidayTypeSet
    */
   
   public Set<String> getHolidayTypeSet()
   {
      return holidayTypeSet;
   }

   /**
    * Sets the holiday type set.
    *
    * @param holidayTypeSet the holidayTypeSet to set
    */
   
   public void setHolidayTypeSet(Set<String> holidayTypeSet)
   {
      this.holidayTypeSet = holidayTypeSet;
   }

   /**
    * Gets the holiday type agg flag.
    *
    * @return the holidayTypeAggFlag
    */
   
   public Boolean getHolidayTypeAggFlag()
   {
      return holidayTypeAggFlag;
   }

   /**
    * Sets the holiday type agg flag.
    *
    * @param holidayTypeAggFlag the holidayTypeAggFlag to set
    */
   
   public void setHolidayTypeAggFlag(Boolean holidayTypeAggFlag)
   {
      this.holidayTypeAggFlag = holidayTypeAggFlag;
   }

   /**
    * Gets the product range agg flag.
    *
    * @return the productRangeAggFlag
    */
   
   public Boolean getProductRangeAggFlag()
   {
      return productRangeAggFlag;
   }

   /**
    * Sets the product range agg flag.
    *
    * @param productRangeAggFlag the productRangeAggFlag to set
    */
   
   public void setProductRangeAggFlag(Boolean productRangeAggFlag)
   {
      this.productRangeAggFlag = productRangeAggFlag;
   }

   /**
    * Gets the stay param.
    *
    * @return the stayParam
    */
   
   public String getStayParam()
   {
      return stayParam;
   }

   /**
    * Sets the stay param.
    *
    * @param stayParam the stayParam to set
    */
   
   public void setStayParam(String stayParam)
   {
      this.stayParam = stayParam;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getPriceType()
    */
   public String getPriceType()
   {
      return priceType;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setPriceType(java.lang. String)
    */
   public void setPriceType(String priceType)
   {
      this.priceType = priceType;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getFreeKid()
    */
   public String getFreeKid()
   {
      return freeKid;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#setFreeKid(java.lang. String)
    */
   public void setFreeKid(String freeKid)
   {
      this.freeKid = freeKid;
   }

   /*
    * (non-Javadoc)
    * 
    * @see com.tui.uk.search.packages.pojos.RequestParameters#getRating()
    */
   public String getRating()
   {
      return rating;
   }

   /**
    * Sets the rating.
    *
    * @param rating the new rating
    */
   public void setRating(String rating)
   {
      this.rating = rating;
   }

   /**
    * Gets the language.
    *
    * @return the language
    */
   
   public String getLanguage()
   {
      return language;
   }

   /**
    * Sets the language.
    *
    * @param language the language to set
    */
   
   public void setLanguage(String language)
   {
      this.language = language;
   }

   /**
    * Gets the accommodationType set.
    *
    * @return the accommodationType set
    */

   public Set<String> getAccommodationTypeSet()
   {
      return accommodationTypeSet;
   }

   /**
    * Sets the accommodationType set.
    *
    * @param accommodationTypeSet the new accommodationType set
    */

   public void setAccommodationTypeSet(Set<String> accommodationTypeSet)
   {
      this.accommodationTypeSet = accommodationTypeSet;
   }

   /**
    * @return the holidayOperator
    */
   public Set<String> getHolidayOperator()
   {
      return holidayOperator;
   }

   /**
    * @param holidayOperator the holidayOperator to set
    */
   public void setHolidayOperator(Set<String> holidayOperator)
   {
      this.holidayOperator = holidayOperator;
   }

   /**
    * Get the PageID
    */
   public String getPageID()
   {
      return pageID;
   }

   /**
    * Set the PageID
    */
   public void setPageID(String pageID)
   {
      this.pageID = pageID;
   }

   
   public void setRequestType(String requestType)
   {
      this.requestType = requestType;
   }

   public String getCacheName()
   {
      return cacheName;
   }

   public void setCacheName(String cacheName)
   {
      this.cacheName = cacheName;
   }

   public void setPageNumber(String pageNumber)
   {
      this.pageNumber = pageNumber;
   }

   public String getsType()
   {
      return sType;
   }

   public void setsType(String sType)
   {
      this.sType = sType;
   }
   
   /**
    * set SeasonYear
    */
   public void setSeasonYear(String seasonYear)
   {
      this.seasonYear = seasonYear;
   }
   
   /**
    * Set Type1Duration
    */
   public void setType1Duration(String type1Duration)
   {
      this.type1Duration = type1Duration;
   }

}
