package com.droiddude.apps.daggerhilt.di

import com.droiddude.apps.daggerhilt.data.repository.SampleRepositoryImpl
import com.droiddude.apps.daggerhilt.domain.SampleRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {


}