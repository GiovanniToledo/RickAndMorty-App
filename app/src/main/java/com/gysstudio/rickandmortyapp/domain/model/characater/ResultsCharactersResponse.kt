package com.gysstudio.rickandmortyapp.domain.model.characater

import com.google.gson.annotations.SerializedName
import com.gysstudio.rickandmortyapp.domain.model.InfoBaseResponse

data class ResultsCharactersResponse(
    @SerializedName("info") val info: InfoBaseResponse,
    @SerializedName("results") val listResults: List<CharacterResponse>
)