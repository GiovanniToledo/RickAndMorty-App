package com.gysstudio.rickandmortyapp.domain.model.episode

import com.google.gson.annotations.SerializedName

data class EpisodeResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("air_date") val airDate: String,
    @SerializedName("episode") val episode: String,
    @SerializedName("characters") val listCharacters: List<String>?,
    @SerializedName("url") val url: String,
    @SerializedName("created") val created: String
)
