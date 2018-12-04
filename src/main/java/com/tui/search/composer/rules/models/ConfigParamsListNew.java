package com.tui.search.composer.rules.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "Id",
    "pageName",
    "url",
    "adults",
    "childAges",
    "dreamLiner",
    "boardBasis",
    "pId",
    "maxPrice",
    "discType",
    "minDisc",
    "maxDisc",
    "freeKid",
    "hlo",
    "tpa",
    "tpf",
    "departureAirports",
    "startDate",
    "endDate",
    "seasonYear",
    "defaultSeasonYear",
    "durations",
    "priceRequired",
    "cruiseType",
    "cruiseOrder",
    "spotlights"
})
public class ConfigParamsListNew {

    @JsonProperty("name")
    private String name;
    @JsonProperty("Id")
    private String id;
    @JsonProperty("pageName")
    private String pageName;
    @JsonProperty("url")
    private Object url;
    @JsonProperty("adults")
    private String adults;
    @JsonProperty("childAges")
    private String childAges;
    @JsonProperty("dreamLiner")
    private String dreamLiner;
    @JsonProperty("boardBasis")
    private Object boardBasis;
    @JsonProperty("pId")
    private String pId;
    @JsonProperty("maxPrice")
    private Object maxPrice;
    @JsonProperty("discType")
    private String discType;
    @JsonProperty("minDisc")
    private Object minDisc;
    @JsonProperty("maxDisc")
    private Object maxDisc;
    @JsonProperty("freeKid")
    private String freeKid;
    @JsonProperty("hlo")
    private String hlo;
    @JsonProperty("tpa")
    private String tpa;
    @JsonProperty("tpf")
    private String tpf;
    @JsonProperty("departureAirports")
    private String departureAirports;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("endDate")
    private String endDate;
    @JsonProperty("seasonYear")
    private Object seasonYear;
    @JsonProperty("defaultSeasonYear")
    private Object defaultSeasonYear;
    @JsonProperty("durations")
    private String durations;
    @JsonProperty("priceRequired")
    private String priceRequired;
    @JsonProperty("c_tp")
    private String cruiseType;
    @JsonProperty("cs_order")
    private String cruiseOrder;
    @JsonProperty("spotlights")
    private List<Spotlight> spotlights = new ArrayList<Spotlight>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public ConfigParamsListNew withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    public ConfigParamsListNew withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("pageName")
    public String getPageName() {
        return pageName;
    }

    @JsonProperty("pageName")
    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public ConfigParamsListNew withPageName(String pageName) {
        this.pageName = pageName;
        return this;
    }

    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    public ConfigParamsListNew withUrl(Object url) {
        this.url = url;
        return this;
    }

    @JsonProperty("adults")
    public String getAdults() {
        return adults;
    }

    @JsonProperty("adults")
    public void setAdults(String adults) {
        this.adults = adults;
    }

    public ConfigParamsListNew withAdults(String adults) {
        this.adults = adults;
        return this;
    }

    @JsonProperty("childAges")
    public String getChildAges() {
        return childAges;
    }

    @JsonProperty("childAges")
    public void setChildAges(String childAges) {
        this.childAges = childAges;
    }

    public ConfigParamsListNew withChildAges(String childAges) {
        this.childAges = childAges;
        return this;
    }

    @JsonProperty("dreamLiner")
    public String getDreamLiner() {
        return dreamLiner;
    }

    @JsonProperty("dreamLiner")
    public void setDreamLiner(String dreamLiner) {
        this.dreamLiner = dreamLiner;
    }

    public ConfigParamsListNew withDreamLiner(String dreamLiner) {
        this.dreamLiner = dreamLiner;
        return this;
    }

    @JsonProperty("boardBasis")
    public Object getBoardBasis() {
        return boardBasis;
    }

    @JsonProperty("boardBasis")
    public void setBoardBasis(Object boardBasis) {
        this.boardBasis = boardBasis;
    }

    public ConfigParamsListNew withBoardBasis(Object boardBasis) {
        this.boardBasis = boardBasis;
        return this;
    }

    @JsonProperty("pId")
    public String getPId() {
        return pId;
    }

    @JsonProperty("pId")
    public void setPId(String pId) {
        this.pId = pId;
    }

    public ConfigParamsListNew withPId(String pId) {
        this.pId = pId;
        return this;
    }

    @JsonProperty("maxPrice")
    public Object getMaxPrice() {
        return maxPrice;
    }

    @JsonProperty("maxPrice")
    public void setMaxPrice(Object maxPrice) {
        this.maxPrice = maxPrice;
    }

    public ConfigParamsListNew withMaxPrice(Object maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }

    @JsonProperty("discType")
    public String getDiscType() {
        return discType;
    }

    @JsonProperty("discType")
    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public ConfigParamsListNew withDiscType(String discType) {
        this.discType = discType;
        return this;
    }

    @JsonProperty("minDisc")
    public Object getMinDisc() {
        return minDisc;
    }

    @JsonProperty("minDisc")
    public void setMinDisc(Object minDisc) {
        this.minDisc = minDisc;
    }

    public ConfigParamsListNew withMinDisc(Object minDisc) {
        this.minDisc = minDisc;
        return this;
    }

    @JsonProperty("maxDisc")
    public Object getMaxDisc() {
        return maxDisc;
    }

    @JsonProperty("maxDisc")
    public void setMaxDisc(Object maxDisc) {
        this.maxDisc = maxDisc;
    }

    public ConfigParamsListNew withMaxDisc(Object maxDisc) {
        this.maxDisc = maxDisc;
        return this;
    }

    @JsonProperty("freeKid")
    public String getFreeKid() {
        return freeKid;
    }

    @JsonProperty("freeKid")
    public void setFreeKid(String freeKid) {
        this.freeKid = freeKid;
    }

    public ConfigParamsListNew withFreeKid(String freeKid) {
        this.freeKid = freeKid;
        return this;
    }

    @JsonProperty("hlo")
    public String getHlo() {
        return hlo;
    }

    @JsonProperty("hlo")
    public void setHlo(String hlo) {
        this.hlo = hlo;
    }

    public ConfigParamsListNew withHlo(String hlo) {
        this.hlo = hlo;
        return this;
    }

    @JsonProperty("tpa")
    public String getTpa() {
        return tpa;
    }

    @JsonProperty("tpa")
    public void setTpa(String tpa) {
        this.tpa = tpa;
    }

    public ConfigParamsListNew withTpa(String tpa) {
        this.tpa = tpa;
        return this;
    }

    @JsonProperty("tpf")
    public String getTpf() {
        return tpf;
    }

    @JsonProperty("tpf")
    public void setTpf(String tpf) {
        this.tpf = tpf;
    }

    public ConfigParamsListNew withTpf(String tpf) {
        this.tpf = tpf;
        return this;
    }

    @JsonProperty("departureAirports")
    public String getDepartureAirports() {
        return departureAirports;
    }

    @JsonProperty("departureAirports")
    public void setDepartureAirports(String departureAirports) {
        this.departureAirports = departureAirports;
    }

    public ConfigParamsListNew withDepartureAirports(String departureAirports) {
        this.departureAirports = departureAirports;
        return this;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public ConfigParamsListNew withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ConfigParamsListNew withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    @JsonProperty("seasonYear")
    public Object getSeasonYear() {
        return seasonYear;
    }

    @JsonProperty("seasonYear")
    public void setSeasonYear(Object seasonYear) {
        this.seasonYear = seasonYear;
    }

    public ConfigParamsListNew withSeasonYear(Object seasonYear) {
        this.seasonYear = seasonYear;
        return this;
    }

    @JsonProperty("defaultSeasonYear")
    public Object getDefaultSeasonYear() {
        return defaultSeasonYear;
    }

    @JsonProperty("defaultSeasonYear")
    public void setDefaultSeasonYear(Object defaultSeasonYear) {
        this.defaultSeasonYear = defaultSeasonYear;
    }

    public ConfigParamsListNew withDefaultSeasonYear(Object defaultSeasonYear) {
        this.defaultSeasonYear = defaultSeasonYear;
        return this;
    }

    @JsonProperty("durations")
    public String getDurations() {
        return durations;
    }

    @JsonProperty("durations")
    public void setDurations(String durations) {
        this.durations = durations;
    }

    public ConfigParamsListNew withDurations(String durations) {
        this.durations = durations;
        return this;
    }

    @JsonProperty("priceRequired")
    public String getPriceRequired() {
        return priceRequired;
    }

    @JsonProperty("priceRequired")
    public void setPriceRequired(String priceRequired) {
        this.priceRequired = priceRequired;
    }

    public ConfigParamsListNew withPriceRequired(String priceRequired) {
        this.priceRequired = priceRequired;
        return this;
    }
    
   public String getCruiseType()
   {
      return cruiseType;
   }

   @JsonProperty("c_tp")
   public void setCruiseType(String cruiseType)
   {
      this.cruiseType = cruiseType;
   }

   public String getCruiseOrder()
   {
      return cruiseOrder;
   }

   @JsonProperty("cs_order")
   public void setCruiseOrder(String cruiseOrder)
   {
      this.cruiseOrder = cruiseOrder;
   }

   @JsonProperty("spotlights")
    public List<Spotlight> getSpotlights() {
        return spotlights;
    }

    @JsonProperty("spotlights")
    public void setSpotlights(List<Spotlight> spotlights) {
        this.spotlights = spotlights;
    }

    public ConfigParamsListNew withSpotlights(List<Spotlight> spotlights) {
        this.spotlights = spotlights;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
