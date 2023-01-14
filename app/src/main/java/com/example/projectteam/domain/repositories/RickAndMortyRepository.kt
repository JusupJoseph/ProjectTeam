package com.example.projectteam.domain.repositories

import com.example.projectteam.domain.either.Either
import com.example.projectteam.domain.models.rick_and_morty_model.RickAndMortyModel
import kotlinx.coroutines.flow.Flow

interface RickAndMortyRepository {

    fun getRickAndMortyList(): Flow<Either<String, List<RickAndMortyModel>>>
}