package com.example.projectteam.data.remote.api

import com.example.projectteam.data.remote.dtos.CharacterModel
import retrofit2.http.GET

interface CharacterApiService {
    @GET("character")
    suspend fun fetchCharacters() : CharacterModel
}