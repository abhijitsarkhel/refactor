package com.tui.search.composer.constants;

public enum DiscType
{
      CUR("A"), PCT("P");

   private String discType;

   private DiscType(String discType)
   {
      this.discType = discType;
   }

   public String getDiscType()
   {
      return discType;
   }
}
