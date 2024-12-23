package com.example.nhom4_124tldt01.retrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    static String baseUrl = "http://192.168.100.146:8080";
    private static Retrofit retrofit;


    public static Retrofit getRetrofitInstance(String token) {
//        OkHttpClient client = new OkHttpClient.Builder()
//                .addInterceptor(new AuthInterceptor(token))
//                .build();

        return new Retrofit.Builder()
                .baseUrl(baseUrl)
//                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
