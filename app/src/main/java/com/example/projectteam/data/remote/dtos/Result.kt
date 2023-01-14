package com.example.projectteam.data.remote.dtos

import com.example.projectteam.domain.models.rick_and_morty_model.RickAndMortyModel
import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("episode")
    val episode: List<String>,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("location")
    val location: Location,
    @SerializedName("name")
    val name: String,
    @SerializedName("origin")
    val origin: Origin,
    @SerializedName("species")
    val species: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)
fun com.example.projectteam.data.remote.dtos.Result.toDomain() = RickAndMortyModel(
    id = id,
    name = name,
    image = image
)