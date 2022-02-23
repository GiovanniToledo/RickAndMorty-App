package com.gysstudio.rickandmortyapp.core

import com.gysstudio.rickandmortyapp.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.apply {
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        }
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor).build()

        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(BuildConfig.kBaseApiUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}