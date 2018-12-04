package com.tui.search.composer.models;

import java.util.List;

public class DatesList
{

   private String name;

   private String count;

   private List<Date> dates = null;

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
    * @return the count
    */
   public String getCount()
   {
      return count;
   }

   /**
    * @param count the count to set
    */
   public void setCount(String count)
   {
      this.count = count;
   }

   /**
    * @return the dates
    */
   public List<Date> getDates()
   {
      return dates;
   }

   /**
    * @param dates the dates to set
    */
   public void setDates(List<Date> dates)
   {
      this.dates = dates;
   }

}
