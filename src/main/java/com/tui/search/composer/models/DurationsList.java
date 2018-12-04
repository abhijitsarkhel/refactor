package com.tui.search.composer.models;

import java.util.List;

public class DurationsList
{

   private String name;

   private long count;

   private List<Short> durations;

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
   public long getCount()
   {
      return count;
   }

   /**
    * @param count the count to set
    */
   public void setCount(long count)
   {
      this.count = count;
   }

   /**
    * @return the durations
    */
   public List<Short> getDurations()
   {
      return durations;
   }

   /**
    * @param durations the durations to set
    */
   public void setDurations(List<Short> durations)
   {
      this.durations = durations;
   }

}
