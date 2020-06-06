package com.amercosovic.mmafighterapp.model


import com.google.gson.annotations.SerializedName

data class Events(
    @SerializedName("generated_at")
    val generatedAt: String,
    @SerializedName("seasons")
    val seasons: List<Season>
)