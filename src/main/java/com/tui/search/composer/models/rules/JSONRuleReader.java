package com.tui.search.composer.models.rules;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Configuration
@PropertySource("classpath:environment.properties")
@Deprecated
public class JSONRuleReader
{
   private String rules = "searchandisingRules";

   private String cruiseRules = "cruiseSearchandisingRules";

   @Resource
   private Environment env;

   private static final Logger LOGGER = LogManager.getLogger(JSONRuleReader.class);

   public SearchandisingRulesList getJSONRules(Boolean cruiseFlag)
   {
      String rulesFileName = null;
      if (cruiseFlag)
      {
         rulesFileName = env.getProperty(cruiseRules);

      }
      else
      {
         rulesFileName = env.getProperty(rules);
      }

      ObjectMapper mapper = new ObjectMapper();
      SearchandisingRulesList searchandisingRulesList = null;
      try
      {
         searchandisingRulesList =
            mapper.readValue(new File(rulesFileName), SearchandisingRulesList.class);
         LOGGER.info(searchandisingRulesList.getId() + " " + searchandisingRulesList.getName() + " "
            + searchandisingRulesList.getSiteID());
      }
      catch (IOException e)
      {
         LOGGER.error("IOException while logging : " + e);
      }
      return searchandisingRulesList;
   }

   /**
    * Get JSON Deals
    * 
    * @param pageID - Deals JSON File Name
    * @return
    */
   public SearchandisingRulesList getJSONDeals(String pageID)
   {
      // Get the Deals File
      String dealsRulesFileName = pageID + ".json";

      ObjectMapper mapper = new ObjectMapper();
      SearchandisingRulesList searchandisingRulesList = null;
      try
      {

         // Getting ClassLoader obj
         ClassLoader classLoader = this.getClass().getClassLoader();
         // Getting resource(File) from class loader
         File dealsRulesFile = new File(classLoader.getResource(dealsRulesFileName).getFile());

         searchandisingRulesList = mapper.readValue(dealsRulesFile, SearchandisingRulesList.class);
         LOGGER.info(searchandisingRulesList.getId() + " " + searchandisingRulesList.getName() + " "
            + searchandisingRulesList.getSiteID());
      }
      catch (IOException e)
      {
         LOGGER.error("IOException while logging : " + e);
      }

      return searchandisingRulesList;
   }

}
