
package com.zimmy.best.flunkeysample.jsondata;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("restaurantId")
    @Expose
    private String restaurantId;
//    @SerializedName("whatsappNumber")
//    @Expose
//    private List<WhatsappNumber> whatsappNumber = null;
    @SerializedName("rating")
    @Expose
    private Double rating;
//    @SerializedName("allowReservations")
//    @Expose
//    private Boolean allowReservations;
//    @SerializedName("neighbourhood")
//    @Expose
//    private String neighbourhood;
//    @SerializedName("pincode")
//    @Expose
//    private Integer pincode;
//    @SerializedName("state")
//    @Expose
//    private String state;
//    @SerializedName("allowTakeaway")
//    @Expose
//    private Boolean allowTakeaway;
//    @SerializedName("lastupdate")
//    @Expose
//    private Lastupdate lastupdate;
//    @SerializedName("description")
//    @Expose
//    private String description;
//    @SerializedName("updatedby")
//    @Expose
//    private String updatedby;
//    @SerializedName("isLive")
//    @Expose
//    private Boolean isLive;
//    @SerializedName("pics")
//    @Expose
//    private List<String> pics = null;
//    @SerializedName("createdby")
//    @Expose
//    private String createdby;
    @SerializedName("location")
    @Expose
    private Location location;
//    @SerializedName("id")
//    @Expose
//    private String id;
//    @SerializedName("shortMessage")
//    @Expose
//    private String shortMessage;
//    @SerializedName("allowDelivery")
//    @Expose
//    private Boolean allowDelivery;
//    @SerializedName("isOnline")
//    @Expose
//    private Boolean isOnline;
//    @SerializedName("type")
//    @Expose
//    private List<String> type = null;
    @SerializedName("restaurantName")
    @Expose
    private String restaurantName;
    @SerializedName("city")
    @Expose
    private String city;
//    @SerializedName("address")
//    @Expose
//    private String address;
//    @SerializedName("Claim Code")
//    @Expose
//    private String claimCode;
//    @SerializedName("createdate")
//    @Expose
//    private Createdate createdate;
//    @SerializedName("avgTime")
//    @Expose
//    private Integer avgTime;
//    @SerializedName("ownerMobile")
//    @Expose
//    private String ownerMobile;
//    @SerializedName("claimedEmails")
//    @Expose
//    private List<ClaimedEmail> claimedEmails = null;
//    @SerializedName("owner")
//    @Expose
//    private String owner;
//    @SerializedName("gstPercent")
//    @Expose
//    private Double gstPercent;
//    @SerializedName("ownerEmail")
//    @Expose
//    private String ownerEmail;
//    @SerializedName("online")
//    @Expose
//    private Boolean online;
//    @SerializedName("claimed")
//    @Expose
//    private Boolean claimed;
//    @SerializedName("serviceChargePercent")
//    @Expose
//    private Integer serviceChargePercent;
//    @SerializedName("isOpen")
//    @Expose
//    private Boolean isOpen;
//    @SerializedName("geohash")
//    @Expose
//    private String geohash;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

//    public List<WhatsappNumber> getWhatsappNumber() {
//        return whatsappNumber;
//    }
//
//    public void setWhatsappNumber(List<WhatsappNumber> whatsappNumber) {
//        this.whatsappNumber = whatsappNumber;
//    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

//    public Boolean getAllowReservations() {
//        return allowReservations;
//    }

//    public void setAllowReservations(Boolean allowReservations) {
//        this.allowReservations = allowReservations;
//    }

//    public String getNeighbourhood() {
//        return neighbourhood;
//    }
//
//    public void setNeighbourhood(String neighbourhood) {
//        this.neighbourhood = neighbourhood;
//    }
//
//    public Integer getPincode() {
//        return pincode;
//    }
//
//    public void setPincode(Integer pincode) {
//        this.pincode = pincode;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public Boolean getAllowTakeaway() {
//        return allowTakeaway;
//    }
//
//    public void setAllowTakeaway(Boolean allowTakeaway) {
//        this.allowTakeaway = allowTakeaway;
//    }
//
//    public Lastupdate getLastupdate() {
//        return lastupdate;
//    }
//
//    public void setLastupdate(Lastupdate lastupdate) {
//        this.lastupdate = lastupdate;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getUpdatedby() {
//        return updatedby;
//    }
//
//    public void setUpdatedby(String updatedby) {
//        this.updatedby = updatedby;
//    }
//
//    public Boolean getIsLive() {
//        return isLive;
//    }
//
//    public void setIsLive(Boolean isLive) {
//        this.isLive = isLive;
//    }

//    public List<String> getPics() {
//        return pics;
//    }
//
//    public void setPics(List<String> pics) {
//        this.pics = pics;
//    }
//
//    public String getCreatedby() {
//        return createdby;
//    }
//
//    public void setCreatedby(String createdby) {
//        this.createdby = createdby;
//    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getShortMessage() {
//        return shortMessage;
//    }
//
//    public void setShortMessage(String shortMessage) {
//        this.shortMessage = shortMessage;
//    }
//
//    public Boolean getAllowDelivery() {
//        return allowDelivery;
//    }
//
//    public void setAllowDelivery(Boolean allowDelivery) {
//        this.allowDelivery = allowDelivery;
//    }
//
//    public Boolean getIsOnline() {
//        return isOnline;
//    }
//
//    public void setIsOnline(Boolean isOnline) {
//        this.isOnline = isOnline;
//    }
//
//    public List<String> getType() {
//        return type;
//    }
//
//    public void setType(List<String> type) {
//        this.type = type;
//    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getClaimCode() {
//        return claimCode;
//    }
//
//    public void setClaimCode(String claimCode) {
//        this.claimCode = claimCode;
//    }
//
//    public Createdate getCreatedate() {
//        return createdate;
//    }
//
//    public void setCreatedate(Createdate createdate) {
//        this.createdate = createdate;
//    }
//
//    public Integer getAvgTime() {
//        return avgTime;
//    }
//
//    public void setAvgTime(Integer avgTime) {
//        this.avgTime = avgTime;
//    }
//
//    public String getOwnerMobile() {
//        return ownerMobile;
//    }
//
//    public void setOwnerMobile(String ownerMobile) {
//        this.ownerMobile = ownerMobile;
//    }
//
//    public List<ClaimedEmail> getClaimedEmails() {
//        return claimedEmails;
//    }
//
//    public void setClaimedEmails(List<ClaimedEmail> claimedEmails) {
//        this.claimedEmails = claimedEmails;
//    }
//
//    public String getOwner() {
//        return owner;
//    }
//
//    public void setOwner(String owner) {
//        this.owner = owner;
//    }
//
//    public Double getGstPercent() {
//        return gstPercent;
//    }
//
//    public void setGstPercent(Double gstPercent) {
//        this.gstPercent = gstPercent;
//    }
//
//    public String getOwnerEmail() {
//        return ownerEmail;
//    }
//
//    public void setOwnerEmail(String ownerEmail) {
//        this.ownerEmail = ownerEmail;
//    }
//
//    public Boolean getOnline() {
//        return online;
//    }
//
//    public void setOnline(Boolean online) {
//        this.online = online;
//    }
//
//    public Boolean getClaimed() {
//        return claimed;
//    }
//
//    public void setClaimed(Boolean claimed) {
//        this.claimed = claimed;
//    }
//
//    public Integer getServiceChargePercent() {
//        return serviceChargePercent;
//    }
//
//    public void setServiceChargePercent(Integer serviceChargePercent) {
//        this.serviceChargePercent = serviceChargePercent;
//    }
//
//    public Boolean getIsOpen() {
//        return isOpen;
//    }
//
//    public void setIsOpen(Boolean isOpen) {
//        this.isOpen = isOpen;
//    }
//
//    public String getGeohash() {
//        return geohash;
//    }
//
//    public void setGeohash(String geohash) {
//        this.geohash = geohash;
//    }

}
