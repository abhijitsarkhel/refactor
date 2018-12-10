package com.tui.search.composer.request.params;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.standard.Destination;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tui.search.composer.constants.DiscType;
import com.tui.search.composer.inventory.jaxb.InventoryOffersByCorporateCode;
import com.tui.search.composer.models.HolidayType;
import com.tui.search.composer.request.rules.params.DealsRulesRequestParams;

@JsonInclude(Include.NON_NULL)
public class DealsRequestParams extends SearchComposerRequestParams {

	private String holidayCategory;

	private String pageID;

	private String latestDepartureDateString;

	private String earliestDepartureDateString;

	private String boardBasis;

	private String departureAirportsString;

	private int adultPax = 2;

	private int[] childAges;

	private String durationsString;

	private String sessionId;

	private Date earliestDepartureDate;

	private Date latestDepartureDate;

	private String groupMethod;

	private String cruiseOrder;

	private String cruiseType;

	private String stopOver;

	private String cruiseStayDuration;

	private String cruiseAccomDuration;

	private String dreamLiner;

	private DiscType discType;

	private String promotionsString;

	private String freeKid;

	private String hlo;

	private String tpa;

	private String tpf;

	private String seasonYear;

	private String channel;

	private String linkedProductCode;

	private String cacheEnable;

	private String requestType;

	private String accommodationsString;

	private String tRating;

	private String tripAdvisorRating;

	private int roomCount = 0;

	private String market;

	private int aniteQueryType;

	private String cacheName;

	private String priceType;

	private String seats;

	private String facetParam;

	private Boolean holidayTypeAggFlag = false;

	private Boolean productRangeAggFlag = false;

	private String requestUri;

	private HolidayType holidayType;

	private String candidateDurationsString;

	private String pkg;

	private String traO;

	private String traI;

	private String brws;

	private String cabin;

	private String stayParam;

	private String sortingParameter;

	private String firstRecNum;

	private String recPerPage;

	private String calendarDuration;

	private String depPort;

	private String cruiseDest;

	private String stayLocation;

	private String ukPort;

	private String shipKey;

	private String listDurations;

	private Set<String> shipName;

	private String[] promotions;

	private String[] durations;

	private List<String> indexAccomIds;

	private Set<String> accoms;

	private Set<Destination> destinations = new HashSet<>();

	private Set<String> accomName = new HashSet<>();

	private Set<String> accommodations = new HashSet<>();

	private Set<String> holidayTypeSet = new HashSet<>();

	private Set<String> brand = new HashSet<>();

	private Set<String> productRange = new HashSet<>();

	private Set<String> bestFor = new HashSet<>();

	private Set<String> type = new HashSet<>();

	private Set<String> holidaySubType = new HashSet<>();

	private Set<String> accomFeatures = new HashSet<>();

	private Set<String> arrAirport = new HashSet<>();

	// TODO - Move this as separate entity ?
	private DealsRulesRequestParams rulesParam;

	// TODO - Handle
	private InventoryOffersByCorporateCode inventoryOffersByCorporateCode;

	private Map<String, String> passthroughMap = new HashMap<>();

	public String getHolidayCategory() {
		return holidayCategory;
	}

	public void setHolidayCategory(String holidayCategory) {
		this.holidayCategory = holidayCategory;
	}

	public DealsRulesRequestParams getRulesParam() {
		return rulesParam;
	}

	public void setRulesParam(DealsRulesRequestParams rulesParam) {
		this.rulesParam = rulesParam;
	}

	public String getLatestDepartureDateString() {
		return latestDepartureDateString;
	}

	public void setLatestDepartureDateString(String latestDepartureDateString) {
		this.latestDepartureDateString = latestDepartureDateString;
	}

	public String getEarliestDepartureDateString() {
		return earliestDepartureDateString;
	}

	public void setEarliestDepartureDateString(String earliestDepartureDateString) {
		this.earliestDepartureDateString = earliestDepartureDateString;
	}

	public String getBoardBasis() {
		return boardBasis;
	}

	public void setBoardBasis(String boardBasis) {
		this.boardBasis = boardBasis;
	}

	public String getDepartureAirportsString() {
		return departureAirportsString;
	}

	public void setDepartureAirportsString(String departureAirportsString) {
		this.departureAirportsString = departureAirportsString;
	}

	public int getAdultPax() {
		return adultPax;
	}

	public void setAdultPax(int adultPax) {
		this.adultPax = adultPax;
	}

	public int[] getChildAges() {
		return childAges;
	}

	public void setChildAges(int[] childAges) {
		this.childAges = childAges;
	}

	public String getDurationsString() {
		return durationsString;
	}

	public void setDurationsString(String durationsString) {
		this.durationsString = durationsString;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Date getLatestDepartureDate() {
		return latestDepartureDate;
	}

	public void setLatestDepartureDate(Date latestDepartureDate) {
		this.latestDepartureDate = latestDepartureDate;
	}

	public String getGroupMethod() {
		return groupMethod;
	}

	public void setGroupMethod(String groupMethod) {
		this.groupMethod = groupMethod;
	}

	public Date getEarliestDepartureDate() {
		return earliestDepartureDate;
	}

	public void setEarliestDepartureDate(Date earliestDepartureDate) {
		this.earliestDepartureDate = earliestDepartureDate;
	}

	public String getCruiseOrder() {
		return cruiseOrder;
	}

	public void setCruiseOrder(String cruiseOrder) {
		this.cruiseOrder = cruiseOrder;
	}

	public String getCruiseType() {
		return cruiseType;
	}

	public void setCruiseType(String cruiseType) {
		this.cruiseType = cruiseType;
	}

	public String getStopOver() {
		return stopOver;
	}

	public void setStopOver(String stopOver) {
		this.stopOver = stopOver;
	}

	public String getCruiseStayDuration() {
		return cruiseStayDuration;
	}

	public void setCruiseStayDuration(String cruiseStayDuration) {
		this.cruiseStayDuration = cruiseStayDuration;
	}

	public String getCruiseAccomDuration() {
		return cruiseAccomDuration;
	}

	public void setCruiseAccomDuration(String cruiseAccomDuration) {
		this.cruiseAccomDuration = cruiseAccomDuration;
	}

	public String getDreamLiner() {
		return dreamLiner;
	}

	public void setDreamLiner(String dreamLiner) {
		this.dreamLiner = dreamLiner;
	}

	public String getPromotionsString() {
		return promotionsString;
	}

	public void setPromotionsString(String promotionsString) {
		this.promotionsString = promotionsString;
	}

	public String getFreeKid() {
		return freeKid;
	}

	public void setFreeKid(String freeKid) {
		this.freeKid = freeKid;
	}

	public String getHlo() {
		return hlo;
	}

	public void setHlo(String hlo) {
		this.hlo = hlo;
	}

	public String getTpa() {
		return tpa;
	}

	public void setTpa(String tpa) {
		this.tpa = tpa;
	}

	public String getTpf() {
		return tpf;
	}

	public void setTpf(String tpf) {
		this.tpf = tpf;
	}

	public Map<String, String> getPassthroughMap() {
		return passthroughMap;
	}

	public void setPassthroughMap(Map<String, String> passthroughMap) {
		this.passthroughMap = passthroughMap;
	}

	public String getSeasonYear() {
		return seasonYear;
	}

	public void setSeasonYear(String seasonYear) {
		this.seasonYear = seasonYear;
	}

	public Set<Destination> getDestinations() {
		return destinations;
	}

	public void setDestinations(Set<Destination> destinations) {
		this.destinations = destinations;
	}

	public DiscType getDiscType() {
		return discType;
	}

	public void setDiscType(DiscType discType) {
		this.discType = discType;
	}

	public Set<String> getAccomName() {
		return accomName;
	}

	public void setAccomName(Set<String> accomName) {
		this.accomName = accomName;
	}

	public Set<String> getAccommodations() {
		return accommodations;
	}

	public void setAccommodations(Set<String> accommodations) {
		this.accommodations = accommodations;
	}

	public Set<String> getHolidayTypeSet() {
		return holidayTypeSet;
	}

	public void setHolidayTypeSet(Set<String> holidayTypeSet) {
		this.holidayTypeSet = holidayTypeSet;
	}

	public Set<String> getBrand() {
		return brand;
	}

	public void setBrand(Set<String> brand) {
		this.brand = brand;
	}

	public String gettRating() {
		return tRating;
	}

	public void settRating(String tRating) {
		this.tRating = tRating;
	}

	public String getTripAdvisorRating() {
		return tripAdvisorRating;
	}

	public void setTripAdvisorRating(String tripAdvisorRating) {
		this.tripAdvisorRating = tripAdvisorRating;
	}

	public Set<String> getProductRange() {
		return productRange;
	}

	public void setProductRange(Set<String> productRange) {
		this.productRange = productRange;
	}

	public Set<String> getBestFor() {
		return bestFor;
	}

	public void setBestFor(Set<String> bestFor) {
		this.bestFor = bestFor;
	}

	public Set<String> getType() {
		return type;
	}

	public void setType(Set<String> type) {
		this.type = type;
	}

	public Set<String> getHolidaySubType() {
		return holidaySubType;
	}

	public void setHolidaySubType(Set<String> holidaySubType) {
		this.holidaySubType = holidaySubType;
	}

	public Set<String> getAccomFeatures() {
		return accomFeatures;
	}

	public void setAccomFeatures(Set<String> accomFeatures) {
		this.accomFeatures = accomFeatures;
	}

	public Set<String> getArrAirport() {
		return arrAirport;
	}

	public void setArrAirport(Set<String> arrAirport) {
		this.arrAirport = arrAirport;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getLinkedProductCode() {
		return linkedProductCode;
	}

	public void setLinkedProductCode(String linkedProductCode) {
		this.linkedProductCode = linkedProductCode;
	}

	public String getCacheEnable() {
		return cacheEnable;
	}

	public void setCacheEnable(String cacheEnable) {
		this.cacheEnable = cacheEnable;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getAccommodationsString() {
		return accommodationsString;
	}

	public void setAccommodationsString(String accommodationsString) {
		this.accommodationsString = accommodationsString;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public int getAniteQueryType() {
		return aniteQueryType;
	}

	public void setAniteQueryType(int aniteQueryType) {
		this.aniteQueryType = aniteQueryType;
	}

	public String getCacheName() {
		return cacheName;
	}

	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
	}

	public String getPriceType() {
		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public String getFacetParam() {
		return facetParam;
	}

	public void setFacetParam(String facetParam) {
		this.facetParam = facetParam;
	}

	public Boolean getHolidayTypeAggFlag() {
		return holidayTypeAggFlag;
	}

	public void setHolidayTypeAggFlag(Boolean holidayTypeAggFlag) {
		this.holidayTypeAggFlag = holidayTypeAggFlag;
	}

	public Boolean getProductRangeAggFlag() {
		return productRangeAggFlag;
	}

	public void setProductRangeAggFlag(Boolean productRangeAggFlag) {
		this.productRangeAggFlag = productRangeAggFlag;
	}

	public String getRequestUri() {
		return requestUri;
	}

	public void setRequestUri(String requestUri) {
		this.requestUri = requestUri;
	}

	public String[] getPromotions() {
		return promotions;
	}

	public void setPromotions(String[] promotions) {
		this.promotions = promotions;
	}

	public HolidayType getHolidayType() {
		return holidayType;
	}

	public void setHolidayType(HolidayType holidayType) {
		this.holidayType = holidayType;
	}

	public String getCandidateDurationsString() {
		return candidateDurationsString;
	}

	public void setCandidateDurationsString(String candidateDurationsString) {
		this.candidateDurationsString = candidateDurationsString;
	}

	public String getPkg() {
		return pkg;
	}

	public void setPkg(String pkg) {
		this.pkg = pkg;
	}

	public String getTraO() {
		return traO;
	}

	public void setTraO(String traO) {
		this.traO = traO;
	}

	public String getTraI() {
		return traI;
	}

	public void setTraI(String traI) {
		this.traI = traI;
	}

	public String getBrws() {
		return brws;
	}

	public void setBrws(String brws) {
		this.brws = brws;
	}

	public String getCabin() {
		return cabin;
	}

	public void setCabin(String cabin) {
		this.cabin = cabin;
	}

	public String[] getDurations() {
		return durations;
	}

	public void setDurations(String[] durations) {
		this.durations = durations;
	}

	public List<String> getIndexAccomIds() {
		return indexAccomIds;
	}

	public void setIndexAccomIds(List<String> indexAccomIds) {
		this.indexAccomIds = indexAccomIds;
	}

	public Set<String> getAccoms() {
		return accoms;
	}

	public void setAccoms(Set<String> accoms) {
		this.accoms = accoms;
	}

	public String getStayParam() {
		return stayParam;
	}

	public void setStayParam(String stayParam) {
		this.stayParam = stayParam;
	}

	public String getSortingParameter() {
		return sortingParameter;
	}

	public void setSortingParameter(String sortingParameter) {
		this.sortingParameter = sortingParameter;
	}

	public String getFirstRecNum() {
		return firstRecNum;
	}

	public void setFirstRecNum(String firstRecNum) {
		this.firstRecNum = firstRecNum;
	}

	public String getRecPerPage() {
		return recPerPage;
	}

	public void setRecPerPage(String recPerPage) {
		this.recPerPage = recPerPage;
	}

	public InventoryOffersByCorporateCode getInventoryOffersByCorporateCode() {
		return inventoryOffersByCorporateCode;
	}

	public void setInventoryOffersByCorporateCode(InventoryOffersByCorporateCode inventoryOffersByCorporateCode) {
		this.inventoryOffersByCorporateCode = inventoryOffersByCorporateCode;
	}

	public String getCalendarDuration() {
		return calendarDuration;
	}

	public void setCalendarDuration(String calendarDuration) {
		this.calendarDuration = calendarDuration;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getPageID() {
		return pageID;
	}

	public void setPageID(String pageID) {
		this.pageID = pageID;
	}

	public String getDepPort() {
		return depPort;
	}

	public void setDepPort(String depPort) {
		this.depPort = depPort;
	}

	public String getCruiseDest() {
		return cruiseDest;
	}

	public void setCruiseDest(String cruiseDest) {
		this.cruiseDest = cruiseDest;
	}

	public String getStayLocation() {
		return stayLocation;
	}

	public void setStayLocation(String stayLocation) {
		this.stayLocation = stayLocation;
	}

	public String getUkPort() {
		return ukPort;
	}

	public void setUkPort(String ukPort) {
		this.ukPort = ukPort;
	}

	public Set<String> getShipName() {
		return shipName;
	}

	public void setShipName(Set<String> shipName) {
		this.shipName = shipName;
	}

	public String getShipKey() {
		return shipKey;
	}

	public void setShipKey(String shipKey) {
		this.shipKey = shipKey;
	}

	public String getListDurations() {
		return listDurations;
	}

	public void setListDurations(String listDurations) {
		this.listDurations = listDurations;
	}

}
