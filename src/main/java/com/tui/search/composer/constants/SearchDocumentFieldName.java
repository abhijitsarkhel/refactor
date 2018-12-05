package com.tui.search.composer.constants;

public enum SearchDocumentFieldName
{

      NAME("name"), REGION("region"), ACCOMMODATIONNAME("accommodationName"),
      BRANDTYPE("brandType"), ALLRESORTS("allresorts"), CODE("code"),
      PRODUCTRANGE_TH("productRange"), DESTINATION("location"), ALLCOUNTRIES("allcountries"),
      COUNTRY("country"), ALLDESTINATIONS("alldestinations"), SITEID("siteId"),
      BRANDCODE("brandCode"), ALLREGIONS("allregions"), REVIEWRATING("reviewRating"),
      CONTINENT("continent"), BRAND("brand"), RESORT("resort"), ALLCONTINENTS("allcontinents"),
      CRUISESTAYGEOHIERARCHY("cruisestayGeoHierarchy"), TYPE("type"),

      GEOHIERARCHY("geohierarchy"), PK("pk"), PRODUCTRANGE("productRange"),
      FACILITIES("facilities"), ITEMTYPE("itemType"), ITEMSUBTYPE("itemSubType"),
      ITEMCODE("itemCode"), LATITUDE("latitude"), LONGITUDE("longitude"),
      THOMSONRATING("THOMSONRATING"), TRATING("tRating"), TRIPADVISORRATING("tripAdvisorRating"),
      HOTELGROUPLOGOS("hotelGroupLogos"), GEOCOORDINATE("geoCoordinate"), RATING("rating"),
      HOLIDAYTYPE("holidayType"), LOCATION("location"),

      GEOCODE("GEOCODE"),

      RECORDTYPE("recordType"), // itemType
      RECORDSUBTYPE("recordSubType"), // itemSubType
      FACET("facet"), FACETFILTER("facetfilter"), SUGGEST("suggest"), SEQUENCED("sequenced"),

      SIZE("size"), COLOR("color"), DESTINATIONOPTIONS("destinationoptions"),
      SPECIFICATIONS("specifications"), RESOLUTION("resolution"), MEMORY("memory"),

      PARENTLEVEL("parentLevel"), HOLIDAYCATEGORY("holidayCategory"), ARRAIRPORT("arrAirport"),
      DESTINATIONNAME("destinationName"), LINKEDPRODUCTCODE("linkedProductCode");

   private static final String _SCORE_DOC_BOOSTFACTOR_VALUE = "_score + doc.boostfactor.value";

   protected static final String[] productQueryFields =
      { ACCOMMODATIONNAME.getFieldName(), COUNTRY.getFieldName(), PK.getFieldName() };

   protected static final String[] productDocumentFields =
      { REGION.getFieldName(), ACCOMMODATIONNAME.getFieldName(), BRANDTYPE.getFieldName(),
         CONTINENT.getFieldName(), PK.getFieldName(),

      };

   private String fieldName;

   private SearchDocumentFieldName(String fieldName)
   {
      this.fieldName = fieldName;
   }

   public String getFieldName()
   {
      return fieldName;
   }

   public static String getCalculatedScoreScriptForBostFactor()
   {
      return _SCORE_DOC_BOOSTFACTOR_VALUE;
   }

}
