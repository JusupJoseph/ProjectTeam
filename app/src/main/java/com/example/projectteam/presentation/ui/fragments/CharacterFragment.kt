package com.example.projectteam.presentation.ui.fragments

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.projectteam.R
import com.example.projectteam.data.base.BaseFragment
import com.example.projectteam.databinding.FragmentCharacterBinding
import com.example.projectteam.presentation.ui.adapter.CharacterAdapter
import com.example.projectteam.presentation.ui.fragments.CharacterViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class CharacterFragment :
    BaseFragment<FragmentCharacterBinding, CharacterViewModel>(R.layout.fragment_character) {

    override val binding by viewBinding(FragmentCharacterBinding::bind)
    override val viewModel: CharacterViewModel by viewModels()
    private val adapter = CharacterAdapter(arrayListOf())
    private var count = 1

}