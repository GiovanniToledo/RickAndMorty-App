package com.gysstudio.rickandmortyapp.domain.model.episode

import com.google.gson.annotations.SerializedName
import com.gysstudio.rickandmortyapp.domain.model.InfoBaseResponse

data class ResultsEpisodesResponse(
    @SerializedName("info") val info: InfoBaseResponse,
    @SerializedName("results") val resultsEpisodes: List<EpisodeResponse>
)
