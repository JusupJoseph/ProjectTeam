package com.example.projectteam.data.repositories

import com.example.projectteam.data.base.BaseRepository
import com.example.projectteam.data.remote.api.CharacterApiService
import javax.inject.Inject

class CharacterRepositoriesImpl @Inject constructor(
    private val charactersApi: CharacterApiService
) : BaseRepository() {

}