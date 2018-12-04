package com.tui.search.composer.models;

import java.util.List;

import com.tui.elastic.anite.jaxb.response.AvCache.Result.Offers.Lists;

public class Filters
{

   private String name;

   private List<Multiselect> multiselect = null;

   private List<Singleselect> singleselect = null;

   private Lists aniteLists;

   private DurationsList durationsList;

   private DatesList datesList;
   
   private MonthsList monthsList;

   /**
    * @return the name
    */
   public String getName()
   {
      return name;
   }

   /**
    * @param name the name to set
    */
   public void setName(String name)
   {
      this.name = name;
   }

   /**
    * @return the multiselect
    */
   public List<Multiselect> getMultiselect()
   {
      return multiselect;
   }

   /**
    * @param multiselect the multiselect to set
    */
   public void setMultiselect(List<Multiselect> multiselect)
   {
      this.multiselect = multiselect;
   }

   /**
    * @return the singleselect
    */
   public List<Singleselect> getSingleselect()
   {
      return singleselect;
   }

   /**
    * @param singleselect the singleselect to set
    */
   public void setSingleselect(List<Singleselect> singleselect)
   {
      this.singleselect = singleselect;
   }

   /**
    * @return the durationsList
    */
   public DurationsList getDurationsList()
   {
      return durationsList;
   }

   /**
    * @param durationsList the durationsList to set
    */
   public void setDurationsList(DurationsList durationsList)
   {
      this.durationsList = durationsList;
   }

   /**
    * @return the datesList
    */
   public DatesList getDatesList()
   {
      return datesList;
   }

   /**
    * @param datesList the datesList to set
    */
   public void setDatesList(DatesList datesList)
   {
      this.datesList = datesList;
   }

   /**
    * @return the aniteLists
    */
   public Lists getAniteLists()
   {
      return aniteLists;
   }

   /**
    * @param aniteLists the aniteLists to set
    */
   public void setAniteLists(Lists aniteLists)
   {
      this.aniteLists = aniteLists;
   }

   /**
    * @return the monthsList
    */
   public MonthsList getMonthsList()
   {
      if(monthsList == null) {
         monthsList = new MonthsList();
      }
      return monthsList;
   }

   /**
    * @param monthsList the monthsList to set
    */
   public void setMonthsList(MonthsList monthsList)
   {
      this.monthsList = monthsList;
   }

}
