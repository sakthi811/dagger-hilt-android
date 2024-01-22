package com.droiddude.apps.daggerhilt.data.remote

import retrofit2.http.GET

interface SampleApi {

    @GET("test")
    suspend fun doNetworkCall()
}