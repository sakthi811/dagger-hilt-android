package com.droiddude.apps.daggerhilt.data.repository

import android.app.Application
import com.droiddude.apps.daggerhilt.R
import com.droiddude.apps.daggerhilt.data.remote.SampleApi
import com.droiddude.apps.daggerhilt.domain.SampleRepository
import javax.inject.Inject

class SampleRepositoryImpl @Inject constructor(
    private val sampleApi : SampleApi,
    private val appContext : Application
) : SampleRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository, App Name is $appName")
    }

    override suspend fun doNetworkCall() {

    }

}