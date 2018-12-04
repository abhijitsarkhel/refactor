package com.tui.search.composer.models;

public class DestinationOption
{

   public DestinationOption()
   {
   }

   public DestinationOption(String name, String type, String code, String parentLevel)
   {
      super();
      this.name = name;
      this.type = type;
      this.code = code;
      this.parentLevel = parentLevel;
   }

   String name;

   String type;

   String code;

   String parentLevel;

   public String getType()
   {
      return type;
   }

   public void setType(String type)
   {
      this.type = type;
   }

   public String getName()
   {
      return name;
   }

   public String getCode()
   {
      return code;
   }

   public void setCode(String code)
   {
      this.code = code;
   }

   public String getParentLevel()
   {
      return parentLevel;
   }

   public void setParentLevel(String parentLevel)
   {
      this.parentLevel = parentLevel;
   }

   public void setName(String name)
   {
      this.name = name;
   }

}
