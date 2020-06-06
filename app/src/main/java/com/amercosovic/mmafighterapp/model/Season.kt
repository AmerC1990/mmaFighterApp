package com.amercosovic.mmafighterapp.model


import com.google.gson.annotations.SerializedName

data class Season(
    @SerializedName("competition_id")
    val competitionId: String,
    @SerializedName("end_date")
    val endDate: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("start_date")
    val startDate: String,
    @SerializedName("year")
    val year: String
)