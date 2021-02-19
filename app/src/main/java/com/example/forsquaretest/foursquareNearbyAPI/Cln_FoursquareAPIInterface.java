package com.example.forsquaretest.foursquareNearbyAPI;


import com.example.forsquaretest.nearbyModels.NearbyPlace;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

//@Metadata(mo39345bv = {1, 0, 3}, mo39346d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JJ\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'¨\u0006\f"}, mo39347d2 = {"Lcom/example/liveearthmaps/foursquareNearbyAPI/Cln_FoursquareAPIInterface;", "", "getNearbyPlaces", "Lretrofit2/Call;", "Lcom/example/liveearthmaps/nearbyModels/NearbyPlace;", "client_id", "", "client_secret", "query", "radius", "ll", "v", "app_debug"}, mo39348k = 1, mo39349mv = {1, 4, 1})
/* compiled from: Cln_FoursquareAPIInterface.kt */
public interface Cln_FoursquareAPIInterface {
    @GET("search")
    Call<NearbyPlace> getNearbyPlaces(@Query("client_id") String str,
                                      @Query("client_secret") String str2,
                                      @Query("query") String str3,
                                      @Query("radius") String str4,
                                      @Query("ll") String str5,
                                      @Query("v") String str6);
}
