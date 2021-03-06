package com.amercosovic.mmafighterapp.retrofit

import com.amercosovic.mmafighterapp.model.Competitor
import com.amercosovic.mmafighterapp.model.CompetitorRanking
import com.amercosovic.mmafighterapp.model.Ranking
import com.amercosovic.mmafighterapp.model.Rankings
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("ufc/trial/v2/en/rankings.json")
    suspend fun getRankings(@Query("api_key") api_key: String): Rankings


    companion object {

        fun create(): ApiInterface {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.sportradar.us/")
                .addCallAdapterFactory(CoroutineCallAdapterFactory.invoke())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(ApiInterface::class.java)
        }

    }

}
