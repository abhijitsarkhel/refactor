package com.tui.search.composer.models;

import java.util.ArrayList;
import java.util.List;

public class MonthsList
{

   private List<Month> months;

   public List<Month> getMonths()
   {
      if (months == null)
      {
         months = new ArrayList<>();
      }
      return months;
   }

   public void setMonths(List<Month> months)
   {
      this.months = months;
   }

}
