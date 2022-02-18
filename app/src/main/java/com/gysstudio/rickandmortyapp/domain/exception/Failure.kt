package com.gysstudio.basecleanarchexample.domain.exception

sealed class Failure
object CacheError : Failure()
object ServerError : Failure()