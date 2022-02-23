package com.gysstudio.rickandmortyapp.domain.model.location

import com.google.gson.annotations.SerializedName

data class LocationDescriptionResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("type") val type: String,
    @SerializedName("dimension") val dimension: String,
    @SerializedName("residents") val listResidents: List<String>?,
    @SerializedName("url") val url: String,
    @SerializedName("created") val created: String
)
