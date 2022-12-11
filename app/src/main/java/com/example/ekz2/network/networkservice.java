package com.example.ekz2.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class networkservice {
    private  String BASE_URL ="http://mskko2021.mad.hakta.pro/api/";
    public Retrofit  retrofit;

    public networkservice(){
        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();
    }
}
