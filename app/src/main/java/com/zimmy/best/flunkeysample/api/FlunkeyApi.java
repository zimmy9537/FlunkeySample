package com.zimmy.best.flunkeysample.api;

import com.zimmy.best.flunkeysample.jsondata.FlunkeyData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FlunkeyApi {

    @GET("restaurants?&pageNo=0&size=10&direction=asc")
    Call<FlunkeyData> getFlunkeyData();
}
