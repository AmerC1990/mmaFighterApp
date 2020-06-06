package com.amercosovic.mmafighterapp.model


import com.google.gson.annotations.SerializedName

data class Record(
    @SerializedName("draws")
    val draws: Int,
    @SerializedName("losses")
    val losses: Int,
    @SerializedName("wins")
    val wins: Int
)