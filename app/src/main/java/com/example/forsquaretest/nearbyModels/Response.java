package com.example.forsquaretest.nearbyModels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response {
    @SerializedName("venues")

    private List<Venue> mVenues;

    public List<Venue> getVenues() {
        return this.mVenues;
    }

    public void setVenues(List<Venue> venues) {
        this.mVenues = venues;
    }
}
