package com.tui.search.composer.utils;

import org.springframework.stereotype.Component;

/**
 * Encloses all utilities which is used to improve the expressiveness of the code.
 */
@Component
public final class SyntacticSugar
{

   /**
    * Checks if is not null.
    *
    * @param object the object
    * @return true, if is not null
    */
   public boolean isNotNull(final Object object)
   {
      return object != null;
   }

   /**
    * Checks if is null.
    *
    * @param object the object
    * @return true, if is null
    */
   public boolean isNull(final Object object)
   {
      return object == null;
   }

   /**
    * Checks if is not empty.
    *
    * @param values the values
    * @return true, if is not empty
    */
   public boolean isNotEmpty(final String[] values)
   {
      return values.length > 0;
   }

   /**
    * Checks if is empty.
    *
    * @param values the values
    * @return true, if is empty
    */
   public boolean isEmpty(final String[] values)
   {
      return values.length == 0;
   }
}
