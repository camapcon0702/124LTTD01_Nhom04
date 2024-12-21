package com.example.nhom4_124tldt01.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserAPI {

    @GET("/api/user/profile")
    Call<UserResponse> getUserProfile();
}
