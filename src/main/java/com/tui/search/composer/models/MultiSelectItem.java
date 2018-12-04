package com.tui.search.composer.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiSelectItem
{

   private String code;

   private String count;

   private String min;// String

   private String max;

   private String name;

   private String parentName;

   private String parentCode;

   private String type;

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
    * @return the parentName
    */
   public String getParentName()
   {
      return parentName;
   }

   /**
    * @param parentName the parentName to set
    */
   public void setParentName(String parentName)
   {
      this.parentName = parentName;
   }

   /**
    * @return the parentCode
    */
   public String getParentCode()
   {
      return parentCode;
   }

   /**
    * @param parentCode the parentCode to set
    */
   public void setParentCode(String parentCode)
   {
      this.parentCode = parentCode;
   }

   /**
    * @return the min
    */
   public String getMin()
   {
      return min;
   }

   /**
    * @param min the min to set
    */
   public void setMin(String min)
   {
      this.min = min;
   }

   /**
    * @return the max
    */
   public String getMax()
   {
      return max;
   }

   /**
    * @param max the max to set
    */
   public void setMax(String max)
   {
      this.max = max;
   }

   /**
    * @return the type
    */
   public String getType()
   {
      return type;
   }

   /**
    * @param type the type to set
    */
   public void setType(String type)
   {
      this.type = type;
   }

}
