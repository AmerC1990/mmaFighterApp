package com.amercosovic.mmafighterapp.retrofit

import com.amercosovic.mmafighterapp.model.AdesanyaModel
import com.amercosovic.mmafighterapp.model.AdesanyaModel2
import com.amercosovic.mmafighterapp.model.Rankings
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface3 {
    @GET("ufc/trial/v2/en/competitors/sr:competitor:410485/profile.json")
    suspend fun getIzzyInfo(@Query("api_key") api_key: String): AdesanyaModel

    @GET("ufc/trial/v2/en/competitors/sr:competitor:253377/profile.json")
    suspend fun getWhittakerInfo(@Query("api_key") api_key: String): AdesanyaModel2


    companion object {

        fun create(): ApiInterface3 {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.sportradar.us/")
                .addCallAdapterFactory(CoroutineCallAdapterFactory.invoke())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(ApiInterface3::class.java)
        }

    }

}
