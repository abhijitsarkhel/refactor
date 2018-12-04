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
    "configParamsList",
    "resultsParamsList",
    "filtersParamsList"
})
public class SearchandisingRulesListNew {

    @JsonProperty("configParamsList")
    private ConfigParamsListNew configParamsList;
    @JsonProperty("resultsParamsList")
    private List<ResultsParamsList> resultsParamsList = new ArrayList<ResultsParamsList>();
    @JsonProperty("filtersParamsList")
    private FiltersParamsList filtersParamsList;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("configParamsList")
    public ConfigParamsListNew getConfigParamsList() {
        return configParamsList;
    }

    @JsonProperty("configParamsList")
    public void setConfigParamsList(ConfigParamsListNew configParamsList) {
        this.configParamsList = configParamsList;
    }

    public SearchandisingRulesListNew withConfigParamsList(ConfigParamsListNew configParamsList) {
        this.configParamsList = configParamsList;
        return this;
    }

    @JsonProperty("resultsParamsList")
    public List<ResultsParamsList> getResultsParamsList() {
        return resultsParamsList;
    }

    @JsonProperty("resultsParamsList")
    public void setResultsParamsList(List<ResultsParamsList> resultsParamsList) {
        this.resultsParamsList = resultsParamsList;
    }

    public SearchandisingRulesListNew withResultsParamsList(List<ResultsParamsList> resultsParamsList) {
        this.resultsParamsList = resultsParamsList;
        return this;
    }

    @JsonProperty("filtersParamsList")
    public FiltersParamsList getFiltersParamsList() {
        return filtersParamsList;
    }

    @JsonProperty("filtersParamsList")
    public void setFiltersParamsList(FiltersParamsList filtersParamsList) {
        this.filtersParamsList = filtersParamsList;
    }

    public SearchandisingRulesListNew withFiltersParamsList(FiltersParamsList filtersParamsList) {
        this.filtersParamsList = filtersParamsList;
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
