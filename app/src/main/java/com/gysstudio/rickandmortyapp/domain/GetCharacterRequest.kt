package com.gysstudio.rickandmortyapp.domain

class GetCharacterRequest(var id: Int? = 1, var multi: List<Int>? = listOf()) {
    fun getParamsSingleQueryMap() = id

    fun getParamsMultiQueryMap(): IntArray? = multi?.toIntArray()
}