package com.tui.search.composer.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SingleSelectItem
{

   private String code;

   private String count;

   private String min;

   private String max;

   private Object name;

   private Object parentName;

   private Object parentCode;

   private Object refineProperties;

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
   public Object getName()
   {
      return name;
   }

   /**
    * @param name the name to set
    */
   public void setName(Object name)
   {
      this.name = name;
   }

   /**
    * @return the parentName
    */
   public Object getParentName()
   {
      return parentName;
   }

   /**
    * @param parentName the parentName to set
    */
   public void setParentName(Object parentName)
   {
      this.parentName = parentName;
   }

   /**
    * @return the parentCode
    */
   public Object getParentCode()
   {
      return parentCode;
   }

   /**
    * @param parentCode the parentCode to set
    */
   public void setParentCode(Object parentCode)
   {
      this.parentCode = parentCode;
   }

   /**
    * @return the refineProperties
    */
   public Object getRefineProperties()
   {
      return refineProperties;
   }

   /**
    * @param refineProperties the refineProperties to set
    */
   public void setRefineProperties(Object refineProperties)
   {
      this.refineProperties = refineProperties;
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

}
