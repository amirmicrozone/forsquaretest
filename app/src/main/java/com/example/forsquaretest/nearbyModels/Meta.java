package com.example.forsquaretest.nearbyModels;

import com.google.gson.annotations.SerializedName;

public class Meta {
    @SerializedName("code")
    private Long mCode;
    @SerializedName("requestId")
    private String mRequestId;

    public Long getCode() {
        return this.mCode;
    }

    public void setCode(Long code) {
        this.mCode = code;
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    public void setRequestId(String requestId) {
        this.mRequestId = requestId;
    }
}
