package com.tui.uk.search.packages.inventory.jaxb;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections4.list.UnmodifiableList;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.tui.uk.search.packages.inventory.jaxb.InventoryListByAccommodationResponse.AniteOffer;
import com.tui.uk.search.packages.inventory.jaxb.JaxbWrapperAniteResponse.JaxbAniteOffer.JaxbAniteAccommodation;

@Component
public class LegacyAdapter<BackingObjectType>
   implements MdexAniteJoinAdapter<BackingObjectType, String>
{
   protected String corporateCodeFieldName;

   protected String accommodationCodeAccessor;

   protected String multicenterCodeAccessor;

   protected List<String> requiredFields;

   private String siteId;

   protected String brandCodeAccessor;

   @Resource
   protected CodeFormatAdapter codeFormatAdapter;

   @Override
   public AniteCodeAndRecordFilter buildAniteCodeAndRecordFilter(
      AniteOffer<BackingObjectType> offer, Set<String> corpcpdes)
      throws InventoryUnmarshallingException
   {
      final String aniteCode = getAniteCode(offer, corpcpdes);
      final String aniteBrand = getAniteBrand(offer);
      // Create the record Filter
      StringBuilder sb = new StringBuilder();
      sb.append(getCorporateCodeFieldName());
      sb.append(":");
      sb.append(aniteCode);
      if (StringUtils.isNotBlank(aniteBrand))
      {
         sb.append("|").append(aniteBrand);
      }

      final String recordFilter = sb.toString();

      return new AniteCodeAndRecordFilter()
      {
         @Override
         public String getAniteCode()
         {
            return aniteCode;
         }

         @Override
         public String getAniteBrand()
         {
            return aniteBrand;
         }

         @Override
         public String getRecordFilter()
         {
            return recordFilter;
         }
      };
   }

   private String getAniteBrand(AniteOffer<BackingObjectType> offer)
   {
      try
      {
         if (!StringUtils.containsIgnoreCase(getCorporateCodeFieldName(), "p_code"))
         {
            return getAccommodationBrand(offer);
         }
      }
      catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e)
      {
         throw new RuntimeException(e);
      }
      
      return null;
   }

   protected String getAccommodationBrand(AniteOffer offer)
      throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
   {
      return BeanUtils.getProperty(offer, getBrandCodeAccessor());
   }

   public String getAniteCode(AniteOffer<BackingObjectType> offer, Set<String> corpcodes)
      throws InventoryUnmarshallingException
   {
      String aniteCode;
      try
      {
         aniteCode = getAccommodationCode(offer, corpcodes);
      }
      catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e)
      {
         throw new InventoryUnmarshallingException(e);
      }

      if (null == aniteCode)
         throw new InventoryUnmarshallingException(
            "Cannot determine accommodation code from Anite offer");
      return codeFormatAdapter.anite2elastic(aniteCode);
   }

   public String getCorporateCodeFieldName()
   {
      return corporateCodeFieldName;
   }

   public void setCorporateCodeFieldName(String corporateCodeFieldName)
   {
      this.corporateCodeFieldName = corporateCodeFieldName;
      this.requiredFields =
         UnmodifiableList.unmodifiableList(Arrays.asList(new String[] { corporateCodeFieldName }));
   }

   protected String getAccommodationCode(AniteOffer offer, Set<String> corpcodes)
      throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
   {

      String accomcodeaccessor = getAccommodationCodeAccessor();

      List<JaxbAniteAccommodation> lst = new ArrayList<>();
      Iterator<JaxbAniteAccommodation> itt = offer.getAccommodation().iterator();

      while (itt.hasNext())
      {
         lst.add(itt.next());
      }
      String replaceBeanAccessor = null;

      if (lst.size() > 1)
      {
         if (multicenterCodeAccessor.matches("(.*)multiCentre(.*)"))
         {
            return BeanUtils.getProperty(offer, getMulticenterCodeAccessor());
         }
         else if (accomcodeaccessor.matches("(.*)accom(.*)"))
         {
            int i = findIndex(lst, corpcodes);
            replaceBeanAccessor = accomcodeaccessor.replace("accom[0]", "accom" + "[" + i + "]");
            return BeanUtils.getProperty(offer, replaceBeanAccessor);
         }
      }
      else if (lst.size() == 1)
      {
         return BeanUtils.getProperty(offer, "backingObject.accom[0].id");
      }
      return BeanUtils.getProperty(offer, getAccommodationCodeAccessor());

   }

   public int findIndex(List<JaxbAniteAccommodation> lst, Set<String> corpcodes)
   {
      for (int i = 0; i < lst.size(); i++)
      {
         if (corpcodes.contains(lst.get(i).accom.getId()))
            return i;
      }
      return 0;
   }

   public String getAccommodationCodeAccessor()
   {
      return accommodationCodeAccessor;
   }

   public void setAccommodationCodeAccessor(String accommodationCodeAccessor)
   {
      this.accommodationCodeAccessor = accommodationCodeAccessor;
   }

   public List<String> getRequiredFields()
   {
      return requiredFields;
   }

   public String getSiteId()
   {
      return siteId;
   }

   public void setSiteId(String siteId)
   {
      this.siteId = siteId;
   }

   /**
    * @return the multicenterCodeAccessor
    */
   public String getMulticenterCodeAccessor()
   {
      return multicenterCodeAccessor;
   }

   /**
    * @param multicenterCodeAccessor the multicenterCodeAccessor to set
    */
   public void setMulticenterCodeAccessor(String multicenterCodeAccessor)
   {
      this.multicenterCodeAccessor = multicenterCodeAccessor;
   }

   public String getBrandCodeAccessor()
   {
      return brandCodeAccessor;
   }

   public void setBrandCodeAccessor(String brandCodeAccessor)
   {
      this.brandCodeAccessor = brandCodeAccessor;
   }

}
