package com.droiddude.apps.daggerhilt.di

import android.app.Application
import com.droiddude.apps.daggerhilt.data.remote.SampleApi
import com.droiddude.apps.daggerhilt.data.repository.SampleRepositoryImpl
import com.droiddude.apps.daggerhilt.domain.SampleRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSampleApi() : SampleApi {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(SampleApi::class.java)
    }

    @Provides
    @Singleton
    fun provideSampleRepository(
        api : SampleApi,
        app : Application
    ) : SampleRepository
    {
        return SampleRepositoryImpl(api, app)
    }

    @Provides
    @Singleton
    fun provideString1() = "Hello1"

    @Provides
    @Singleton
    fun provideString2() = "Hello2"
}