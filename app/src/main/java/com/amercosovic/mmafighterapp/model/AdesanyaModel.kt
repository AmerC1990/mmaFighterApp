package com.amercosovic.mmafighterapp.model


import com.google.gson.annotations.SerializedName

data class AdesanyaModel(
    @SerializedName("competitor")
    val competitor: CompetitorX,
    @SerializedName("generated_at")
    val generatedAt: String,
    @SerializedName("info")
    val info: Info,
    @SerializedName("record")
    val record: Record
)

data class AdesanyaModel2(
    @SerializedName("competitor")
    val competitor: CompetitorX,
    @SerializedName("generated_at")
    val generatedAt: String,
    @SerializedName("info")
    val info: Info2,
    @SerializedName("record")
    val record: Record
)