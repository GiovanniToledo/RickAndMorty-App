package com.gysstudio.basecleanarchexample.domain.exception

sealed class Success
object SaveSuccess : Success()
object DeleteSuccess : Success()