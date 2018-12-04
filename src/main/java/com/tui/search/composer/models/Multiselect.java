package com.tui.search.composer.models;

import java.util.List;

public class Multiselect
{

   private String name;

   private String code;

   private List<MultiSelectItem> items = null;

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
    * @return the code
    */
   public String getCode()
   {
      return code;
   }

   /**
    * @param code the code to set
    */
   public void setCode(String code)
   {
      this.code = code;
   }

   public List<MultiSelectItem> getItems()
   {
      return items;
   }

   public void setItems(List<MultiSelectItem> items)
   {
      this.items = items;
   }

}
