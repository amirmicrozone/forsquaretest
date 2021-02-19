package com.example.forsquaretest.foursquareNearbyAPI;

//import kotlin.Metadata;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//@Metadata(mo39345bv = {1, 0, 3}, mo39346d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo39347d2 = {"Lcom/example/liveearthmaps/foursquareNearbyAPI/Cln_FoursquareAPICallback;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "TIME_OUT", "", "client", "Lretrofit2/Retrofit;", "getClient", "()Lretrofit2/Retrofit;", "retrofit", "app_debug"}, mo39348k = 1, mo39349mv = {1, 4, 1})
/* compiled from: Cln_FoursquareAPICallback.kt */
public final class Cln_FoursquareAPICallback {
    private static final String BASE_URL = "https://api.foursquare.com/v2/venues/";
    public static final Cln_FoursquareAPICallback INSTANCE = new Cln_FoursquareAPICallback();
    private static final int TIME_OUT = 30;
    private static Retrofit retrofit;

    private Cln_FoursquareAPICallback() {
    }

    public final String getBASE_URL() {
        return BASE_URL;
    }

    public final Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
