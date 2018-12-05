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
    "name",
    "Id",
    "groupBy",
    "codes",
    "source",
    "active"
})
public class Filter {

    @JsonProperty("name")
    private String name;
    @JsonProperty("Id")
    private String id;
    @JsonProperty("groupBy")
    private Object groupBy;
    @JsonProperty("codes")
    private Object codes;
    @JsonProperty("source")
    private String source;
    @JsonProperty("active")
    private String active;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Filter withName(String name) {
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

    public Filter withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("groupBy")
    public Object getGroupBy() {
        return groupBy;
    }

    @JsonProperty("groupBy")
    public void setGroupBy(Object groupBy) {
        this.groupBy = groupBy;
    }

    public Filter withGroupBy(Object groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    @JsonProperty("codes")
    public Object getCodes() {
        return codes;
    }

    @JsonProperty("codes")
    public void setCodes(Object codes) {
        this.codes = codes;
    }

    public Filter withCodes(Object codes) {
        this.codes = codes;
        return this;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public Filter withSource(String source) {
        this.source = source;
        return this;
    }

    @JsonProperty("active")
    public String getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(String active) {
        this.active = active;
    }

    public Filter withActive(String active) {
        this.active = active;
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
