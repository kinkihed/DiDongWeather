package com.xlarry.didongweather.logic.network


import com.xlarry.didongweather.DiDongWeatherApplication
import com.xlarry.didongweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    //访问彩云天气城市搜索API 的 Retrofit接口

    @GET("v2/place?token=${DiDongWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query")query:String): Call<PlaceResponse>
}