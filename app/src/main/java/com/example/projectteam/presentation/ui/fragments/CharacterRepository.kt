package com.example.projectteam.presentation.ui.fragments

import com.example.projectteam.data.base.BaseRepository
import com.example.projectteam.data.remote.api.CharacterApiService
import javax.inject.Inject

class CharacterRepository @Inject constructor(val service: CharacterApiService) :
    BaseRepository() {

}