package com.example.projectteam.data.repositories

import com.example.projectteam.data.base.BaseRepository
import com.example.projectteam.data.remote.api.CharacterApiService
import com.example.projectteam.data.remote.dtos.toDomain
import com.example.projectteam.domain.repositories.RickAndMortyRepository
import javax.inject.Inject

class CharacterRepositoriesImpl @Inject constructor(
    private val charactersApi: CharacterApiService
) : BaseRepository(), RickAndMortyRepository {
    override fun getRickAndMortyList() = doRequest {
        charactersApi.fetchCharacters().results.map {
            it.toDomain()
        }
    }
}