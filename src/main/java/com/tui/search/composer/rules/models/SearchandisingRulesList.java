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
    "siteID",
    "user",
    "publishDate",
    "action",
    "TriggerPattern",
    "searchandisingRulesList"
})
public class SearchandisingRulesList {

    @JsonProperty("name")
    private String name;
    @JsonProperty("Id")
    private String id;
    @JsonProperty("siteID")
    private String siteID;
    @JsonProperty("user")
    private String user;
    @JsonProperty("publishDate")
    private String publishDate;
    @JsonProperty("action")
    private String action;
    @JsonProperty("TriggerPattern")
    private Object triggerPattern;
    @JsonProperty("searchandisingRulesList")
    private List<SearchandisingRulesListNew> searchandisingRulesList = new ArrayList<SearchandisingRulesListNew>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public SearchandisingRulesList withName(String name) {
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

    public SearchandisingRulesList withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("siteID")
    public String getSiteID() {
        return siteID;
    }

    @JsonProperty("siteID")
    public void setSiteID(String siteID) {
        this.siteID = siteID;
    }

    public SearchandisingRulesList withSiteID(String siteID) {
        this.siteID = siteID;
        return this;
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public SearchandisingRulesList withUser(String user) {
        this.user = user;
        return this;
    }

    @JsonProperty("publishDate")
    public String getPublishDate() {
        return publishDate;
    }

    @JsonProperty("publishDate")
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public SearchandisingRulesList withPublishDate(String publishDate) {
        this.publishDate = publishDate;
        return this;
    }

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    public SearchandisingRulesList withAction(String action) {
        this.action = action;
        return this;
    }

    @JsonProperty("TriggerPattern")
    public Object getTriggerPattern() {
        return triggerPattern;
    }

    @JsonProperty("TriggerPattern")
    public void setTriggerPattern(Object triggerPattern) {
        this.triggerPattern = triggerPattern;
    }

    public SearchandisingRulesList withTriggerPattern(Object triggerPattern) {
        this.triggerPattern = triggerPattern;
        return this;
    }

    @JsonProperty("searchandisingRulesList")
    public List<SearchandisingRulesListNew> getSearchandisingRulesList() {
        return searchandisingRulesList;
    }

    @JsonProperty("searchandisingRulesList")
    public void setSearchandisingRulesList(List<SearchandisingRulesListNew> searchandisingRulesList) {
        this.searchandisingRulesList = searchandisingRulesList;
    }

    public SearchandisingRulesList withSearchandisingRulesList(List<SearchandisingRulesListNew> searchandisingRulesList) {
        this.searchandisingRulesList = searchandisingRulesList;
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
