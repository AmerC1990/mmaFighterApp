package com.amercosovic.mmafighterapp.retrofit

import com.amercosovic.mmafighterapp.model.Ranking
import com.amercosovic.mmafighterapp.model.Rankings
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("/ufc/trial/v2/en/rankings.json")
    suspend fun getRankings(@Query("api_key") api_key: String): Rankings
}