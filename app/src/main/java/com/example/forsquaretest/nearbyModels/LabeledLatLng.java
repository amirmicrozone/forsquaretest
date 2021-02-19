package com.example.forsquaretest.nearbyModels;

import com.google.gson.annotations.SerializedName;

public class LabeledLatLng {
    @SerializedName("label")
    private String mLabel;
    @SerializedName("lat")
    private Double mLat;
    @SerializedName("lng")
    private Double mLng;

    public String getLabel() {
        return this.mLabel;
    }

    public void setLabel(String label) {
        this.mLabel = label;
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
}
