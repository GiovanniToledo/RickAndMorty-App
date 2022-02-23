package com.gysstudio.rickandmortyapp.domain.model

import com.google.gson.annotations.SerializedName

data class InfoBaseResponse(
    @SerializedName("count") val count: Int,
    @SerializedName("pages") val pages: Int,
    @SerializedName("prev") val prev: String?,
    @SerializedName("next") val next: String?,
)

