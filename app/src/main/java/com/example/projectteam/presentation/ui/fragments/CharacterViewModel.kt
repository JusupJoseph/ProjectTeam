package com.example.projectteam.presentation.ui.fragments

import com.example.rickandmortyapi.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(private val repository: CharacterRepository) :
    BaseViewModel() {

}