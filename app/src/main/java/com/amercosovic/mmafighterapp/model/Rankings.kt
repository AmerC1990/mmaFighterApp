package com.amercosovic.mmafighterapp.model

import com.google.gson.annotations.SerializedName

data class Rankings(
    @SerializedName("generated_at")
    val generatedAt: String,
    @SerializedName("rankings")
    val rankings: List<Ranking>
)