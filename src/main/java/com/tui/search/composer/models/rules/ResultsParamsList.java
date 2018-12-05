package com.tui.search.composer.models.rules;

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
@JsonPropertyOrder({ "name", "Id", "type", "geoLevel", "resultsPerPage", "sortList", "boostList",
   "buryList" })
public class ResultsParamsList
{

   @JsonProperty("name")
   private String name;

   @JsonProperty("Id")
   private String id;

   @JsonProperty("type")
   private List<String> type = new ArrayList<String>();

   @JsonProperty("geoLevel")
   private String geoLevel;

   @JsonProperty("resultsPerPage")
   private String resultsPerPage;

   @JsonProperty("sortList")
   private List<SortList> sortList = new ArrayList<SortList>();

   @JsonProperty("boostList")
   private List<String> boostList;

   @JsonProperty("buryList")
   private List<String> buryList;

   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty("name")
   public String getName()
   {
      return name;
   }

   @JsonProperty("name")
   public void setName(String name)
   {
      this.name = name;
   }

   public ResultsParamsList withName(String name)
   {
      this.name = name;
      return this;
   }

   @JsonProperty("Id")
   public String getId()
   {
      return id;
   }

   @JsonProperty("Id")
   public void setId(String id)
   {
      this.id = id;
   }

   public ResultsParamsList withId(String id)
   {
      this.id = id;
      return this;
   }

   @JsonProperty("type")
   public List<String> getType()
   {
      return type;
   }

   @JsonProperty("type")
   public void setType(List<String> type)
   {
      this.type = type;
   }

   public ResultsParamsList withType(List<String> type)
   {
      this.type = type;
      return this;
   }

   @JsonProperty("geoLevel")
   public String getGeoLevel()
   {
      return geoLevel;
   }

   @JsonProperty("geoLevel")
   public void setGeoLevel(String geoLevel)
   {
      this.geoLevel = geoLevel;
   }

   public ResultsParamsList withGeoLevel(String geoLevel)
   {
      this.geoLevel = geoLevel;
      return this;
   }

   @JsonProperty("resultsPerPage")
   public String getResultsPerPage()
   {
      return resultsPerPage;
   }

   @JsonProperty("resultsPerPage")
   public void setResultsPerPage(String resultsPerPage)
   {
      this.resultsPerPage = resultsPerPage;
   }

   public ResultsParamsList withResultsPerPage(String resultsPerPage)
   {
      this.resultsPerPage = resultsPerPage;
      return this;
   }

   @JsonProperty("sortList")
   public List<SortList> getSortList()
   {
      return sortList;
   }

   @JsonProperty("sortList")
   public void setSortList(List<SortList> sortList)
   {
      this.sortList = sortList;
   }

   public ResultsParamsList withSortList(List<SortList> sortList)
   {
      this.sortList = sortList;
      return this;
   }

   @JsonProperty("boostList")
   public List<String> getBoostList()
   {
      return boostList;
   }

   @JsonProperty("boostList")
   public void setBoostList(List<String> boostList)
   {
      this.boostList = boostList;
   }

   public ResultsParamsList withBoostList(List<String> boostList)
   {
      this.boostList = boostList;
      return this;
   }

   @JsonProperty("buryList")
   public List<String> getBuryList()
   {
      return buryList;
   }

   @JsonProperty("buryList")
   public void setBuryList(List<String> buryList)
   {
      this.buryList = buryList;
   }

   public ResultsParamsList withBuryList(List<String> buryList)
   {
      this.buryList = buryList;
      return this;
   }

   @JsonAnyGetter
   public Map<String, Object> getAdditionalProperties()
   {
      return this.additionalProperties;
   }

   @JsonAnySetter
   public void setAdditionalProperty(String name, Object value)
   {
      this.additionalProperties.put(name, value);
   }

}
