package com.gysstudio.rickandmortyapp.data.source.remote

import com.google.gson.Gson
import com.gysstudio.rickandmortyapp.core.DataResult
import com.gysstudio.rickandmortyapp.data.RickAndMortyAPIs
import com.gysstudio.rickandmortyapp.domain.GetCharacterRequest
import com.gysstudio.rickandmortyapp.domain.model.characater.CharacterResponse
import com.gysstudio.rickandmortyapp.domain.model.characater.ResultsCharactersResponse
import com.gysstudio.rickandmortyapp.domain.repository.character.CharacterRepository
import java.lang.Exception

class CharacterRepositoryImpl(
    private val services: RickAndMortyAPIs
) : CharacterRepository {
    override suspend fun getAllCharacters(): DataResult<ResultsCharactersResponse> {
        try {
            return DataResult(
                dataSuccess = Gson().fromJson(
                    services.getAllCharacters().toString(),
                    ResultsCharactersResponse::class.java
                )
            )
        } catch (e: Exception) {
            return DataResult(error = e)
        }
    }

    override suspend fun getSingleCharacter(getSingleCharacterRequest: GetCharacterRequest): DataResult<CharacterResponse> {
        try {
            return DataResult(
                dataSuccess = Gson().fromJson(
                    services.getSingleCharacter(id = getSingleCharacterRequest.getParamsSingleQueryMap()),
                    CharacterResponse::class.java
                )
            )
        } catch (e: Exception) {
            return DataResult(error = e)
        }
    }

    override suspend fun getMultiCharacter(getSingleCharacterRequest: GetCharacterRequest): DataResult<List<CharacterResponse>> {
        try {
            return DataResult(
                dataSuccess = Gson().fromJson(
                    services.getMultiCharacters(idArray = getSingleCharacterRequest.getParamsMultiQueryMap()),
                    listOf<CharacterResponse>()::class.java
                )
            )
        } catch (e: Exception) {
            return DataResult(error = e)
        }
    }
}