package com.gysstudio.rickandmortyapp.domain.model.location

import com.google.gson.annotations.SerializedName
import com.gysstudio.rickandmortyapp.domain.model.InfoBaseResponse
import com.gysstudio.rickandmortyapp.domain.model.characater.LocationResponse
import com.gysstudio.rickandmortyapp.domain.model.episode.EpisodeResponse

data class ResultsLocationsResponse(
    @SerializedName("info") val info: InfoBaseResponse,
    @SerializedName("results") val resultsEpisodes: List<LocationDescriptionResponse>
)
