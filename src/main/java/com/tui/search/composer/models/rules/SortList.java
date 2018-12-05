package com.tui.search.composer.models.rules;

import java.util.HashMap;
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
    "sortBy",
    "sortType",
    "sortlevel"
})
public class SortList {

    @JsonProperty("sortBy")
    private String sortBy;
    @JsonProperty("sortType")
    private String sortType;
    @JsonProperty("sortlevel")
    private String sortlevel;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sortBy")
    public String getSortBy() {
        return sortBy;
    }

    @JsonProperty("sortBy")
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public SortList withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    @JsonProperty("sortType")
    public String getSortType() {
        return sortType;
    }

    @JsonProperty("sortType")
    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public SortList withSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }

    @JsonProperty("sortlevel")
    public String getSortlevel() {
        return sortlevel;
    }

    @JsonProperty("sortlevel")
    public void setSortlevel(String sortlevel) {
        this.sortlevel = sortlevel;
    }

    public SortList withSortlevel(String sortlevel) {
        this.sortlevel = sortlevel;
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
