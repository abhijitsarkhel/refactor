package com.tui.search.composer.models;

import java.util.List;

public class Holidays
{

   private String name;

   private String totalItemsCount;

   private String firstItemNum;

   private String lastItemNum;

   private String sort0;

   private String sort1;

   private String sort2;

   private Object boostList;

   private Object buryList;

   private Integer autoSelectedDuration;

   private List<Items> items = null;

   private String apiVersion;

   private String atcoreCacheVersion;

   private String node;

   private String adults;

   private String childAges;

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
    * @return the totalItemsCount
    */
   public String getTotalItemsCount()
   {
      return totalItemsCount;
   }

   /**
    * @param totalItemsCount the totalItemsCount to set
    */
   public void setTotalItemsCount(String totalItemsCount)
   {
      this.totalItemsCount = totalItemsCount;
   }

   /**
    * @return the firstItemNum
    */
   public String getFirstItemNum()
   {
      return firstItemNum;
   }

   /**
    * @param firstItemNum the firstItemNum to set
    */
   public void setFirstItemNum(String firstItemNum)
   {
      this.firstItemNum = firstItemNum;
   }

   /**
    * @return the lastItemNum
    */
   public String getLastItemNum()
   {
      return lastItemNum;
   }

   /**
    * @param lastItemNum the lastItemNum to set
    */
   public void setLastItemNum(String lastItemNum)
   {
      this.lastItemNum = lastItemNum;
   }

   /**
    * @return the sort0
    */
   public String getSort0()
   {
      return sort0;
   }

   /**
    * @param sort0 the sort0 to set
    */
   public void setSort0(String sort0)
   {
      this.sort0 = sort0;
   }

   /**
    * @return the sort1
    */
   public String getSort1()
   {
      return sort1;
   }

   /**
    * @param sort1 the sort1 to set
    */
   public void setSort1(String sort1)
   {
      this.sort1 = sort1;
   }

   /**
    * @return the sort2
    */
   public String getSort2()
   {
      return sort2;
   }

   /**
    * @param sort2 the sort2 to set
    */
   public void setSort2(String sort2)
   {
      this.sort2 = sort2;
   }

   /**
    * @return the boostList
    */
   public Object getBoostList()
   {
      return boostList;
   }

   /**
    * @param boostList the boostList to set
    */
   public void setBoostList(Object boostList)
   {
      this.boostList = boostList;
   }

   /**
    * @return the buryList
    */
   public Object getBuryList()
   {
      return buryList;
   }

   /**
    * @param buryList the buryList to set
    */
   public void setBuryList(Object buryList)
   {
      this.buryList = buryList;
   }

   public List<Items> getItems()
   {
      return items;
   }

   public void setItems(List<Items> items)
   {
      this.items = items;
   }

   /**
    * @return the autoSelectedDuration
    */
   public Integer getAutoSelectedDuration()
   {
      return autoSelectedDuration;
   }

   /**
    * @param autoSelectedDuration the autoSelectedDuration to set
    */
   public void setAutoSelectedDuration(Integer autoSelectedDuration)
   {
      this.autoSelectedDuration = autoSelectedDuration;
   }

   /**
    * @return the apiVersion
    */
   public String getApiVersion()
   {
      return apiVersion;
   }

   /**
    * @param apiVersion the apiVersion to set
    */
   public void setApiVersion(String apiVersion)
   {
      this.apiVersion = apiVersion;
   }

   /**
    * @return the atcoreCacheVersion
    */
   public String getAtcoreCacheVersion()
   {
      return atcoreCacheVersion;
   }

   /**
    * @param atcoreCacheVersion the atcoreCacheVersion to set
    */
   public void setAtcoreCacheVersion(String atcoreCacheVersion)
   {
      this.atcoreCacheVersion = atcoreCacheVersion;
   }

   /**
    * @return the node
    */
   public String getNode()
   {
      return node;
   }

   /**
    * @param node the node to set
    */
   public void setNode(String node)
   {
      this.node = node;
   }

   public String getAdults()
   {
      return adults;
   }

   public void setAdults(String adults)
   {
      this.adults = adults;
   }

   public String getChildAges()
   {
      return childAges;
   }

   public void setChildAges(String childAges)
   {
      this.childAges = childAges;
   }

}
