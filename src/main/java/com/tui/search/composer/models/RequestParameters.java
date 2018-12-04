package com.tui.search.composer.models;

import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.tui.uk.search.packages.rules.pojos.Destination;

/**
 * The Interface RequestParameters.
 */
public interface RequestParameters
{

   /**
    * Sets the earliest departure date.
    *
    * @param startDate the new earliest departure date
    */
   void setEarliestDepartureDate(Date startDate);

   /**
    * Gets the query map.
    *
    * @return the query map
    */
   Map<String, List<String>> getQueryMap();

   /**
    * Gets the brand.
    *
    * @return the brand
    */
   Set<String> getBrand();

   /**
    * Gets the accommodations.
    *
    * @return the accommodations
    */
   Collection<String> getAccommodations();

   /**
    * Gets the accommodations string.
    *
    * @return the accommodations string
    */
   // AniteRequiredParameters: anite Required Parameters
   String getAccommodationsString();

   /**
    * Gets the accommodations count.
    *
    * @return the accommodations count
    */
   int getAccommodationsCount();

   /**
    * Gets the departure airports string.
    *
    * @return the departure airports string
    */
   String getDepartureAirportsString();

   /**
    * Gets the adult pax.
    *
    * @return the adult pax
    */
   int getAdultPax();

   /**
    * Gets the child ages.
    *
    * @return the child ages
    */
   int[] getChildAges();

   /**
    * Gets the room count.
    *
    * @return the room count
    */
   int getRoomCount();

   /**
    * Gets the earliest departure date string.
    *
    * @return the earliest departure date string
    */
   String getEarliestDepartureDateString();

   /**
    * Gets the latest departure date string.
    *
    * @return the latest departure date string
    */
   String getLatestDepartureDateString();

   /**
    * Gets the durations string.
    *
    * @return the durations string
    */
   String getDurationsString();

   /**
    * Gets the market.
    *
    * @return the market
    */
   String getMarket();

   /**
    * Gets the promotions string.
    *
    * @return the promotions string
    */
   String getPromotionsString();

   /**
    * Gets the promotions count.
    *
    * @return the promotions count
    */
   int getPromotionsCount();

   /**
    * Gets the holiday type.
    *
    * @return the holiday type
    */
   HolidayType getHolidayType();

   /**
    * Gets the search type.
    *
    * @return the search type
    */
   String getSearchType();

   /**
    * Gets the cruise stay duration.
    *
    * @return the cruise stay duration
    */
   String getCruiseStayDuration();

   /**
    * Gets the cruise accom duration.
    *
    * @return the cruise accom duration
    */
   String getCruiseAccomDuration();

   /**
    * Gets the cruise order.
    *
    * @return the cruise order
    */
   String getCruiseOrder();

   /**
    * Gets the site id.
    *
    * @return the site id
    */
   String getSiteId();

   /**
    * Gets the rating.
    *
    * @return the rating
    */
   // AniteParameters
   String getRating();

   /**
    * Gets the earliest departure date.
    *
    * @return the earliest departure date
    * @throws ParseException the parse exception
    */
   Date getEarliestDepartureDate() throws ParseException;

   /**
    * Gets the date format pattern.
    *
    * @return the date format pattern
    */
   String getDateFormatPattern();

   /**
    * Gets the passthrough map.
    *
    * @return the passthrough map
    */
   Map<String, String> getPassthroughMap();

   /**
    * Checks if is faceting.
    *
    * @return true, if is faceting
    */
   boolean isFaceting();

   /**
    * Gets the board basis.
    *
    * @return the board basis
    */
   String getBoardBasis();

   /**
    * Gets the dream liner.
    *
    * @return the dream liner
    */
   String getDreamLiner();

   /**
    * Gets the sorting parameter.
    *
    * @return the sorting parameter
    */
   String getSortingParameter();

   /**
    * Sets the sorting parameter.
    *
    * @param ns the new sorting parameter
    */
   void setSortingParameter(String ns);

   /**
    * Sets the room count.
    *
    * @param roomCount the new room count
    */
   void setRoomCount(int roomCount);

   /**
    * Sets the rooms.
    *
    * @param rooms the new rooms
    */
   void setRooms(String rooms);

   /**
    * Gets the rooms.
    *
    * @return the rooms
    */
   String getRooms();

   /**
    * Sets the room.
    *
    * @param room the new room
    */
   void setRoom(String room);

   /**
    * Gets the room.
    *
    * @return the room
    */
   String getRoom();

   /**
    * Sets the room BB.
    *
    * @param roombb the new room BB
    */
   void setRoomBB(String roombb);

   /**
    * Gets the room BB.
    *
    * @return the room BB
    */
   String getRoomBB();

   /**
    * Sets the latest departure date string.
    *
    * @param latestDepartureDateString the new latest departure date string
    */
   void setLatestDepartureDateString(String latestDepartureDateString);

   /**
    * Sets the earliest departure date string.
    *
    * @param earliestDepartureDateString the new earliest departure date string
    */
   void setEarliestDepartureDateString(String earliestDepartureDateString);

   /**
    * Sets the durations string.
    *
    * @param durationsString the new durations string
    */
   void setDurationsString(String durationsString);

   /**
    * Sets the child ages.
    *
    * @param childAges the new child ages
    */
   void setChildAges(int[] childAges);

   /**
    * Sets the adult pax.
    *
    * @param adultPax the new adult pax
    */
   void setAdultPax(int adultPax);

   /**
    * Sets the accommodations string.
    *
    * @param accommodationsString the new accommodations string
    */
   void setAccommodationsString(String accommodationsString);

   /**
    * Sets the date format pattern.
    *
    * @param dateFormatPattern the new date format pattern
    */
   void setDateFormatPattern(String dateFormatPattern);

   /**
    * Sets the accommodations.
    *
    * @param accommodations the new accommodations
    */
   void setAccommodations(String[] accommodations);

   /**
    * Sets the accommodations.
    *
    * @param accommodations the new accommodations
    */
   void setAccommodations(Collection<String> accommodations);

   /**
    * Sets the faceting.
    *
    * @param facetingActive the new faceting
    */
   void setFaceting(boolean facetingActive);

   /**
    * Sets the market.
    *
    * @param market the new market
    */
   void setMarket(String market);

   /**
    * Sets the promotions string.
    *
    * @param promotionsString the new promotions string
    */
   void setPromotionsString(String promotionsString);

   /**
    * Sets the promotions.
    *
    * @param promotionStrings the new promotions
    */
   void setPromotions(String... promotionStrings);

   /**
    * Gets the promotions.
    *
    * @return the promotions
    */
   String[] getPromotions();

   /**
    * Sets the board basis.
    *
    * @param boardBasis the new board basis
    */
   void setBoardBasis(String boardBasis);

   /**
    * Sets the dream liner.
    *
    * @param dreamLiner the new dream liner
    */
   void setDreamLiner(String dreamLiner);

   /**
    * Sets the candidate durations string.
    *
    * @param durations the new candidate durations string
    */
   void setCandidateDurationsString(String durations);

   /**
    * Sets the search type.
    *
    * @param searchTypeString the new search type
    */
   void setSearchType(String searchTypeString);

   /**
    * Sets the site id.
    *
    * @param siteId the new site id
    */
   void setSiteId(String siteId);

   /**
    * Sets the cruise stay duration.
    *
    * @param cruiseStayDuration the new cruise stay duration
    */
   void setCruiseStayDuration(String cruiseStayDuration);

   /**
    * Sets the cruise accom duration.
    *
    * @param cruiseAccomDuration the new cruise accom duration
    */
   void setCruiseAccomDuration(String cruiseAccomDuration);

   /**
    * Sets the cruise order.
    *
    * @param cruiseOrder the new cruise order
    */
   void setCruiseOrder(String cruiseOrder);

   /**
    * Sets the brand.
    *
    * @param brand the new brand
    */
   void setBrand(Set<String> brand);

   /**
    * Sets the holiday type string.
    *
    * @param holidayType the new holiday type string
    */
   void setHolidayTypeString(String holidayType);

   /**
    * Gets the holiday type string.
    *
    * @return the holiday type string
    */
   String getHolidayTypeString();

   /**
    * Sets the query map.
    *
    * @param queryMap the query map
    */
   void setQueryMap(Map<String, List<String>> queryMap);

   /**
    * Sets the child age strings.
    *
    * @param ageStrings the new child age strings
    */
   void setChildAgeStrings(String[] ageStrings);

   /**
    * Sets the departure airports.
    *
    * @param airports the new departure airports
    */
   void setDepartureAirports(String[] airports);

   /**
    * Sets the durations.
    *
    * @param durations the new durations
    */
   void setDurations(String[] durations);

   /**
    * Gets the candidate durations string.
    *
    * @return the candidate durations string
    */
   String getCandidateDurationsString();

   /**
    * Gets the anite query type.
    *
    * @return the anite query type
    */
   int getAniteQueryType();

   /**
    * Sets the anite query type.
    *
    * @param aniteQueryType the new anite query type
    */
   void setAniteQueryType(int aniteQueryType);

   /**
    * Sets the first rec num.
    *
    * @param firstRecNum the new first rec num
    */
   void setFirstRecNum(String firstRecNum);

   /**
    * Sets the rec per page.
    *
    * @param recPerPage the new rec per page
    */
   void setRecPerPage(String recPerPage);

   /**
    * Gets the rec per page.
    *
    * @return the rec per page
    */
   String getRecPerPage();

   /**
    * Gets the first rec num.
    *
    * @return the first rec num
    */
   String getFirstRecNum();

   /**
    * Sets the rule request.
    *
    * @param rulesRequest the new rule request
    */
   void setRulesRequest(RulesRequest rulesRequest);

   /**
    * Gets the rules request.
    *
    * @return the rules request
    */
   RulesRequest getRulesRequest();

   /**
    * Gets the main search type.
    *
    * @return the main search type
    */
   String getMainSearchType();

   /**
    * Sets the main search type.
    *
    * @param mainSearchType the new main search type
    */
   void setMainSearchType(String mainSearchType);

   /**
    * Gets the holiday category.
    *
    * @return the holiday category
    */
   String getHolidayCategory();

   /**
    * Sets the holiday category.
    *
    * @param holidayCategory the new holiday category
    */
   void setHolidayCategory(String holidayCategory);

   /**
    * Gets the cabin.
    *
    * @return the cabin
    */
   String getCabin();

   /**
    * Sets the cabin.
    *
    * @param cabin the new cabin
    */
   void setCabin(String cabin);

   /**
    * Gets the cruise trai.
    *
    * @return the cruise trai
    */
   String getCruiseTrai();

   /**
    * Sets the cruise trai.
    *
    * @param cruiseTrai the new cruise trai
    */
   void setCruiseTrai(String cruiseTrai);

   /**
    * Gets the cruise trao.
    *
    * @return the cruise trao
    */
   String getCruiseTrao();

   /**
    * Sets the cruise trao.
    *
    * @param cruiseTrao the new cruise trao
    */
   void setCruiseTrao(String cruiseTrao);

   /**
    * Gets the price type.
    *
    * @return the price type
    */
   String getPriceType();

   /**
    * Sets the p type.
    *
    * @param pType the new p type
    */

   void setPriceType(String pType);

   /**
    * Gets the seats.
    *
    * @return the seats
    */
   String getSeats();

   /**
    * Sets the seats.
    *
    * @param seats the new seats
    */
   void setSeats(String seats);

   /**
    * Gets the f.
    *
    * @return the f
    */
   String getFacetParam();

   /**
    * Sets the f.
    *
    * @param f the new f
    */
   void setFacetParam(String f);

   /**
    * Gets the channel.
    *
    * @return the channel
    */
   String getChannel();

   /**
    * Sets the channel.
    *
    * @param channel the new channel
    */
   void setChannel(String channel);

   /**
    * Gets the cruise type.
    *
    * @return the cruise type
    */
   String getCruiseType();

   /**
    * Sets the cruise type.
    *
    * @param cType the new cruise type
    */
   void setCruiseType(String cType);

   /**
    * Sets the request type.
    *
    * @return the request type
    */
   void setRequestType(String requestType);

   /**
    * Gets the request type.
    *
    * @return the request type
    */
   String getRequestType();

   void setCacheEnable(String cacheEnabled);

   /**
    * Gets the cache enable.
    *
    * @return the cache enable
    */
   String getCacheEnable();

   /**
    * Gets the system info.
    *
    * @return the system info
    */
   String getSystemInfo();

   /**
    * Sets the system info.
    *
    * @param systemInfo the new system info
    */
   void setSystemInfo(String systemInfo);

   /**
    * Gets the anite request.
    *
    * @return the anite request
    */
   String getAniteRequest();

   /**
    * Sets the template id.
    *
    * @param templateId the new template id
    */
   void setTemplateId(String templateId);

   /**
    * Gets the template id.
    *
    * @return the template id
    */
   String getTemplateId();

   /**
    * Gets the stop over.
    *
    * @return the stop over
    */
   String getStopOver();

   /**
    * Sets the stop over.
    *
    * @param stopOver the new stop over
    */
   void setStopOver(String stopOver);

   /**
    * Gets the session id.
    *
    * @return the session id
    */
   String getSessionId();

   /**
    * Gets the free kid.
    *
    * @return the free kid
    */
   String getFreeKid();

   /**
    * Gets the hlo.
    *
    * @return the hlo
    */
   String getHlo();

   /**
    * Gets the tpf.
    *
    * @return the tpf
    */
   String getTpf();

   /**
    * Gets the tpa.
    *
    * @return the tpa
    */
   String getTpa();

   /**
    * Gets the anite search type.
    *
    * @return the anite search type
    */
   String getAniteSearchType();

   /**
    * Gets the req sdate.
    *
    * @return the req sdate
    */
   String getReqSdate();

   /**
    * Gets the req edate.
    *
    * @return the req edate
    */
   String getReqEdate();

   /**
    * Gets the merchandise durations.
    *
    * @return the merchandise durations
    */
   String getMerchandiseDurations();

   /**
    * Gets the page number.
    *
    * @return the page number
    */
   String getPageNumber();

   /**
    * Gets the season year.
    *
    * @return the season year
    */
   String getSeasonYear();

   /**
    * Gets the type 1 duration.
    *
    * @return the type 1 duration
    */
   String getType1Duration();

   /**
    * Gets the disc type.
    *
    * @return the disc type
    */
   DiscType getDiscType();

   /**
    * Gets the min disc.
    *
    * @return the min disc
    */
   String getMinDisc();

   /**
    * Gets the max disc.
    *
    * @return the max disc
    */
   String getMaxDisc();

   /**
    * Gets the request uri.
    *
    * @return the request uri
    */
   String getRequestUri();

   /**
    * Gets the group method.
    *
    * @return the group method
    */
   String getGroupMethod();

   /**
    * Gets the page name.
    *
    * @return the page name
    */
   String getPageName();

   /**
    * Sets the page name.
    *
    * @param pageName the new page name
    */
   void setPageName(String pageName);

   /**
    * Gets the best for.
    *
    * @return the best for
    */
   Set<String> getBestFor();

   /**
    * Sets the best for.
    *
    * @param bestFor the new best for
    */
   void setBestFor(Set<String> bestFor);

   /**
    * Gets the linked product code.
    *
    * @return the linked product code
    */
   String getLinkedProductCode();

   /**
    * Sets the linked product code.
    *
    * @param linkedProductCode the new linked product code
    */
   void setLinkedProductCode(String linkedProductCode);

   /**
    * Sets the uk port.
    *
    * @param uKPort the new uk port
    */
   void setUkPort(String uKPort);

   /**
    * Gets the uk port.
    *
    * @return the uk port
    */
   String getUkPort();

   /**
    * Sets the cabin only.
    *
    * @param cabinOnly the new cabin only
    */
   void setCabinOnly(String cabinOnly);

   /**
    * Gets the cabin only.
    *
    * @return the cabin only
    */
   String getCabinOnly();

   /**
    * Sets the dep port.
    *
    * @param depPort the new dep port
    */
   void setDepPort(String depPort);

   /**
    * Gets the dep port.
    *
    * @return the dep port
    */
   String getDepPort();

   /**
    * Sets the arr airport.
    *
    * @param arrAirport the new arr airport
    */
   void setArrAirport(Set<String> arrAirport);

   /**
    * Gets the arr airport.
    *
    * @return the arr airport
    */
   Set<String> getArrAirport();

   /**
    * Gets the hotel type.
    *
    * @return the hotel type
    */
   String getHotelType();

   /**
    * Sets the hotel type.
    *
    * @param hotelType the new hotel type
    */
   void setHotelType(String hotelType);

   /**
    * Sets the item sub type.
    *
    * @param itemSubType the new item sub type
    */
   void setItemSubType(String itemSubType);

   /**
    * Gets the item sub type.
    *
    * @return the item sub type
    */
   String getItemSubType();

   /**
    * Gets the accom features.
    *
    * @return the accom features
    */
   Set<String> getAccomFeatures();

   /**
    * Gets the product range.
    *
    * @return the product range
    */
   Set<String> getProductRange();

   /**
    * Sets the product range.
    *
    * @param productRange the new product range
    */
   void setProductRange(Set<String> productRange);

   /**
    * Gets the t rating.
    *
    * @return the t rating
    */
   String gettRating();

   /**
    * Sets the t rating.
    *
    * @param tRating the new t rating
    */
   void settRating(String tRating);

   /**
    * Gets the trip advisor rating.
    *
    * @return the trip advisor rating
    */
   String getTripAdvisorRating();

   /**
    * Sets the trip advisor rating.
    *
    * @param tripAdvisorRating the new trip advisor rating
    */
   void setTripAdvisorRating(String tripAdvisorRating);

   /**
    * Sets the anite request.
    *
    * @param aniteRequest the new anite request
    */
   void setAniteRequest(String aniteRequest);

   /**
    * Sets the free kid.
    *
    * @param freeKid the new free kid
    */
   void setFreeKid(String freeKid);

   /**
    * Gets the ship name.
    *
    * @return the ship name
    */
   Set<String> getShipName();

   /**
    * Sets the ship name.
    *
    * @param shipName the new ship name
    */
   void setShipName(Set<String> shipName);

   /**
    * Sets the group method.
    *
    * @param groupMethod the new group method
    */
   void setGroupMethod(String groupMethod);

   /**
    * Gets the cruise dest.
    *
    * @return the cruise dest
    */
   String getCruiseDest();

   /**
    * Sets the cruise dest.
    *
    * @param cruiseDest the new cruise dest
    */
   void setCruiseDest(String cruiseDest);

   /**
    * Gets the stay location.
    *
    * @return the stay location
    */
   String getStayLocation();

   /**
    * Sets the stay location.
    *
    * @param stayLocation the new stay location
    */
   void setStayLocation(String stayLocation);

   /**
    * Sets the accom features.
    *
    * @param accomFeatures the new accom features
    */
   void setAccomFeatures(Set<String> accomFeatures);

   /**
    * Gets the response type.
    *
    * @return the response type
    */
   String getResponseType();

   /**
    * Sets the response type.
    *
    * @param responseType the new response type
    */
   void setResponseType(String responseType);

   /**
    * Gets the page type.
    *
    * @return the page type
    */
   String getPageType();

   /**
    * Sets the page type.
    *
    * @param pageType the new page type
    */
   void setPageType(String pageType);

   /**
    * Gets the package date string.
    *
    * @return the package date string
    */
   String getPackageDateString();

   /**
    * Sets the package date string.
    *
    * @param parameter the new package date string
    */
   void setPackageDateString(String parameter);

   /**
    * Gets the package airport.
    *
    * @return the package airport
    */
   String getPackageAirport();

   /**
    * Sets the package airport.
    *
    * @param pkgAirport the new package airport
    */
   void setPackageAirport(String pkgAirport);

   /**
    * Gets the package info.
    *
    * @return the package info
    */
   String getPackageInfo();

   /**
    * Sets the package info.
    *
    * @param pkgInfo the new package info
    */
   void setPackageInfo(String pkgInfo);

   /**
    * Sets the tpf.
    *
    * @param tpf the new tpf
    */
   void setTpf(String tpf);

   /**
    * Sets the departure airports string.
    *
    * @param departureAirportsString the new departure airports string
    */
   void setDepartureAirportsString(String departureAirportsString);

   /**
    * Sets the pkg.
    *
    * @param string the new pkg
    */
   void setPkg(String string);

   /**
    * Gets the pkg.
    *
    * @return the pkg
    */
   String getPkg();

   /**
    * Sets the tra O.
    *
    * @param string the new tra O
    */
   void setTraO(String string);

   /**
    * Gets the tra O.
    *
    * @return the tra O
    */
   String getTraO();

   /**
    * Sets the tra I.
    *
    * @param string the new tra I
    */
   void setTraI(String string);

   /**
    * Gets the tra I.
    *
    * @return the tra I
    */
   String getTraI();

   /**
    * Sets the brws.
    *
    * @param brws the new brws
    */
   void setBrws(String brws);

   /**
    * Gets the brws.
    *
    * @return the brws
    */
   String getBrws();

   /**
    * Sets the available airports.
    *
    * @param availableAirports the new available airports
    */
   void setAvailableAirports(String[] availableAirports);

   /**
    * Sets the available airports string.
    *
    * @param availableAirportsString the new available airports string
    */
   void setAvailableAirportsString(String availableAirportsString);

   /**
    * Gets the available airports string.
    *
    * @return the available airports string
    */
   String getAvailableAirportsString();

   /**
    * Gets the destinations.
    *
    * @return the destinations
    */
   Set<Destination> getDestinations();

   /**
    * Sets the destinations.
    *
    * @param destinations the new destinations
    */
   void setDestinations(Set<Destination> destinations);

   /**
    * Sets the cabin class.
    *
    * @param cabinClass the new cabin class
    */
   void setCabinClass(String cabinClass);

   /**
    * Gets the cabin class.
    *
    * @return the cabin class
    */
   String getCabinClass();

   /**
    * Sets the disc type.
    *
    * @param valueOf the new disc type
    */
   void setDiscType(DiscType valueOf);

   /**
    * Sets the hlo.
    *
    * @param string the new hlo
    */
   void setHlo(String string);

   /**
    * Sets the tpa.
    *
    * @param string the new tpa
    */
   void setTpa(String string);

   /**
    * Gets the accom name.
    *
    * @return the accom name
    */
   Set<String> getAccomName();

   /**
    * Sets the accom name.
    *
    * @param accomName the new accom name
    */
   void setAccomName(Set<String> accomName);

   /**
    * Gets the holiday sub type.
    *
    * @return the holiday sub type
    */
   Set<String> getHolidaySubType();

   /**
    * Sets the holiday sub type.
    *
    * @param holidaySubType the new holiday sub type
    */
   void setHolidaySubType(Set<String> holidaySubType);

   /**
    * Gets the type.
    *
    * @return the type
    */
   Set<String> getType();

   /**
    * Sets the type.
    *
    * @param type the new type
    */
   void setType(Set<String> type);

   /**
    * Sets the inits the end date.
    *
    * @param initEndDate the new inits the end date
    */
   void setInitEndDate(String initEndDate);

   /**
    * Gets the inits the end date.
    *
    * @return the inits the end date
    */
   String getInitEndDate();

   /**
    * Sets the inits the start date.
    *
    * @param initStartDate the new inits the start date
    */
   void setInitStartDate(String initStartDate);

   /**
    * Gets the inits the start date.
    *
    * @return the inits the start date
    */
   String getInitStartDate();

   /**
    * Sets the list durations.
    *
    * @param listDurations the new list durations
    */
   void setListDurations(String listDurations);

   /**
    * Gets the list durations.
    *
    * @return the list durations
    */
   String getListDurations();

   /**
    * Gets the holiday type set.
    *
    * @return the holiday type set
    */
   Set<String> getHolidayTypeSet();

   /**
    * Sets the holiday type set.
    *
    * @param holidayTypeSet the new holiday type set
    */
   void setHolidayTypeSet(Set<String> holidayTypeSet);

   /**
    * Gets the holiday type agg flag.
    *
    * @return the holiday type agg flag
    */
   Boolean getHolidayTypeAggFlag();

   /**
    * Sets the holiday type agg flag.
    *
    * @param holidayTypeAggFlag the new holiday type agg flag
    */
   void setHolidayTypeAggFlag(Boolean holidayTypeAggFlag);

   /**
    * Gets the product range agg flag.
    *
    * @return the product range agg flag
    */
   Boolean getProductRangeAggFlag();

   /**
    * Sets the product range agg flag.
    *
    * @param productRangeAggFlag the new product range agg flag
    */
   void setProductRangeAggFlag(Boolean productRangeAggFlag);

   /**
    * Gets the stay param.
    *
    * @return the stay param
    */
   String getStayParam();

   /**
    * Sets the stay param.
    *
    * @param stayParam the new stay param
    */
   void setStayParam(String stayParam);

   /**
    * Sets the latest departure date.
    *
    * @param date the new latest departure date
    */
   void setLatestDepartureDate(Date date);

   /**
    * Gets the language.
    *
    * @return the language
    */
   String getLanguage();

   /**
    * Sets the language.
    *
    * @param language the new language
    */
   void setLanguage(String language);

   /**
    * Gets the accommodationType set.
    *
    * @return the accommodationType set
    */

   Set<String> getAccommodationTypeSet();

   /**
    * Sets the accommodationType set.
    *
    * @param accommodationTypeSet the new accommodationType set
    */

   void setAccommodationTypeSet(Set<String> accommodationTypeSet);

   /**
    * @return the holidayOperator
    */
   public Set<String> getHolidayOperator();

   /**
    * @param holidayOperator the holidayOperator to set
    */
   public void setHolidayOperator(Set<String> holidayOperator);

   String getPageID();

   void setPageID(String pageID);

   void setSessionId(String sessionId);

   String getCacheName();

   void setCacheName(String cacheName);

   void setPageNumber(String pageNumber);

   void setRequestUri(String requestUri);
   
   String getsType();
   
   void setsType(String sType);
   
   void setSeasonYear(String seasonYear);
   
   public void setType1Duration(String type1Duration);
}
