package com.zimmy.best.flunkeysample.viewmodel;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.zimmy.best.flunkeysample.Konstants;
import com.zimmy.best.flunkeysample.api.FlunkeyApi;
import com.zimmy.best.flunkeysample.jsondata.Datum;
import com.zimmy.best.flunkeysample.jsondata.FlunkeyData;
import com.zimmy.best.flunkeysample.view.HomeActivity;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestaurantViewModel extends ViewModel {

    private MutableLiveData<ArrayList<Datum>> mutableLiveData;

    public LiveData<ArrayList<Datum>> getRestaurantDetails(Context context) {
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
            loadData(context);
        }
        return mutableLiveData;
    }

    public void loadData(Context context) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Konstants.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        FlunkeyApi flunkeyApi = retrofit.create(FlunkeyApi.class);
        Call<FlunkeyData> call = flunkeyApi.getFlunkeyData();
        call.enqueue(new Callback<FlunkeyData>() {
            @Override
            public void onResponse(Call<FlunkeyData> call, Response<FlunkeyData> response) {
                FlunkeyData flunkeyData = response.body();
                if (flunkeyData == null) {
                    Log.d(HomeActivity.class.getSimpleName(), "the data is empty");
                    return;
                }
                Toast.makeText(context, "Successfully data retrieved", Toast.LENGTH_SHORT).show();
                //proceed with data
                assert response.body() != null;
                ArrayList<Datum> restaurantList = (ArrayList<Datum>) response.body().getData().getData();
                mutableLiveData.setValue(restaurantList);
            }

            @Override
            public void onFailure(Call<FlunkeyData> call, Throwable t) {
                if (t instanceof IOException) {
                    Toast.makeText(context, "network failure occurred", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context, "conversion issue! issue with json data", Toast.LENGTH_SHORT).show();
                    Log.d(HomeActivity.class.getSimpleName(), "conversion issue faced here");
                }
            }
        });
    }
}
