package com.example.retrofitdemo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Instance_Class
{
    public static API_Interface callAPI() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://ashmitashop.000webhostapp.com/AshmitaShop/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(API_Interface.class);
    }
}
