package com.tui.uk.search.packages.inventory.jaxb;

import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.tui.uk.search.packages.constants.SearchServiceConstants;

@Component
public class DurationAutoSelectProvider
{

   /** The Constant AUTOSELECTED_DURATION_IMPOSSIBLE. */
   private static final short AUTOSELECTED_DURATION_IMPOSSIBLE = -1;

   /**
    * Gets the durations priority list.
    *
    * @param durationsString the durations string
    * @return the durations priority list
    */
   private short[] getDurationsPriorityList(String durationsString)
   {
      if (StringUtils.isBlank(durationsString))
      {
         return ArrayUtils.EMPTY_SHORT_ARRAY;
      }

      String[] durationStrings = durationsString.split("\\s*\\,\\s*");
      short[] durations = new short[durationStrings.length];
      for (int i = 0; i < durationStrings.length; i++)
      {
         durations[i] = Short.parseShort(
            StringUtils.replace(durationStrings[i], SearchServiceConstants.PLUS_SIGN, " ").trim());
      }
      return durations;
   }

   /**
    * Select available duration.
    *
    * @param availableStays the available stays
    * @param stayParamString the stay param string
    * @param durations the durations
    * @return the short
    */
   public short selectAvailableDuration(List<Short> availableStays, String stayParamString,
      String durations)
   {
      short[] durationsPriorityList = getDurationsPriorityList(durations);

      if (StringUtils.isNotBlank(stayParamString))
      {
         short[] stayValuePriorityList = getDurationsPriorityList(stayParamString);
         for (short stayValue : stayValuePriorityList)
         {
            if (availableStays.contains(stayValue))
            {
               return stayValue;
            }
         }
      }

      for (short duration : durationsPriorityList)
      {
         if (availableStays.contains(duration))
         {
            return duration;
         }
      }
      return AUTOSELECTED_DURATION_IMPOSSIBLE;
   }
}
