package com.example.forsquaretest.nearbyModels;

import com.google.gson.annotations.SerializedName;

public class Icon {
    @SerializedName("prefix")
    private String mPrefix;
    @SerializedName("suffix")
    private String mSuffix;

    public String getPrefix() {
        return this.mPrefix;
    }

    public void setPrefix(String prefix) {
        this.mPrefix = prefix;
    }

    public String getSuffix() {
        return this.mSuffix;
    }

    public void setSuffix(String suffix) {
        this.mSuffix = suffix;
    }
}
