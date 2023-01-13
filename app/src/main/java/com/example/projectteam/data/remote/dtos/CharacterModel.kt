package com.example.projectteam.data.remote.dtos

import com.google.gson.annotations.SerializedName

data class CharacterModel(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val results: List<Result>
)