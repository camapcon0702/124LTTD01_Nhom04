package com.example.nhom4_124tldt01.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserAPI {

    @GET("/api/user/profile")
    Call<UserResponse> getUserProfile();

    @GET("/api/users")
    Call<List<UserResponse>> getAllUser();
}
