package com.tui.search.composer.models;

/**
 * 
 * POJO is used hold the month and season details.
 *
 */
public class Month
{
   private String month;

   private String seasonType;

   private String seasonYear;

   private String available;

   public Month(final String month, final String seasonType, final String seasonYear,
                final String available)
   {
      this.month = month;
      this.seasonType = seasonType;
      this.seasonYear = seasonYear;
      this.available = available;
   }

   public String getMonth()
   {
      return month;
   }

   public String getSeasonType()
   {
      return seasonType;
   }

   public String getSeasonYear()
   {
      return seasonYear;
   }

   public String getAvailable()
   {
      return available;
   }

}
