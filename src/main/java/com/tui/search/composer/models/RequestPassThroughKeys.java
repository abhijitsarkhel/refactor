package com.tui.search.composer.models;

import java.util.Set;
import java.util.regex.Pattern;

public class RequestPassThroughKeys
{
   protected Set<?> allowedPassthroughKeys;

   protected Set<Pattern> allowedPassthroughPatterns;

   /**
    * @return the allowedPassthroughKeys
    */
   public Set<?> getAllowedPassthroughKeys()
   {
      return allowedPassthroughKeys;
   }

   /**
    * @param allowedPassthroughKeys the allowedPassthroughKeys to set
    */
   public void setAllowedPassthroughKeys(Set<?> allowedPassthroughKeys)
   {
      this.allowedPassthroughKeys = allowedPassthroughKeys;
   }

   /**
    * @return the allowedPassthroughPatterns
    */
   public Set<Pattern> getAllowedPassthroughPatterns()
   {
      return allowedPassthroughPatterns;
   }

   /**
    * @param allowedPassthroughPatterns the allowedPassthroughPatterns to set
    */
   public void setAllowedPassthroughPatterns(Set<Pattern> allowedPassthroughPatterns)
   {
      this.allowedPassthroughPatterns = allowedPassthroughPatterns;
   }

}
