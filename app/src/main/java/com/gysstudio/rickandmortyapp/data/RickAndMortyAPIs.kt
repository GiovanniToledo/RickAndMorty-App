package com.gysstudio.rickandmortyapp.data

import com.google.gson.JsonObject
import com.gysstudio.rickandmortyapp.core.DataResult
import retrofit2.http.GET
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface RickAndMortyAPIs {
    @GET("episode")
    suspend fun getAllEpisodes(): JsonObject

    @GET("location")
    suspend fun getAllLocations(): JsonObject

    @GET("character")
    suspend fun getAllCharacters(): JsonObject

    @GET("character/{id}")
    suspend fun getSingleCharacter(@Path("id") id: Int?): JsonObject

    @GET("character/[{id_array}]")
    suspend fun getMultiCharacters(@Path("id_array") idArray: IntArray?): JsonObject

}