package com.example.ekz2.network;

import com.example.ekz2.models.LoginModel;
import com.example.ekz2.models.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface JSONapi {
    @POST("user/login")
    Call<LoginResponse> login(@Body LoginModel loginModel);
}
