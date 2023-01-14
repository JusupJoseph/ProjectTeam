package com.example.projectteam.di

import com.example.projectteam.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    private val retrofit = RetrofitClient()

    @Singleton
    @Provides
    fun provideCharactersApiService() = retrofit.provideCharactersService()
}