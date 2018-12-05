package com.tui.search.composer.inventory.jaxb;

import java.util.ArrayList;
import java.util.Iterator;

public class Attribute<T> extends ArrayList<T>
{
   private static final long serialVersionUID = 4663785691777488696L;

   @Override
   public String toString()
   {
      if (size() < 1)
      {
         return "";
      }
      Object result = get(0);
      return ((result == null) ? "" : result.toString());
   }

   public String toString(String delim)
   {
      if (size() == 0)
      {
         return "";
      }

      StringBuilder retVal = new StringBuilder();
      for (Iterator i$ = iterator(); i$.hasNext();)
      {
         Object value = i$.next();
         if (retVal.length() > 0)
         {
            retVal.append(delim);
         }
         if (value != null)
         {
            retVal.append(value);
         }
      }
      return retVal.toString();
   }
}