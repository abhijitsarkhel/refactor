package com.tui.search.composer.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.tui.elastic.anite.jaxb.response.AvCache.Result.Offers.Offer;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "code", "name", "productRange_TH", "destination", "siteId", "continent",
   "brand", "productRange", "latitude", "longitude", "facilities", "brandCode", "aniteBrand",
   "country", "date", "stayPossible", "shipCode", "depPort", "arrPort", "stayLocationCode",
   "cruiseDestinationName", "itemSubType", "itemType", "shipName", "date", "tRating",
   "tripAdvisorRating", "commercialPriority", "holidayCategory", "arrAirport", "packageInfo",
   "items", "cruiseId", "departurePort", "holidayType", "stayLocationName", "cruiseAreas", "price",
   "cruiseCountries", "region", "resort", "count", "resp_type", "resultsPerPage", "offsetNumber",
   "pageNumber", "sortBy", "firstResNumber", "lastResNumber", "sort0", "sort1", "sort2",
   "aniteLists", "duration" })
public class Items
{
   @JsonProperty("id")
   private String id;

   @JsonProperty("code")
   private String code;

   @JsonProperty("name")
   private String name;

   @JsonProperty("productRange_TH")
   private String productRangeTH;

   @JsonProperty("destination")
   private String destination;

   @JsonProperty("siteId")
   private List<String> siteId;

   @JsonProperty("continent")
   private String continent;

   @JsonProperty("productRange")
   private String productRange;

   @JsonProperty("facilities")
   private List<String> facilities;

   @JsonProperty("stayPossible")
   private String stayPossible;

   @JsonProperty("shipCode")
   private String shipCode;

   @JsonProperty("brandCode")
   private String brandCode;

   @JsonProperty("aniteBrand")
   private String aniteBrand;

   @JsonProperty("country")
   private String country;

   @JsonProperty("date")
   private String date;

   @JsonProperty("stay")
   private String stay;

   @JsonProperty("shellCSP")
   private String shellCSP;

   @JsonProperty("hotelCSP")
   private String hotelCSP;

   @JsonProperty("departurePoint")
   private String departurePoint;

   @JsonProperty("occupancy")
   private String occupancy;

   @JsonProperty("disc")
   private String disc;

   @JsonProperty("depPort")
   private String depPort;

   @JsonProperty("arrPort")
   private String arrPort;

   @JsonProperty("stayLocationCode")
   private String stayLocationCode;

   @JsonProperty("itemSubType")
   private String itemSubType;

   @JsonProperty("itemType")
   private String itemType;

   @JsonProperty("shipName")
   private String shipName;

   @JsonProperty("tRating")
   private String tRating;

   @JsonProperty("tripAdvisorRating")
   private String tripAdvisorRating;

   @JsonProperty("commercialPriority")
   private String commercialPriority;

   @JsonProperty("holidayCategory")
   private String holidayCategory;

   @JsonProperty("arrAirport")
   private String arrAirport;

   @JsonProperty("packageInfo")
   private Set<Offer> packageInfo;

   @JsonProperty("items")
   private Object items;

   @JsonProperty("region")
   private String region;

   @JsonProperty("resort")
   private String resort;

   @JsonProperty("cruiseId")
   private String cruiseId;

   @JsonProperty("departurePort")
   private String departurePort;

   @JsonProperty("holidayType")
   private List<String> holidayType;

   @JsonProperty("stayLocationName")
   private String stayLocationName;

   @JsonProperty("price")
   private String price;

   @JsonProperty("count")
   private long count;

   @JsonProperty("resp_type")
   private String respType;

   @JsonProperty("resultsPerPage")
   private String resultsPerPage;

   @JsonProperty("offsetNumber")
   private String offsetNumber;

   @JsonProperty("pageNumber")
   private String pageNumber;

   @JsonProperty("sortBy")
   private String sortBy;

   @JsonProperty("firstResNumber")
   private String firstResNumber;

   @JsonProperty("lastResNumber")
   private String lastResNumber;

   @JsonProperty("sort0")
   private String sort0;

   @JsonProperty("sort1")
   private String sort1;

   @JsonProperty("sort2")
   private String sort2;

   @JsonProperty("aniteLists")
   private AniteLists aniteLists;

   @JsonProperty("duration")
   private Stays duration;

   @JsonIgnore
   private final Map<String, Object> additionalProperties = new HashMap<>();

   @JsonProperty("id")
   public String getId()
   {
      return id;
   }

   @JsonProperty("id")
   public void setId(final String id)
   {
      this.id = id;
   }

   public Items withId(final String id)
   {
      this.id = id;
      return this;
   }

   @JsonProperty("code")
   public String getCode()
   {
      return code;
   }

   @JsonProperty("code")
   public void setCode(final String code)
   {
      this.code = code;
   }

   public Items withCode(final String code)
   {
      this.code = code;
      return this;
   }

   @JsonProperty("name")
   public String getName()
   {
      return name;
   }

   @JsonProperty("name")
   public void setName(final String name)
   {
      this.name = name;
   }

   public Items withName(final String name)
   {
      this.name = name;
      return this;
   }

   @JsonProperty("productRange_TH")
   public String getProductRangeTH()
   {
      return productRangeTH;
   }

   @JsonProperty("productRange_TH")
   public void setProductRangeTH(final String productRangeTH)
   {
      this.productRangeTH = productRangeTH;
   }

   public Items withProductRangeTH(final String productRangeTH)
   {
      this.productRangeTH = productRangeTH;
      return this;
   }

   @JsonProperty("destination")
   public String getDestination()
   {
      return destination;
   }

   @JsonProperty("destination")
   public void setDestination(final String destination)
   {
      this.destination = destination;
   }

   public Items withDestination(final String destination)
   {
      this.destination = destination;
      return this;
   }

   @JsonProperty("siteId")
   public List<String> getSiteId()
   {
      return siteId;
   }

   @JsonProperty("siteId")
   public void setSiteId(final List<String> siteId)
   {
      this.siteId = siteId;
   }

   public Items withSiteId(final List<String> siteId)
   {
      this.siteId = siteId;
      return this;
   }

   @JsonProperty("continent")
   public String getContinent()
   {
      return continent;
   }

   @JsonProperty("continent")
   public void setContinent(final String continent)
   {
      this.continent = continent;
   }

   public Items withContinent(final String continent)
   {
      this.continent = continent;
      return this;
   }

   @JsonProperty("productRange")
   public String getProductRange()
   {
      return productRange;
   }

   @JsonProperty("productRange")
   public void setProductRange(final String productRange)
   {
      this.productRange = productRange;
   }

   public Items withProductRange(final String productRange)
   {
      this.productRange = productRange;
      return this;
   }

   @JsonProperty("facilities")
   public List<String> getFacilities()
   {
      return facilities;
   }

   @JsonProperty("facilities")
   public void setFacilities(final List<String> facilities)
   {
      this.facilities = facilities;
   }

   public Items withFacilities(final List<String> facilities)
   {
      this.facilities = facilities;
      return this;
   }

   @JsonProperty("stayPossible")
   public String getStayPossible()
   {
      return stayPossible;
   }

   @JsonProperty("stayPossible")
   public void setStayPossible(final String stayPossible)
   {
      this.stayPossible = stayPossible;
   }

   @JsonProperty("shipCode")
   public String getShipCode()
   {
      return shipCode;
   }

   @JsonProperty("shipCode")
   public void setShipCode(final String shipCode)
   {
      this.shipCode = shipCode;
   }

   @JsonProperty("brandCode")
   public String getBrandCode()
   {
      return brandCode;
   }

   @JsonProperty("brandCode")
   public void setBrandCode(final String brandCode)
   {
      this.brandCode = brandCode;
   }

   public Items withBrandCode(final String brandCode)
   {
      this.brandCode = brandCode;
      return this;
   }

   @JsonProperty("aniteBrand")
   public Object getAniteBrand()
   {
      return aniteBrand;
   }

   @JsonProperty("aniteBrand")
   public void setAniteBrand(final String aniteBrand)
   {
      this.aniteBrand = aniteBrand;
   }

   public Items withAniteBrand(final String aniteBrand)
   {
      this.aniteBrand = aniteBrand;
      return this;
   }

   @JsonProperty("country")
   public String getCountry()
   {
      return country;
   }

   @JsonProperty("country")
   public void setCountry(final String country)
   {
      this.country = country;
   }

   public Items withCountry(final String country)
   {
      this.country = country;
      return this;
   }

   @JsonProperty("depPort")
   public String getDepPort()
   {
      return depPort;
   }

   @JsonProperty("depPort")
   public void setDepPort(final String depPort)
   {
      this.depPort = depPort;
   }

   @JsonProperty("arrPort")
   public String getArrPort()
   {
      return arrPort;
   }

   @JsonProperty("arrPort")
   public void setArrPort(final String arrPort)
   {
      this.arrPort = arrPort;
   }

   @JsonProperty("stayLocationCode")
   public String getStayLocationCode()
   {
      return stayLocationCode;
   }

   @JsonProperty("stayLocationCode")
   public void setStayLocationCode(final String stayLocationCode)
   {
      this.stayLocationCode = stayLocationCode;
   }

   @JsonProperty("date")
   public String getDate()
   {
      return date;
   }

   @JsonProperty("date")
   public void setDate(final String date)
   {
      this.date = date;
   }

   public Items withDate(final String date)
   {
      this.date = date;
      return this;
   }

   @JsonProperty("itemSubType")
   public String getItemSubType()
   {
      return itemSubType;
   }

   @JsonProperty("itemSubType")
   public void setItemSubType(final String itemSubType)
   {
      this.itemSubType = itemSubType;
   }

   public Items withItemSubType(final String itemSubType)
   {
      this.itemSubType = itemSubType;
      return this;
   }

   @JsonProperty("itemType")
   public String getItemType()
   {
      return itemType;
   }

   @JsonProperty("itemType")
   public void setItemType(final String itemType)
   {
      this.itemType = itemType;
   }

   public Items withItemType(final String itemType)
   {
      this.itemType = itemType;
      return this;
   }

   @JsonProperty("tRating")
   public String getTRating()
   {
      return tRating;
   }

   @JsonProperty("tRating")
   public void setTRating(final String tRating)
   {
      this.tRating = tRating;
   }

   public Items withTRating(final String tRating)
   {
      this.tRating = tRating;
      return this;
   }

   @JsonProperty("shipName")
   public String getShipName()
   {
      return shipName;
   }

   @JsonProperty("shipName")
   public void setShipName(final String shipName)
   {
      this.shipName = shipName;
   }

   @JsonProperty("tripAdvisorRating")
   public String getTripAdvisorRating()
   {
      return tripAdvisorRating;
   }

   @JsonProperty("tripAdvisorRating")
   public void setTripAdvisorRating(final String tripAdvisorRating)
   {
      this.tripAdvisorRating = tripAdvisorRating;
   }

   public Items withTripAdvisorRating(final String tripAdvisorRating)
   {
      this.tripAdvisorRating = tripAdvisorRating;
      return this;
   }

   @JsonProperty("commercialPriority")
   public String getCommercialPriority()
   {
      return commercialPriority;
   }

   @JsonProperty("commercialPriority")
   public void setCommercialPriority(final String commercialPriority)
   {
      this.commercialPriority = commercialPriority;
   }

   public Items withCommercialPriority(final String commercialPriority)
   {
      this.commercialPriority = commercialPriority;
      return this;
   }

   @JsonProperty("holidayCategory")
   public String getHolidayCategory()
   {
      return holidayCategory;
   }

   @JsonProperty("holidayCategory")
   public void setHolidayCategory(final String holidayCategory)
   {
      this.holidayCategory = holidayCategory;
   }

   public Items withHolidayCategory(final String holidayCategory)
   {
      this.holidayCategory = holidayCategory;
      return this;
   }

   @JsonProperty("arrAirport")
   public String getArrAirport()
   {
      return arrAirport;
   }

   @JsonProperty("arrAirport")
   public void setArrAirport(final String arrAirport)
   {
      this.arrAirport = arrAirport;
   }

   public Items withArrAirport(final String arrAirport)
   {
      this.arrAirport = arrAirport;
      return this;
   }

   @JsonProperty("packageInfo")
   public Set<Offer> getPackageInfo()
   {
      return packageInfo;
   }

   @JsonProperty("packageInfo")
   public void setPackageInfo(final Set<Offer> packageInfo)
   {
      this.packageInfo = packageInfo;
   }

   public Items withPackageInfo(final Set<Offer> packageInfo)
   {
      this.packageInfo = packageInfo;
      return this;
   }

   @JsonProperty("items")
   public Object getItems()
   {
      return items;
   }

   @JsonProperty("items")
   public void setItems(final Object items)
   {
      this.items = items;
   }

   public Items withItems(final Object items)
   {
      this.items = items;
      return this;
   }

   @JsonProperty("region")
   public String getRegion()
   {
      return region;
   }

   @JsonProperty("region")
   public void setRegion(final String region)
   {
      this.region = region;
   }

   public Items withRegion(final String region)
   {
      this.region = region;
      return this;
   }

   @JsonProperty("cruiseId")
   public String getCruiseId()
   {
      return cruiseId;
   }

   @JsonProperty("cruiseId")
   public void setCruiseId(final String cruiseId)
   {
      this.cruiseId = cruiseId;
   }

   @JsonProperty("departurePort")
   public String getDeparturePort()
   {
      return departurePort;
   }

   @JsonProperty("departurePort")
   public void setDeparturePort(final String departurePort)
   {
      this.departurePort = departurePort;
   }

   @JsonProperty("holidayType")
   public List<String> getHolidayType()
   {
      return holidayType;
   }

   @JsonProperty("holidayType")
   public void setHolidayType(final List<String> holidayType)
   {
      this.holidayType = holidayType;
   }

   @JsonProperty("stayLocationName")
   public String getStayLocationName()
   {
      return stayLocationName;
   }

   @JsonProperty("stayLocationName")
   public void setStayLocationName(final String stayLocationName)
   {
      this.stayLocationName = stayLocationName;
   }

   @JsonProperty("resort")
   public String getResort()
   {
      return resort;
   }

   @JsonProperty("resort")
   public void setResort(final String resort)
   {
      this.resort = resort;
   }

   public Items withResort(final String resort)
   {
      this.resort = resort;
      return this;
   }

   @JsonAnyGetter
   public Map<String, Object> getAdditionalProperties()
   {
      return this.additionalProperties;
   }

   @JsonAnySetter
   public void setAdditionalProperty(final String name, final Object value)
   {
      this.additionalProperties.put(name, value);
   }

   public Items withAdditionalProperty(final String name, final Object value)
   {
      this.additionalProperties.put(name, value);
      return this;
   }

   @JsonProperty("count")
   public long getCount()
   {
      return count;
   }

   @JsonProperty("count")
   public void setCount(final long count)
   {
      this.count = count;
   }

   @JsonProperty("resp_type")
   public String getRespType()
   {
      return respType;
   }

   @JsonProperty("resp_type")
   public void setRespType(final String respType)
   {
      this.respType = respType;
   }

   @JsonProperty("resultsPerPage")
   public void setResultsPerPage(final String resultsPerPage)
   {
      this.resultsPerPage = resultsPerPage;
   }

   @JsonProperty("resultsPerPage")
   public String getResultsPerPage()
   {
      return resultsPerPage;
   }

   @JsonProperty("offsetNumber")
   public void setOffsetNumber(final String offsetNumber)
   {
      this.offsetNumber = offsetNumber;
   }

   @JsonProperty("offsetNumber")
   public String getOffsetNumber()
   {
      return offsetNumber;
   }

   @JsonProperty("pageNumber")
   public void setPageNumber(final String pageNumber)
   {
      this.pageNumber = pageNumber;
   }

   @JsonProperty("pageNumber")
   public String getPageNumber()
   {
      return pageNumber;
   }

   @JsonProperty("sortBy")
   public void setSortBy(final String sortBy)
   {
      this.sortBy = sortBy;
   }

   @JsonProperty("sortBy")
   public String getSortBy()
   {
      return sortBy;
   }

   @JsonProperty("firstResNumber")
   public String getFirstResNumber()
   {
      return firstResNumber;
   }

   @JsonProperty("firstResNumber")
   public void setFirstResNumber(String firstResNumber)
   {
      this.firstResNumber = firstResNumber;
   }

   @JsonProperty("lastResNumber")
   public String getLastResNumber()
   {
      return lastResNumber;
   }

   @JsonProperty("lastResNumber")
   public void setLastResNumber(String lastResNumber)
   {
      this.lastResNumber = lastResNumber;
   }

   @JsonProperty("sort0")
   public String getSort0()
   {
      return sort0;
   }

   @JsonProperty("sort0")
   public void setSort0(String sort0)
   {
      this.sort0 = sort0;
   }

   @JsonProperty("sort1")
   public String getSort1()
   {
      return sort1;
   }

   @JsonProperty("sort1")
   public void setSort1(String sort1)
   {
      this.sort1 = sort1;
   }

   @JsonProperty("sort2")
   public String getSort2()
   {
      return sort2;
   }

   @JsonProperty("sort2")
   public void setSort2(String sort2)
   {
      this.sort2 = sort2;
   }

   @JsonProperty("aniteLists")
   public AniteLists getAniteLists()
   {
      return aniteLists;
   }

   @JsonProperty("aniteLists")
   public void setAniteLists(AniteLists aniteLists)
   {
      this.aniteLists = aniteLists;
   }

   @JsonProperty("duration")
   public Stays getDuration()
   {
      return duration;
   }

   @JsonProperty("duration")
   public void setDuration(Stays duration)
   {
      this.duration = duration;
   }

   @JsonProperty("stay")
   public String getStay()
   {
      return stay;
   }

   @JsonProperty("stay")
   public void setStay(String stay)
   {
      this.stay = stay;
   }

   @JsonProperty("shellCSP")
   public String getShellCSP()
   {
      return shellCSP;
   }

   @JsonProperty("shellCSP")
   public void setShellCSP(String shellCSP)
   {
      this.shellCSP = shellCSP;
   }

   @JsonProperty("hotelCSP")
   public String getHotelCSP()
   {
      return hotelCSP;
   }

   @JsonProperty("hotelCSP")
   public void setHotelCSP(String hotelCSP)
   {
      this.hotelCSP = hotelCSP;
   }

   @JsonProperty("departurePoint")
   public String getDeparturePoint()
   {
      return departurePoint;
   }

   @JsonProperty("departurePoint")
   public void setDeparturePoint(String departurePoint)
   {
      this.departurePoint = departurePoint;
   }

   @JsonProperty("occupancy")
   public String getOccupancy()
   {
      return occupancy;
   }

   @JsonProperty("occupancy")
   public void setOccupancy(String occupancy)
   {
      this.occupancy = occupancy;
   }

   @JsonProperty("disc")
   public String getDisc()
   {
      return disc;
   }

   @JsonProperty("disc")
   public void setDisc(String disc)
   {
      this.disc = disc;
   }

   @JsonProperty("price")
   public String getPrice()
   {
      return price;
   }

   @JsonProperty("price")
   public void setPrice(String price)
   {
      this.price = price;
   }

   @Override
   public String toString()
   {
      return new ToStringBuilder(this).append("id", id).append("code", code).append("name", name)
         .append("productRangeTH", productRangeTH).append("destination", destination)
         .append("siteId", siteId).append("continent", continent)
         // .append("brand", brand)
         .append("productRange", productRange)
         // .append("latitude", latitude)
         // .append("longitude", longitude)
         .append("facilities", facilities).append("brandCode", brandCode)
         .append("aniteBrand", aniteBrand).append("country", country).append("date", date)
         .append("itemSubType", itemSubType).append("itemType", itemType).append("tRating", tRating)
         .append("tripAdvisorRating", tripAdvisorRating)
         .append("commercialPriority", commercialPriority)
         .append("holidayCategory", holidayCategory).append("arrAirport", arrAirport)
         .append("packageInfo", packageInfo).append("items", items).append("region", region)
         .append("resort", resort).append("additionalProperties", additionalProperties)
         .append("count", count).append("resp_type", respType)
         .append("resultsPerPage", resultsPerPage).append("sortBy", sortBy)
         .append("offsetNumber", offsetNumber).append("pageNumber", pageNumber)
         .append("firstResNumber", firstResNumber).append("lastResNumber", lastResNumber)
         .append("sort0", sort0).append("sort1", sort1).append("sort2", sort2)
         .append("aniteLists", aniteLists).append("duration", duration).toString();
   }

   @Override
   public int hashCode()
   {
      return new HashCodeBuilder().append(continent).append(date).append(country).append(itemType)
         .append(code).append(commercialPriority)
         // .append(latitude)
         .append(destination).append(itemSubType).append(tripAdvisorRating).append(productRangeTH)
         .append(arrAirport).append(id).append(resort)
         // .append(brand).append(longitude)
         .append(brandCode).append(aniteBrand).append(holidayCategory).append(productRange)
         .append(name).append(siteId).append(additionalProperties).append(facilities)
         .append(tRating).append(packageInfo).append(region).append(items).append(count)
         .append(respType).append(resultsPerPage).append(offsetNumber).append(pageNumber)
         .append(sortBy).append(firstResNumber).append(lastResNumber).append(sort0).append(sort1)
         .append(sort2).append(aniteLists).append(duration).toHashCode();
   }

   @Override
   public boolean equals(final Object other)
   {
      if (other == this)
      {
         return true;
      }
      if (!(other instanceof Items))
      {
         return false;
      }
      final Items rhs = ((Items) other);
      return new EqualsBuilder().append(continent, rhs.continent).append(date, rhs.date)
         .append(country, rhs.country).append(itemType, rhs.itemType).append(code, rhs.code)
         .append(commercialPriority, rhs.commercialPriority)
         // .append(latitude, rhs.latitude)
         .append(destination, rhs.destination).append(itemSubType, rhs.itemSubType)
         .append(tripAdvisorRating, rhs.tripAdvisorRating)
         .append(productRangeTH, rhs.productRangeTH).append(arrAirport, rhs.arrAirport)
         .append(id, rhs.id).append(resort, rhs.resort)
         // .append(brand, rhs.brand)
         // .append(longitude, rhs.longitude)
         .append(brandCode, rhs.brandCode).append(aniteBrand, rhs.aniteBrand)
         .append(holidayCategory, rhs.holidayCategory).append(productRange, rhs.productRange)
         .append(name, rhs.name).append(siteId, rhs.siteId)
         .append(additionalProperties, rhs.additionalProperties).append(facilities, rhs.facilities)
         .append(tRating, rhs.tRating).append(packageInfo, rhs.packageInfo)
         .append(region, rhs.region).append(items, rhs.items).append(count, rhs.count)
         .append(respType, rhs.respType).append("resultsPerPage", rhs.resultsPerPage)
         .append("offsetNumber", rhs.offsetNumber).append("pageNumber", rhs.pageNumber)
         .append("sortBy", rhs.sortBy).append("firstResNumber", rhs.firstResNumber)
         .append("lastResNumber", rhs.lastResNumber).append("sort0", rhs.sort0)
         .append("sort1", rhs.sort1).append("sort2", rhs.sort2).append("unit", rhs.aniteLists)
         .append("duration", rhs.duration).isEquals();
   }
}
