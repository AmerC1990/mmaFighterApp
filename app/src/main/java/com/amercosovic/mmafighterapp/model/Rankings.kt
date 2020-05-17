package com.amercosovic.mmafighterapp.model

import com.google.gson.annotations.SerializedName

data class Rankings(
    @SerializedName("rankings")
    val rankings: List<Ranking>
)