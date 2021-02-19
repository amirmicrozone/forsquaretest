package com.example.forsquaretest.nearbyModels;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Venue {
    @SerializedName("categories")
    private List<Category> mCategories;
    @SerializedName("hasPerk")
    private Boolean mHasPerk;
    @SerializedName("id")
    private String mId;
    @SerializedName("location")
    private Location mLocation;
    @SerializedName("name")
    private String mName;
    @SerializedName("referralId")
    private String mReferralId;

    public List<Category> getCategories() {
        return this.mCategories;
    }

    public void setCategories(List<Category> categories) {
        this.mCategories = categories;
    }

    public Boolean getHasPerk() {
        return this.mHasPerk;
    }

    public void setHasPerk(Boolean hasPerk) {
        this.mHasPerk = hasPerk;
    }

    public String getId() {
        return this.mId;
    }

    public void setId(String id) {
        this.mId = id;
    }

    public Location getLocation() {
        return this.mLocation;
    }

    public void setLocation(Location location) {
        this.mLocation = location;
    }

    public String getName() {
        return this.mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getReferralId() {
        return this.mReferralId;
    }

    public void setReferralId(String referralId) {
        this.mReferralId = referralId;
    }
}
