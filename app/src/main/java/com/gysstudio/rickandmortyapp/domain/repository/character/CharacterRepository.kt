package com.gysstudio.rickandmortyapp.domain.repository.character

import com.gysstudio.rickandmortyapp.core.DataResult
import com.gysstudio.rickandmortyapp.domain.GetCharacterRequest
import com.gysstudio.rickandmortyapp.domain.model.characater.CharacterResponse
import com.gysstudio.rickandmortyapp.domain.model.characater.ResultsCharactersResponse

interface CharacterRepository {
    suspend fun getAllCharacters(): DataResult<ResultsCharactersResponse>
    suspend fun getSingleCharacter(getSingleCharacterRequest: GetCharacterRequest): DataResult<CharacterResponse>
    suspend fun getMultiCharacter(getSingleCharacterRequest: GetCharacterRequest): DataResult<List<CharacterResponse>>
}