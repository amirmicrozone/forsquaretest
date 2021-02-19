package com.example.forsquaretest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.forsquaretest.foursquareNearbyAPI.Cln_FoursquareAPICallback;
import com.example.forsquaretest.foursquareNearbyAPI.Cln_FoursquareAPIInterface;
import com.example.forsquaretest.nearbyModels.NearbyPlace;
import com.example.forsquaretest.nearbyModels.Venue;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       /* Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.foursquare.com/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                // .client(okHttpClient)
                .build();

        FoursquareService foursquare = retrofit.create(FoursquareService.class);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.foursquare.com/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                // .client(okHttpClient)
                .build();

        FoursquareService foursquare = retrofit.create(FoursquareService.class);
*/

        // Gets the stored Foursquare API client ID and client secret from XML

        String  foursquareClientID = getResources().getString(R.string.CLIENT_ID);
        String foursquareClientSecret = getResources().getString(R.string.CLIENT_SECRET);

        String BASE_URL = "https://api.foursquare.com/v2/venues/";
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();



        Cln_FoursquareAPIInterface apiCallback=retrofit.create(Cln_FoursquareAPIInterface.class);

        Call<NearbyPlace> abc=apiCallback.getNearbyPlaces(
                foursquareClientID,
                foursquareClientSecret,
                "bus station",
                "3000",
                "33.7186744,73.0738714",
                "20201230");

        abc.enqueue(new Callback<NearbyPlace>() {
            @Override
            public void onResponse(Call<NearbyPlace> call, Response<NearbyPlace> response) {
                Log.e("TAG", "onResponse:1 " + response.body().toString() + "  ***size  ");
                NearbyPlace a =response.body();

                Log.e("TAG", "onResponse:1 " + response.body().toString() + "  ***size  "+a.getResponse().getVenues().size());


                for(Venue place:a.getResponse().getVenues() ){
                    Log.e("TAG", "onResponse: :"+place.getName()+" loc :"+place.getLocation() );
                }



            }

            @Override
            public void onFailure(Call<NearbyPlace> call, Throwable t) {
                Log.e("TAG", "onResponse:1 Error**********  ***size  ");
            }
        });



    }

 /*   public final void getPlaces(String place) {
        Intrinsics.checkNotNullParameter(place, GeocodingCriteria.TYPE_PLACE);
        Retrofit client = Cln_FoursquareAPICallback.INSTANCE.getClient();
        Intrinsics.checkNotNull(client);
        String string = getResources().getString(R.string.CLIENT_ID);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.CLIENT_ID)");
        String string2 = getResources().getString(R.string.CLIENT_SECRET);
        Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.CLIENT_SECRET)");
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(',');
        sb.append("");
        ((Cln_FoursquareAPIInterface) client.create(Cln_FoursquareAPIInterface.class)).getNearbyPlaces(string, string2, place, "3000", sb.toString(), "20201230").enqueue(new Cln_NearbyPlaces$getPlaces$1(this, place));
    }*/
}