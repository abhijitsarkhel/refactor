package com.tui.search.composer.navigation.models;

import java.util.List;

import com.tui.search.composer.models.Refinements;

/**
 * The Class Navigation.
 *
 * @author dhirendrakumar.d
 */

public class Navigation
{

   /** The refinements. */
   private List<Refinements> refinements;

   /** The site id. */
   private String site_id;

   /** The language. */
   private String language;

   /**
    * Gets the refinements.
    *
    * @return the refinements
    */
   public List<Refinements> getRefinements()
   {
      return refinements;
   }

   /**
    * Sets the refinements.
    *
    * @param refinements the new refinements
    */
   public void setRefinements(List<Refinements> refinements)
   {
      this.refinements = refinements;
   }

   /**
    * Gets the site id.
    *
    * @return the site id
    */
   public String getSite_id()
   {
      return site_id;
   }

   /**
    * Sets the site id.
    *
    * @param site_id the new site id
    */
   public void setSite_id(String site_id)
   {
      this.site_id = site_id;
   }

   /**
    * Gets the language.
    *
    * @return the language
    */
   public String getLanguage()
   {
      return language;
   }

   /**
    * Sets the language.
    *
    * @param language the new language
    */
   public void setLanguage(String language)
   {
      this.language = language;
   }

   /*
    * (non-Javadoc)
    * 
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString()
   {
      return "Navigation [refinements = " + refinements + ", site_id = " + site_id + ", language = "
         + language + "]";
   }
}