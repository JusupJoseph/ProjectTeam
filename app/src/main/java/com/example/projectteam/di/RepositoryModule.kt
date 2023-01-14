package com.example.projectteam.di

import com.example.projectteam.data.repositories.CharacterRepositoriesImpl
import com.example.projectteam.domain.repositories.RickAndMortyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindCharactersRepository(rickAndMortyRepository: CharacterRepositoriesImpl): RickAndMortyRepository
}