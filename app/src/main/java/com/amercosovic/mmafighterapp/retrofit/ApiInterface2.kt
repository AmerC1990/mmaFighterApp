package com.amercosovic.mmafighterapp.retrofit

import com.amercosovic.mmafighterapp.model.*
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface2 {
    @GET("ufc/trial/v2/en/seasons.json")
    suspend fun getEvents(@Query("api_key") api_key: String): Events


    companion object {

        fun create(): ApiInterface2 {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.sportradar.us/")
                .addCallAdapterFactory(CoroutineCallAdapterFactory.invoke())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(ApiInterface2::class.java)
        }

    }

}
