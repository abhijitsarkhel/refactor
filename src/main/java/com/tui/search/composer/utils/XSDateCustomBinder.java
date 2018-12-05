package com.tui.search.composer.utils;

import java.time.LocalDate;

import org.apache.commons.lang3.time.FastDateFormat;

public final class XSDateCustomBinder
{

   public static final String parseDate(String s)
   {
      FastDateFormat fmt = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ssZZ");
      LocalDate date = LocalDate.parse(s);
      return fmt.format(java.sql.Date.valueOf(date));
   }

   public static final String printDate(String stDate)
   {
      return stDate;
   }
}
