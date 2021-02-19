package com.example.forsquaretest.nearbyModels;

import com.google.gson.annotations.SerializedName;

public class NearbyPlace {
    @SerializedName("meta")
    private Meta mMeta;
    @SerializedName("response")
    private Response mResponse;

    public Meta getMeta() {
        return this.mMeta;
    }

    public void setMeta(Meta meta) {
        this.mMeta = meta;
    }

    public Response getResponse() {
        return this.mResponse;
    }

    public void setResponse(Response response) {
        this.mResponse = response;
    }
}
