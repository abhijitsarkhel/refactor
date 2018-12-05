package com.tui.search.composer.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.tui.search.composer.models.rules.Destination;
import com.tui.search.composer.models.rules.Filter;
import com.tui.search.composer.models.rules.ResultsParamsList;
import com.tui.search.composer.models.rules.Spotlight;

public class RulesRequest
{

   private List<String> name;

   private List<String> code;

   private List<String> brand;

   private List<String> holidaySubType;

   private List<String> feature;

   private String pageName;

   private String url;

   private String adults;

   private String childAges;

   private String dreamLiner;

   private Object boardBasis;

   private String pType;

   private Object maxPrice;

   private String discType;

   private Object minDisc;

   private Object maxDisc;

   private String freeKid;

   private String hlo;

   private String tpa;

   private String tpf;

   private String departureAirports;

   private String startDate;

   private String endDate;

   private Object seasonYear;

   private Object defaultSeasonYear;

   private String durations;

   private String priceRequired;

   private List<String> searchCriteria = null;

   private String datesDuration;

   private String stopOver;

   private List<String> productRange;

   private List<String> itemSubType;

   private List<String> bestFor;

   private List<String> itemType;

   private List<String> tripAdvisorRating;

   private List<String> holidayCategory;

   private List<String> tRating;

   private List<String> facilities;

   private List<Destination> destinations;

   private String cruiseStayDuration;

   private String cruiseAccomDuration;

   private String groupMethod;

   private String promotion;

   List<Filter> filters;

   List<ResultsParamsList> resultsParamsList;

   List<Spotlight> spotlights;
   
   private String title;
   
   public String getPageName()
   {
      return pageName;
   }

   public void setPageName(String pageName)
   {
      this.pageName = pageName;
   }

   public String getUrl()
   {
      return url;
   }

   public void setUrl(String url)
   {
      this.url = url;
   }

   public String getAdults()
   {
      return adults;
   }

   public void setAdults(String adults)
   {
      this.adults = adults;
   }

   public String getChildAges()
   {
      return childAges;
   }

   public void setChildAges(String childAges)
   {
      this.childAges = childAges;
   }

   public String getDreamLiner()
   {
      return dreamLiner;
   }

   public void setDreamLiner(String dreamLiner)
   {
      this.dreamLiner = dreamLiner;
   }

   public Object getBoardBasis()
   {
      return boardBasis;
   }

   public void setBoardBasis(Object boardBasis)
   {
      this.boardBasis = boardBasis;
   }

   public String getpType()
   {
      return pType;
   }

   public void setpType(String pType)
   {
      this.pType = pType;
   }

   public Object getMaxPrice()
   {
      return maxPrice;
   }

   public void setMaxPrice(Object maxPrice)
   {
      this.maxPrice = maxPrice;
   }

   public String getDiscType()
   {
      return discType;
   }

   public void setDiscType(String discType)
   {
      this.discType = discType;
   }

   public Object getMinDisc()
   {
      return minDisc;
   }

   public void setMinDisc(Object minDisc)
   {
      this.minDisc = minDisc;
   }

   public Object getMaxDisc()
   {
      return maxDisc;
   }

   public void setMaxDisc(Object maxDisc)
   {
      this.maxDisc = maxDisc;
   }

   public String getFreeKid()
   {
      return freeKid;
   }

   public void setFreeKid(String freeKid)
   {
      this.freeKid = freeKid;
   }

   public String getHlo()
   {
      return hlo;
   }

   public void setHlo(String hlo)
   {
      this.hlo = hlo;
   }

   public String getTpa()
   {
      return tpa;
   }

   public void setTpa(String tpa)
   {
      this.tpa = tpa;
   }

   public String getTpf()
   {
      return tpf;
   }

   public void setTpf(String tpf)
   {
      this.tpf = tpf;
   }

   public String getDepartureAirports()
   {
      return departureAirports;
   }

   public void setDepartureAirports(String departureAirports)
   {
      this.departureAirports = departureAirports;
   }

   public String getStartDate()
   {
      return startDate;
   }

   public void setStartDate(String startDate)
   {
      this.startDate = startDate;
   }

   public String getEndDate()
   {
      return endDate;
   }

   public void setEndDate(String endDate)
   {
      this.endDate = endDate;
   }

   public Object getSeasonYear()
   {
      return seasonYear;
   }

   public void setSeasonYear(Object seasonYear)
   {
      this.seasonYear = seasonYear;
   }

   public Object getDefaultSeasonYear()
   {
      return defaultSeasonYear;
   }

   public void setDefaultSeasonYear(Object defaultSeasonYear)
   {
      this.defaultSeasonYear = defaultSeasonYear;
   }

   public String getDurations()
   {
      return durations;
   }

   public void setDurations(String durations)
   {
      this.durations = durations;
   }

   public String getPriceRequired()
   {
      return priceRequired;
   }

   public void setPriceRequired(String priceRequired)
   {
      this.priceRequired = priceRequired;
   }

   public List<String> getSearchCriteria()
   {
      return searchCriteria;
   }

   public void setSearchCriteria(List<String> searchCriteria)
   {
      this.searchCriteria = searchCriteria;
   }

   public String getDatesDuration()
   {
      return datesDuration;
   }

   public void setDatesDuration(String datesDuration)
   {
      this.datesDuration = datesDuration;
   }

   public String getStopOver()
   {
      return stopOver;
   }

   public void setStopOver(String stopOver)
   {
      this.stopOver = stopOver;
   }

   public List<String> getProductRange()
   {
      return productRange;
   }

   public void setProductRange(List<String> productRange)
   {
      this.productRange = productRange;
   }

   public List<String> getItemSubType()
   {
      return itemSubType;
   }

   public void setItemSubType(List<String> itemSubType)
   {
      this.itemSubType = itemSubType;
   }

   public List<String> getBestFor()
   {
      return bestFor;
   }

   public void setBestFor(List<String> bestFor)
   {
      this.bestFor = bestFor;
   }

   public List<String> getItemType()
   {
      return itemType;
   }

   public void setItemType(List<String> itemType)
   {
      this.itemType = itemType;
   }

   public List<String> getTripAdvisorRating()
   {
      return tripAdvisorRating;
   }

   public void setTripAdvisorRating(List<String> tripAdvisorRating)
   {
      this.tripAdvisorRating = tripAdvisorRating;
   }

   public List<String> getHolidayCategory()
   {
      return holidayCategory;
   }

   public void setHolidayCategory(List<String> holidayCategory)
   {
      this.holidayCategory = holidayCategory;
   }

   public List<String> gettRating()
   {
      return tRating;
   }

   public void settRating(List<String> tRating)
   {
      this.tRating = tRating;
   }

   public List<String> getFacilities()
   {
      return facilities;
   }

   public void setFacilities(List<String> facilities)
   {
      this.facilities = facilities;
   }

   public List<Destination> getDestinations()
   {
      return destinations;
   }

   public void setDestinations(List<Destination> destinations)
   {
      this.destinations = destinations;
   }

   public List<String> getName()
   {
      return name;
   }

   public void setName(List<String> name)
   {
      this.name = name;
   }

   public List<String> getCode()
   {
      return code;
   }

   public void setCode(List<String> code)
   {
      this.code = code;
   }

   public List<String> getBrand()
   {
      return brand;
   }

   public void setBrand(List<String> brand)
   {
      this.brand = brand;
   }

   public List<String> getHolidaySubType()
   {
      return holidaySubType;
   }

   public void setHolidaySubType(List<String> holidaySubType)
   {
      this.holidaySubType = holidaySubType;
   }

   public List<String> getFeature()
   {
      return feature;
   }

   public void setFeature(List<String> feature)
   {
      this.feature = feature;
   }

   public String getCruiseStayDuration()
   {
      return this.cruiseStayDuration;
   }

   public void setCruiseStayDuration(String cruiseStayDuration)
   {
      this.cruiseStayDuration = cruiseStayDuration;
   }

   public String getCruiseAccomDuration()
   {
      return this.cruiseAccomDuration;
   }

   public void setCruiseAccomDuration(String cruiseAccomDuration)
   {
      this.cruiseAccomDuration = cruiseAccomDuration;
   }

   public String getGroupMethod()
   {
      return this.groupMethod;
   }

   public void setGroupMethod(String groupMethod)
   {
      this.groupMethod = groupMethod;
   }

   public String getPromotion()
   {
      return promotion;
   }

   public void setPromotion(String promotion)
   {
      this.promotion = promotion;
   }

   public List<Filter> getFilters()
   {
      return filters;
   }

   public void setFilters(List<Filter> filters)
   {
      this.filters = filters;
   }

   public List<ResultsParamsList> getResultsParamsList()
   {
      return resultsParamsList;
   }

   public void setResultsParamsList(List<ResultsParamsList> resultsParamsList)
   {
      List<ResultsParamsList> rsltsParamsList = new ArrayList<>();
      if (StringUtils.isEmpty(resultsParamsList))
      {
         this.resultsParamsList = rsltsParamsList;
      }
      this.resultsParamsList = resultsParamsList;
   }

   /**
    * @return the spotlights
    */
   public List<Spotlight> getSpotlights()
   {
      return spotlights;
   }

   /**
    * @param spotlights the spotlights to set
    */
   public void setSpotlights(List<Spotlight> spotlights)
   {
      this.spotlights = spotlights;
   }
   
   /**
    * @return the title
    */
   public String getTitle()
   {
      return title;
   }
   
   /**
    * 
    * @param title to set
    */
   public void setTitle(String title)
   {
      this.title = title;
   }

}
