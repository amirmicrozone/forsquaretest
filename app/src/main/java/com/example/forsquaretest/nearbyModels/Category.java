package com.example.forsquaretest.nearbyModels;

import com.google.gson.annotations.SerializedName;

public class Category {
    @SerializedName("icon")
    private Icon mIcon;
    @SerializedName("id")
    private String mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("pluralName")
    private String mPluralName;
    @SerializedName("primary")
    private Boolean mPrimary;
    @SerializedName("shortName")
    private String mShortName;

    public Icon getIcon() {
        return this.mIcon;
    }

    public void setIcon(Icon icon) {
        this.mIcon = icon;
    }

    public String getId() {
        return this.mId;
    }

    public void setId(String id) {
        this.mId = id;
    }

    public String getName() {
        return this.mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getPluralName() {
        return this.mPluralName;
    }

    public void setPluralName(String pluralName) {
        this.mPluralName = pluralName;
    }

    public Boolean getPrimary() {
        return this.mPrimary;
    }

    public void setPrimary(Boolean primary) {
        this.mPrimary = primary;
    }

    public String getShortName() {
        return this.mShortName;
    }

    public void setShortName(String shortName) {
        this.mShortName = shortName;
    }
}
