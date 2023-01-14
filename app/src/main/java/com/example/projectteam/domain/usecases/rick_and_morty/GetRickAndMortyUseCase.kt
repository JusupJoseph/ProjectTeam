package com.example.projectteam.domain.usecases.rick_and_morty

import com.example.projectteam.domain.repositories.RickAndMortyRepository
import javax.inject.Inject

class GetRickAndMortyUseCase @Inject constructor(
    private val rickAndMortyRepository: RickAndMortyRepository
) {
    operator fun invoke() = rickAndMortyRepository.getRickAndMortyList()
}