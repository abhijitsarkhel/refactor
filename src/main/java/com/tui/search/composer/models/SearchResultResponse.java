package com.tui.search.composer.models;

/**
 *
 * @author lakshmipathi.d
 *
 */
public class SearchResultResponse
{

   Filters filters;

   Holidays holidays;

   ConfigParamsList configParamsList;

   /**
    * @return the configParamsList
    */
   public ConfigParamsList getConfigParamsList()
   {
      return configParamsList;
   }

   /**
    * @param configParamsList the configParamsList to set
    */
   public void setConfigParamsList(ConfigParamsList configParamsList)
   {
      this.configParamsList = configParamsList;
   }

   /**
    * @return the filters
    */
   public Filters getFilters()
   {
      return filters;
   }

   /**
    * @param filters the filters to set
    */
   public void setFilters(Filters filters)
   {
      this.filters = filters;
   }

   /**
    * @return the holidays
    */
   public Holidays getHolidays()
   {
      return holidays;
   }

   /**
    * @param holidays the holidays to set
    */
   public void setHolidays(Holidays holidays)
   {
      this.holidays = holidays;
   }

}
