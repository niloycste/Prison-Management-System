package com.example.currencyconverter;


import java.util.Currency;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface Service {

    @GET("/adamcooke")
    Call<Currency> getCurrency();

}
