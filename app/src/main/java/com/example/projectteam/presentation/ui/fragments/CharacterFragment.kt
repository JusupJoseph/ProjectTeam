package com.example.projectteam.presentation.ui.fragments

import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.projectteam.R
import com.example.projectteam.databinding.FragmentCharacterBinding
import com.example.projectteam.presentation.base.BaseFragment
import com.example.projectteam.presentation.model.toUI
import com.example.projectteam.presentation.ui.adapter.CharacterAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlin.math.log


@AndroidEntryPoint
class CharacterFragment:
    BaseFragment<FragmentCharacterBinding, CharacterViewModel>(R.layout.fragment_character) {

    override val binding by viewBinding(FragmentCharacterBinding::bind)
    override val viewModel: CharacterViewModel by viewModels()
    private val characterAdapter = CharacterAdapter()

    override fun initialize() {
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.rvCharacter.adapter = characterAdapter
    }

    override fun setupSubscribes() {
        viewModel.getRickAndMortyList().subscribe(
            onError = { error ->
                Log.e("RickAndMorty", "${error}", )
            },
            onSuccess ={data ->
                val mappingList = data.map { model ->
                    model.toUI()
                }
                characterAdapter.submitList(mappingList)
            }
        )
    }

}