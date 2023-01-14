package com.example.projectteam.presentation.model

import com.example.myapplication.presentation.base.IBaseDiffModel
import com.example.projectteam.domain.models.rick_and_morty_model.RickAndMortyModel


data class CharacterModelUI(
    override val id: Int,
    val name: String,
    val image: String

): IBaseDiffModel<Int>

fun RickAndMortyModel.toUI() = CharacterModelUI(
    id = id,
    name = name,
    image = image
)
