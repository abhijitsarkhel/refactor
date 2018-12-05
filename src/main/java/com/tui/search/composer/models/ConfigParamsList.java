package com.tui.search.composer.models;

import java.util.List;

import com.tui.search.composer.request.rules.params.DealsRulesRequestParams;


public class ConfigParamsList
{

   private String name;

   private String pageName;

   private String url;

   private String adults;

   private String childAges;

   private String dreamLiner;

   private String boardBasis;// String

   private String pType;

   private String maxPrice;// String

   private String discType;

   private String minDisc;

   private String maxDisc;

   private String freeKid;

   private String hlo;

   private String tpa;

   private String tpf;

   private String departureAirports;

   private String startDate;

   private String endDate;

   private String seasonYear;// String

   private String defaultSeasonYear;

   private String durations;

   private String priceRequired;

   private List<String> searchCriteria = null;

   private String datesDuration;

   private String stopOver;

   private String singleAccom;

   private String multiCentre;

   private String title;

   private String pageID;

   public ConfigParamsList(RulesRequest rulesRequest)
   {
      super();
      this.adults = rulesRequest.getAdults();
      this.childAges = rulesRequest.getChildAges();
      this.dreamLiner = rulesRequest.getDreamLiner();
      this.boardBasis = (String) rulesRequest.getBoardBasis();
      this.pType = rulesRequest.getpType();
      this.maxPrice = (String) rulesRequest.getMaxPrice();
      this.discType = rulesRequest.getDiscType();
      this.minDisc = (String) rulesRequest.getMinDisc();
      this.maxDisc = (String) rulesRequest.getMaxDisc();
      this.hlo = rulesRequest.getHlo();
      this.tpa = rulesRequest.getTpa();
      this.tpf = rulesRequest.getTpf();
      this.departureAirports = rulesRequest.getDepartureAirports();
      this.startDate = rulesRequest.getStartDate();
      this.endDate = rulesRequest.getEndDate();
      this.seasonYear = (String) rulesRequest.getSeasonYear();
      this.defaultSeasonYear = (String) rulesRequest.getDefaultSeasonYear();
      this.durations = rulesRequest.getDurations();
      this.priceRequired = rulesRequest.getPriceRequired();
      this.searchCriteria = rulesRequest.getSearchCriteria();
      this.datesDuration = rulesRequest.getDatesDuration();
      this.stopOver = rulesRequest.getStopOver();
   }

   public ConfigParamsList(DealsRulesRequestParams rulesRequest)
   {
      super();
      this.adults = rulesRequest.getAdults();
      this.childAges = rulesRequest.getChildAges();
      this.dreamLiner = rulesRequest.getDreamLiner();
      this.boardBasis = (String) rulesRequest.getBoardBasis();
      this.pType = rulesRequest.getpType();
      this.maxPrice = (String) rulesRequest.getMaxPrice();
      this.discType = rulesRequest.getDiscType();
      this.minDisc = (String) rulesRequest.getMinDisc();
      this.maxDisc = (String) rulesRequest.getMaxDisc();
      this.hlo = rulesRequest.getHlo();
      this.tpa = rulesRequest.getTpa();
      this.tpf = rulesRequest.getTpf();
      this.departureAirports = rulesRequest.getDepartureAirports();
      this.startDate = rulesRequest.getStartDate();
      this.endDate = rulesRequest.getEndDate();
      this.seasonYear = (String) rulesRequest.getSeasonYear();
      this.defaultSeasonYear = (String) rulesRequest.getDefaultSeasonYear();
      this.durations = rulesRequest.getDurations();
      this.priceRequired = rulesRequest.getPriceRequired();
      this.searchCriteria = rulesRequest.getSearchCriteria();
      this.datesDuration = rulesRequest.getDatesDuration();
      this.stopOver = rulesRequest.getStopOver();
   }

   /**
    * @return the name
    */
   public String getName()
   {
      return name;
   }

   /**
    * @param name the name to set
    */
   public void setName(String name)
   {
      this.name = name;
   }

   /**
    * @return the pageName
    */
   public String getPageName()
   {
      return pageName;
   }

   /**
    * @param pageName the pageName to set
    */
   public void setPageName(String pageName)
   {
      this.pageName = pageName;
   }

   /**
    * @return the url
    */
   public String getUrl()
   {
      return url;
   }

   /**
    * @param url the url to set
    */
   public void setUrl(String url)
   {
      this.url = url;
   }

   /**
    * @return the adults
    */
   public String getAdults()
   {
      return adults;
   }

   /**
    * @param adults the adults to set
    */
   public void setAdults(String adults)
   {
      this.adults = adults;
   }

   /**
    * @return the childAges
    */
   public String getChildAges()
   {
      return childAges;
   }

   /**
    * @param childAges the childAges to set
    */
   public void setChildAges(String childAges)
   {
      this.childAges = childAges;
   }

   /**
    * @return the dreamLiner
    */
   public String getDreamLiner()
   {
      return dreamLiner;
   }

   /**
    * @param dreamLiner the dreamLiner to set
    */
   public void setDreamLiner(String dreamLiner)
   {
      this.dreamLiner = dreamLiner;
   }

   /**
    * @return the boardBasis
    */
   public String getBoardBasis()
   {
      return boardBasis;
   }

   /**
    * @param boardBasis the boardBasis to set
    */
   public void setBoardBasis(String boardBasis)
   {
      this.boardBasis = boardBasis;
   }

   /**
    * @return the pType
    */
   public String getpType()
   {
      return pType;
   }

   /**
    * @param pType the pType to set
    */
   public void setpType(String pType)
   {
      this.pType = pType;
   }

   /**
    * @return the maxPrice
    */
   public String getMaxPrice()
   {
      return maxPrice;
   }

   /**
    * @param maxPrice the maxPrice to set
    */
   public void setMaxPrice(String maxPrice)
   {
      this.maxPrice = maxPrice;
   }

   /**
    * @return the discType
    */
   public String getDiscType()
   {
      return discType;
   }

   /**
    * @param discType the discType to set
    */
   public void setDiscType(String discType)
   {
      this.discType = discType;
   }

   /**
    * @return the minDisc
    */
   public String getMinDisc()
   {
      return minDisc;
   }

   /**
    * @param minDisc the minDisc to set
    */
   public void setMinDisc(String minDisc)
   {
      this.minDisc = minDisc;
   }

   /**
    * @return the maxDisc
    */
   public String getMaxDisc()
   {
      return maxDisc;
   }

   /**
    * @param maxDisc the maxDisc to set
    */
   public void setMaxDisc(String maxDisc)
   {
      this.maxDisc = maxDisc;
   }

   /**
    * @return the freeKid
    */
   public String getFreeKid()
   {
      return freeKid;
   }

   /**
    * @param freeKid the freeKid to set
    */
   public void setFreeKid(String freeKid)
   {
      this.freeKid = freeKid;
   }

   /**
    * @return the hlo
    */
   public String getHlo()
   {
      return hlo;
   }

   /**
    * @param hlo the hlo to set
    */
   public void setHlo(String hlo)
   {
      this.hlo = hlo;
   }

   /**
    * @return the tpa
    */
   public String getTpa()
   {
      return tpa;
   }

   /**
    * @param tpa the tpa to set
    */
   public void setTpa(String tpa)
   {
      this.tpa = tpa;
   }

   /**
    * @return the tpf
    */
   public String getTpf()
   {
      return tpf;
   }

   /**
    * @param tpf the tpf to set
    */
   public void setTpf(String tpf)
   {
      this.tpf = tpf;
   }

   /**
    * @return the departureAirports
    */
   public String getDepartureAirports()
   {
      return departureAirports;
   }

   /**
    * @param departureAirports the departureAirports to set
    */
   public void setDepartureAirports(String departureAirports)
   {
      this.departureAirports = departureAirports;
   }

   /**
    * @return the startDate
    */
   public String getStartDate()
   {
      return startDate;
   }

   /**
    * @param startDate the startDate to set
    */
   public void setStartDate(String startDate)
   {
      this.startDate = startDate;
   }

   /**
    * @return the endDate
    */
   public String getEndDate()
   {
      return endDate;
   }

   /**
    * @param endDate the endDate to set
    */
   public void setEndDate(String endDate)
   {
      this.endDate = endDate;
   }

   /**
    * @return the seasonYear
    */
   public String getSeasonYear()
   {
      return seasonYear;
   }

   /**
    * @param seasonYear the seasonYear to set
    */
   public void setSeasonYear(String seasonYear)
   {
      this.seasonYear = seasonYear;
   }

   /**
    * @return the defaultSeasonYear
    */
   public String getDefaultSeasonYear()
   {
      return defaultSeasonYear;
   }

   /**
    * @param defaultSeasonYear the defaultSeasonYear to set
    */
   public void setDefaultSeasonYear(String defaultSeasonYear)
   {
      this.defaultSeasonYear = defaultSeasonYear;
   }

   /**
    * @return the durations
    */
   public String getDurations()
   {
      return durations;
   }

   /**
    * @param durations the durations to set
    */
   public void setDurations(String durations)
   {
      this.durations = durations;
   }

   /**
    * @return the priceRequired
    */
   public String getPriceRequired()
   {
      return priceRequired;
   }

   /**
    * @param priceRequired the priceRequired to set
    */
   public void setPriceRequired(String priceRequired)
   {
      this.priceRequired = priceRequired;
   }

   /**
    * @return the searchCriteria
    */
   public List<String> getSearchCriteria()
   {
      return searchCriteria;
   }

   /**
    * @param searchCriteria the searchCriteria to set
    */
   public void setSearchCriteria(List<String> searchCriteria)
   {
      this.searchCriteria = searchCriteria;
   }

   /**
    * @return the datesDuration
    */
   public String getDatesDuration()
   {
      return datesDuration;
   }

   /**
    * @param datesDuration the datesDuration to set
    */
   public void setDatesDuration(String datesDuration)
   {
      this.datesDuration = datesDuration;
   }

   /**
    * @return the stopOver
    */
   public String getStopOver()
   {
      return stopOver;
   }

   /**
    * @param stopOver the stopOver to set
    */
   public void setStopOver(String stopOver)
   {
      this.stopOver = stopOver;
   }

   /**
    * @return the singleAccom
    */
   public String getSingleAccom()
   {
      return singleAccom;
   }

   /**
    * @param singleAccom the singleAccom to set
    */
   public void setSingleAccom(String singleAccom)
   {
      this.singleAccom = singleAccom;
   }

   /**
    * @return the multiCentre
    */
   public String getMultiCentre()
   {
      return multiCentre;
   }

   /**
    * @param multiCentre the multiCentre to set
    */
   public void setMultiCentre(String multiCentre)
   {
      this.multiCentre = multiCentre;
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

   public String getPageID()
   {
      return pageID;
   }

   public void setPageID(String pageID)
   {
      this.pageID = pageID;
   }

}
