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
    "code",
    "holidayType",
    "brand",
    "rating",
    "productRange",
    "bestFor",
    "itemType",
    "type",
    "holidaySubType",
    "feature",
    "airport",
    "destinations",
    "stopOver"
})
public class Spotlight {

    @JsonProperty("name")
    private List<String> name = new ArrayList<String>();
    @JsonProperty("code")
    private List<String> code = new ArrayList<String>();
    @JsonProperty("holidayType")
    private List<String> holidayType = new ArrayList<String>();
    @JsonProperty("brand")
    private List<String> brand = new ArrayList<String>();
    @JsonProperty("rating")
    private List<Rating> rating = new ArrayList<Rating>();
    @JsonProperty("productRange")
    private List<String> productRange = new ArrayList<String>();
    @JsonProperty("bestFor")
    private List<String> bestFor = new ArrayList<String>();
    @JsonProperty("itemType")
    private List<String> itemType = new ArrayList<String>();
    @JsonProperty("type")
    private List<String> type = new ArrayList<String>();
    @JsonProperty("holidaySubType")
    private List<String> holidaySubType = new ArrayList<String>();
    @JsonProperty("feature")
    private List<String> feature = new ArrayList<String>();
    @JsonProperty("airport")
    private List<String> airport = new ArrayList<String>();
    @JsonProperty("destinations")
    private List<Destination> destinations = new ArrayList<Destination>();
    @JsonProperty("stopOver")
    private String stopOver;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public List<String> getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(List<String> name) {
        this.name = name;
    }

    public Spotlight withName(List<String> name) {
        this.name = name;
        return this;
    }

    @JsonProperty("code")
    public List<String> getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(List<String> code) {
        this.code = code;
    }

    public Spotlight withCode(List<String> code) {
        this.code = code;
        return this;
    }

    @JsonProperty("holidayType")
    public List<String> getHolidayType() {
        return holidayType;
    }

    @JsonProperty("holidayType")
    public void setHolidayType(List<String> holidayType) {
        this.holidayType = holidayType;
    }

    public Spotlight withHolidayType(List<String> holidayType) {
        this.holidayType = holidayType;
        return this;
    }

    @JsonProperty("brand")
    public List<String> getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(List<String> brand) {
        this.brand = brand;
    }

    public Spotlight withBrand(List<String> brand) {
        this.brand = brand;
        return this;
    }

    @JsonProperty("rating")
    public List<Rating> getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(List<Rating> rating) {
        this.rating = rating;
    }

    public Spotlight withRating(List<Rating> rating) {
        this.rating = rating;
        return this;
    }

    @JsonProperty("productRange")
    public List<String> getProductRange() {
        return productRange;
    }

    @JsonProperty("productRange")
    public void setProductRange(List<String> productRange) {
        this.productRange = productRange;
    }

    public Spotlight withProductRange(List<String> productRange) {
        this.productRange = productRange;
        return this;
    }

    @JsonProperty("bestFor")
    public List<String> getBestFor() {
        return bestFor;
    }

    @JsonProperty("bestFor")
    public void setBestFor(List<String> bestFor) {
        this.bestFor = bestFor;
    }

    public Spotlight withBestFor(List<String> bestFor) {
        this.bestFor = bestFor;
        return this;
    }

    @JsonProperty("itemType")
    public List<String> getItemType() {
        return itemType;
    }

    @JsonProperty("itemType")
    public void setItemType(List<String> itemType) {
        this.itemType = itemType;
    }

    public Spotlight withItemType(List<String> itemType) {
        this.itemType = itemType;
        return this;
    }

    @JsonProperty("type")
    public List<String> getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(List<String> type) {
        this.type = type;
    }

    public Spotlight withType(List<String> type) {
        this.type = type;
        return this;
    }

    @JsonProperty("holidaySubType")
    public List<String> getHolidaySubType() {
        return holidaySubType;
    }

    @JsonProperty("holidaySubType")
    public void setHolidaySubType(List<String> holidaySubType) {
        this.holidaySubType = holidaySubType;
    }

    public Spotlight withHolidaySubType(List<String> holidaySubType) {
        this.holidaySubType = holidaySubType;
        return this;
    }

    @JsonProperty("feature")
    public List<String> getFeature() {
        return feature;
    }

    @JsonProperty("feature")
    public void setFeature(List<String> feature) {
        this.feature = feature;
    }

    public Spotlight withFeature(List<String> feature) {
        this.feature = feature;
        return this;
    }

    @JsonProperty("airport")
    public List<String> getAirport() {
        return airport;
    }

    @JsonProperty("airport")
    public void setAirport(List<String> airport) {
        this.airport = airport;
    }

    public Spotlight withAirport(List<String> airport) {
        this.airport = airport;
        return this;
    }

    @JsonProperty("destinations")
    public List<Destination> getDestinations() {
        return destinations;
    }

    @JsonProperty("destinations")
    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    public Spotlight withDestinations(List<Destination> destinations) {
        this.destinations = destinations;
        return this;
    }

    @JsonProperty("stopOver")
    public String getStopOver() {
        return stopOver;
    }

    @JsonProperty("stopOver")
    public void setStopOver(String stopOver) {
        this.stopOver = stopOver;
    }

    public Spotlight withStopOver(String stopOver) {
        this.stopOver = stopOver;
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
