package com.example.forsquaretest.nearbyModels;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Location {
    @SerializedName("address")
    private String mAddress;
    @SerializedName("cc")
    private String mCc;
    @SerializedName("city")
    private String mCity;
    @SerializedName("country")
    private String mCountry;
    @SerializedName("crossStreet")
    private String mCrossStreet;
    @SerializedName("distance")
    private Long mDistance;
    @SerializedName("formattedAddress")
    private List<String> mFormattedAddress;
    @SerializedName("labeledLatLngs")
    private List<LabeledLatLng> mLabeledLatLngs;
    @SerializedName("lat")
    private Double mLat;
    @SerializedName("lng")
    private Double mLng;
    @SerializedName("postalCode")
    private String mPostalCode;
    @SerializedName("state")
    private String mState;

    public String getAddress() {
        return this.mAddress;
    }

    public void setAddress(String address) {
        this.mAddress = address;
    }

    public String getCc() {
        return this.mCc;
    }

    public void setCc(String cc) {
        this.mCc = cc;
    }

    public String getCity() {
        return this.mCity;
    }

    public void setCity(String city) {
        this.mCity = city;
    }

    public String getCountry() {
        return this.mCountry;
    }

    public void setCountry(String country) {
        this.mCountry = country;
    }

    public String getCrossStreet() {
        return this.mCrossStreet;
    }

    public void setCrossStreet(String crossStreet) {
        this.mCrossStreet = crossStreet;
    }

    public Long getDistance() {
        return this.mDistance;
    }

    public void setDistance(Long distance) {
        this.mDistance = distance;
    }

    public List<String> getFormattedAddress() {
        return this.mFormattedAddress;
    }

    public void setFormattedAddress(List<String> formattedAddress) {
        this.mFormattedAddress = formattedAddress;
    }

    public List<LabeledLatLng> getLabeledLatLngs() {
        return this.mLabeledLatLngs;
    }

    public void setLabeledLatLngs(List<LabeledLatLng> labeledLatLngs) {
        this.mLabeledLatLngs = labeledLatLngs;
    }

    public Double getLat() {
        return this.mLat;
    }

    public void setLat(Double lat) {
        this.mLat = lat;
    }

    public Double getLng() {
        return this.mLng;
    }

    public void setLng(Double lng) {
        this.mLng = lng;
    }

    public String getPostalCode() {
        return this.mPostalCode;
    }

    public void setPostalCode(String postalCode) {
        this.mPostalCode = postalCode;
    }

    public String getState() {
        return this.mState;
    }

    public void setState(String state) {
        this.mState = state;
    }
}
