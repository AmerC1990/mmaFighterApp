package com.amercosovic.mmafighterapp.model

import com.google.gson.annotations.SerializedName

data class CompetitorRanking(
    @SerializedName("competitor")
    val competitor: Competitor,
    @SerializedName("movement")
    val movement: Int,
    @SerializedName("rank")
    val rank: Int
)