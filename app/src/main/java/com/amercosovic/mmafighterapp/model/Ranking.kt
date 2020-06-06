package com.amercosovic.mmafighterapp.model

import com.google.gson.annotations.SerializedName

data class Ranking(
    @SerializedName("competitor_rankings")
    val competitorRankings: List<CompetitorRanking>,
    @SerializedName("name")
    val name: String,
    @SerializedName("type_id")
    val typeId: Int,
    @SerializedName("week")
    val week: Int,
    @SerializedName("year")
    val year: Int
)
