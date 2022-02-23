package com.gysstudio.rickandmortyapp.core

import com.gysstudio.basecleanarchexample.domain.exception.Success
import java.util.*

class DataResult<T>(dataSuccess: T? = null, error: Exception? = null) {

    val dataSuccess: T? = null
    val error: Exception? = null

}