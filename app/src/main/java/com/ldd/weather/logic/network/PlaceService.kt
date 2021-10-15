package com.ldd.weather.logic.network

import com.ldd.weather.LddWeatherApplication
import com.ldd.weather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("v2/place?token=${LddWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}