package com.example.projectteam.presentation.ui.fragments

import androidx.lifecycle.ViewModel
import com.example.projectteam.domain.usecases.rick_and_morty.GetRickAndMortyUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(
    private val getCharacters: GetRickAndMortyUseCase) :
    ViewModel() {
        fun getRickAndMortyList() = getCharacters.invoke()

}