package com.amercosovic.mmafighterapp.model

import com.google.gson.annotations.SerializedName

data class Competitor(
    @SerializedName("abbreviation")
    val abbreviation: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)