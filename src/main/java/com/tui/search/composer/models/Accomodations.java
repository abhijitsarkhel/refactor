package com.tui.search.composer.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Accomodations
{
   private String atcomId;

   private String brand;

   private String code;

   private String commPri;

   private String date;

   private String id;

   private String prom;

   private String stay;

   private String type;

   private Object ext;

   private Object name;

   private Object pt;

   private Object rating;

   private Object subId;

   private Object tracs;

   private Map<List<String>, Long> brandCodeMap;

   private Map<String, Long> holidayTypeMap;

   private Map<String, Long> cuiseDestinationsMap;

   private Map<String, Long> stayLocationsMap;

   private Map<String, Long> shipNamesMap;

   private Map<String, List<String>> countryMap;

   private Map<String, List<String>> regionMap;

   private Map<String, List<String>> regionresortsMap;

   private Map<List<String>, Long> bestForMap;

   private Map<List<String>, Long> destinationMap;

   private Map<List<String>, Long> productrangeMap;

   private Map<List<String>, Long> ratingMap;

   private long countryCount;

   private long destinationCount;

   private long regionCount;

   private long resortCount;

   private List<String> countryRegionItems;

   private List<String> destinationResortsItems;

   private List<String> regionResortsItems;

   private List<Items> joinedrecords = new ArrayList<>();

   private List<Items> resultsArr = new ArrayList<>();

   List<Multiselect> multiSelect;

   List<Singleselect> singleselectList;

   /**
    * @return the singleselectList
    */
   public List<Singleselect> getSingleselectList()
   {
      return singleselectList;
   }

   /**
    * @param singleselectList the singleselectList to set
    */
   public void setSingleselectList(List<Singleselect> singleselectList)
   {
      this.singleselectList = singleselectList;
   }

   /**
    * @return the multiSelect
    */
   public List<Multiselect> getMultiSelect()
   {
      return multiSelect;
   }

   /**
    * @param multiSelect the multiSelect to set
    */
   public void setMultiSelect(List<Multiselect> multiSelect)
   {
      this.multiSelect = multiSelect;
   }

   /**
    * @return the pt
    */
   public Object getPt()
   {
      return pt;
   }

   /**
    * @param pt the pt to set
    */
   public void setPt(Object pt)
   {
      this.pt = pt;
   }

   /**
    * @return the date
    */
   public String getDate()
   {
      return date;
   }

   /**
    * @param date the date to set
    */
   public void setDate(String date)
   {
      this.date = date;
   }

   /**
    * @return the stay
    */
   public String getStay()
   {
      return stay;
   }

   /**
    * @param stay the stay to set
    */
   public void setStay(String stay)
   {
      this.stay = stay;
   }

   /**
    * @return the id
    */
   public String getId()
   {
      return id;
   }

   /**
    * @param id the id to set
    */
   public void setId(String id)
   {
      this.id = id;
   }

   /**
    * @return the subId
    */
   public Object getSubId()
   {
      return subId;
   }

   /**
    * @param subId the subId to set
    */
   public void setSubId(Object subId)
   {
      this.subId = subId;
   }

   /**
    * @return the code
    */
   public String getCode()
   {
      return code;
   }

   /**
    * @param code the code to set
    */
   public void setCode(String code)
   {
      this.code = code;
   }

   /**
    * @return the name
    */
   public Object getName()
   {
      return name;
   }

   /**
    * @param name the name to set
    */
   public void setName(Object name)
   {
      this.name = name;
   }

   /**
    * @return the brand
    */
   public String getBrand()
   {
      return brand;
   }

   /**
    * @param brand the brand to set
    */
   public void setBrand(String brand)
   {
      this.brand = brand;
   }

   /**
    * @return the prom
    */
   public String getProm()
   {
      return prom;
   }

   /**
    * @param prom the prom to set
    */
   public void setProm(String prom)
   {
      this.prom = prom;
   }

   /**
    * @return the rating
    */
   public Object getRating()
   {
      return rating;
   }

   /**
    * @param rating the rating to set
    */
   public void setRating(Object rating)
   {
      this.rating = rating;
   }

   /**
    * @return the commPri
    */
   public String getCommPri()
   {
      return commPri;
   }

   /**
    * @param commPri the commPri to set
    */
   public void setCommPri(String commPri)
   {
      this.commPri = commPri;
   }

   /**
    * @return the tracs
    */
   public Object getTracs()
   {
      return tracs;
   }

   /**
    * @param tracs the tracs to set
    */
   public void setTracs(Object tracs)
   {
      this.tracs = tracs;
   }

   /**
    * @return the atcomId
    */
   public String getAtcomId()
   {
      return atcomId;
   }

   /**
    * @param atcomId the atcomId to set
    */
   public void setAtcomId(String atcomId)
   {
      this.atcomId = atcomId;
   }

   /**
    * @return the type
    */
   public String getType()
   {
      return type;
   }

   /**
    * @param type the type to set
    */
   public void setType(String type)
   {
      this.type = type;
   }

   /**
    * @return the ext
    */
   public Object getExt()
   {
      return ext;
   }

   /**
    * @param ext the ext to set
    */
   public void setExt(Object ext)
   {
      this.ext = ext;
   }

   /**
    * @return the resultsArr
    */
   public List<Items> getResultsArr()
   {
      return resultsArr;
   }

   /**
    * @param resultsArr the resultsArr to set
    */
   public void setResultsArr(List<Items> resultsArr)
   {
      this.resultsArr = resultsArr;
   }

   /**
    * @return the joinedrecords
    */
   public List<Items> getJoinedrecords()
   {
      return joinedrecords;
   }

   /**
    * @param joinedrecords the joinedrecords to set
    */
   public void setJoinedrecords(List<Items> joinedrecords)
   {
      this.joinedrecords = joinedrecords;
   }

   /**
    * @return the brandCodeMap
    */
   public Map<List<String>, Long> getBrandCodeMap()
   {
      return brandCodeMap;
   }

   /**
    * @param brandCodeMap the brandCodeMap to set
    */
   public void setBrandCodeMap(Map<List<String>, Long> brandCodeMap)
   {
      this.brandCodeMap = brandCodeMap;
   }

   /**
    * @return the holidayTypeMap
    */
   public Map<String, Long> getHolidayTypeMap()
   {
      return holidayTypeMap;
   }

   /**
    * @param holidayTypeMap the holidayTypeMap to set
    */
   public void setHolidayTypeMap(Map<String, Long> holidayTypeMap)
   {
      this.holidayTypeMap = holidayTypeMap;
   }

   /**
    * @return the countryMap
    */
   public Map<String, List<String>> getCountryMap()
   {
      return countryMap;
   }

   /**
    * @param countryMap the countryMap to set
    */
   public void setCountryMap(Map<String, List<String>> countryMap)
   {
      this.countryMap = countryMap;
   }

   /**
    * @return the regionMap
    */
   public Map<String, List<String>> getRegionMap()
   {
      return regionMap;
   }

   /**
    * @param regionMap the regionMap to set
    */
   public void setRegionMap(Map<String, List<String>> regionMap)
   {
      this.regionMap = regionMap;
   }

   /**
    * @return the regionresortsMap
    */
   public Map<String, List<String>> getRegionresortsMap()
   {
      return regionresortsMap;
   }

   /**
    * @param regionresortsMap the regionresortsMap to set
    */
   public void setRegionresortsMap(Map<String, List<String>> regionresortsMap)
   {
      this.regionresortsMap = regionresortsMap;
   }

   /**
    * @return the countryCount
    */
   public long getCountryCount()
   {
      return countryCount;
   }

   /**
    * @param countryCount the countryCount to set
    */
   public void setCountryCount(long countryCount)
   {
      this.countryCount = countryCount;
   }

   /**
    * @return the destinationCount
    */
   public long getDestinationCount()
   {
      return destinationCount;
   }

   /**
    * @param destinationCount the destinationCount to set
    */
   public void setDestinationCount(long destinationCount)
   {
      this.destinationCount = destinationCount;
   }

   /**
    * @return the regionCount
    */
   public long getRegionCount()
   {
      return regionCount;
   }

   /**
    * @param regionCount the regionCount to set
    */
   public void setRegionCount(long regionCount)
   {
      this.regionCount = regionCount;
   }

   /**
    * @return the resortCount
    */
   public long getResortCount()
   {
      return resortCount;
   }

   /**
    * @param resortCount the resortCount to set
    */
   public void setResortCount(long resortCount)
   {
      this.resortCount = resortCount;
   }

   /**
    * @return the countryRegionItems
    */
   public List<String> getCountryRegionItems()
   {
      return countryRegionItems;
   }

   /**
    * @param countryRegionItems the countryRegionItems to set
    */
   public void setCountryRegionItems(List<String> countryRegionItems)
   {
      this.countryRegionItems = countryRegionItems;
   }

   /**
    * @return the destinationResortsItems
    */
   public List<String> getDestinationResortsItems()
   {
      return destinationResortsItems;
   }

   /**
    * @param destinationResortsItems the destinationResortsItems to set
    */
   public void setDestinationResortsItems(List<String> destinationResortsItems)
   {
      this.destinationResortsItems = destinationResortsItems;
   }

   /**
    * @return the regionResortsItems
    */
   public List<String> getRegionResortsItems()
   {
      return regionResortsItems;
   }

   /**
    * @param regionResortsItems the regionResortsItems to set
    */
   public void setRegionResortsItems(List<String> regionResortsItems)
   {
      this.regionResortsItems = regionResortsItems;
   }

   /**
    * @return the bestForMap
    */
   public Map<List<String>, Long> getBestForMap()
   {
      return bestForMap;
   }

   /**
    * @param bestForMap the bestForMap to set
    */
   public void setBestForMap(Map<List<String>, Long> bestForMap)
   {
      this.bestForMap = bestForMap;
   }

   /**
    * @return the productrangeMap
    */
   public Map<List<String>, Long> getProductrangeMap()
   {
      return productrangeMap;
   }

   /**
    * @param productrangeMap the productrangeMap to set
    */
   public void setProductrangeMap(Map<List<String>, Long> productrangeMap)
   {
      this.productrangeMap = productrangeMap;
   }

   /**
    * @return the destinationMap
    */
   public Map<List<String>, Long> getDestinationMap()
   {
      return destinationMap;
   }

   /**
    * @param destinationMap the destinationMap to set
    */
   public void setDestinationMap(Map<List<String>, Long> destinationMap)
   {
      this.destinationMap = destinationMap;
   }

   public Map<String, Long> getCuiseDestinationsMap()
   {
      return cuiseDestinationsMap;
   }

   public void setCuiseDestinationsMap(Map<String, Long> cuiseDestinationsMap)
   {
      this.cuiseDestinationsMap = cuiseDestinationsMap;
   }

   public Map<String, Long> getStayLocationsMap()
   {
      return stayLocationsMap;
   }

   public void setStayLocationsMap(Map<String, Long> stayLocationsMap)
   {
      this.stayLocationsMap = stayLocationsMap;
   }

   public Map<String, Long> getShipNamesMap()
   {
      return shipNamesMap;
   }

   public void setShipNamesMap(Map<String, Long> shipNamesMap)
   {
      this.shipNamesMap = shipNamesMap;
   }

   /**
    * @return the ratingMap
    */
   public Map<List<String>, Long> getRatingMap()
   {
      return ratingMap;
   }

   /**
    * @param ratingMap the ratingMap to set
    */
   public void setRatingMap(Map<List<String>, Long> ratingMap)
   {
      this.ratingMap = ratingMap;
   }

}
