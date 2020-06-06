package com.amercosovic.mmafighterapp.model


import com.google.gson.annotations.SerializedName

data class Info(
    @SerializedName("birth_city")
    val birthCity: String,
    @SerializedName("birth_country")
    val birthCountry: String,
    @SerializedName("birth_country_code")
    val birthCountryCode: String,
    @SerializedName("birth_date")
    val birthDate: String,
    @SerializedName("birth_state")
    val birthState: String,
    @SerializedName("fighting_out_of_city")
    val fightingOutOfCity: String,
    @SerializedName("fighting_out_of_country")
    val fightingOutOfCountry: String,
    @SerializedName("fighting_out_of_country_code")
    val fightingOutOfCountryCode: String,
    @SerializedName("fighting_out_of_state")
    val fightingOutOfState: String,
    @SerializedName("height")
    val height: Int,
    @SerializedName("nickname")
    val nickname: String,
    @SerializedName("reach")
    val reach: Int,
    @SerializedName("weight")
    val weight: Int
)

data class Info2(
    @SerializedName("birth_city")
    val birthCity: String,
    @SerializedName("birth_country")
    val birthCountry: String,
    @SerializedName("birth_country_code")
    val birthCountryCode: String,
    @SerializedName("birth_date")
    val birthDate: String,
    @SerializedName("birth_state")
    val birthState: String,
    @SerializedName("fighting_out_of_city")
    val fightingOutOfCity: String,
    @SerializedName("fighting_out_of_country")
    val fightingOutOfCountry: String,
    @SerializedName("fighting_out_of_country_code")
    val fightingOutOfCountryCode: String,
    @SerializedName("fighting_out_of_state")
    val fightingOutOfState: String,
    @SerializedName("height")
    val height: Int,
    @SerializedName("nickname")
    val nickname: String,
    @SerializedName("reach")
    val reach: Int,
    @SerializedName("weight")
    val weight: Double
)