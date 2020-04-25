package com.example.mvvmnews.request;

import com.example.mvvmnews.models.Data;
import com.example.mvvmnews.models.Default;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsApi {
    @GET("r/kotlin/.json")
    Call<Default> getNews();
}
