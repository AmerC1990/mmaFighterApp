package com.amercosovic.mmafighterapp.model

import com.google.gson.annotations.SerializedName

data class CompetitorRanking(
    @SerializedName("competitor")
    val competitor: Competitor,
    @SerializedName("rank")
    val rank: Int
)