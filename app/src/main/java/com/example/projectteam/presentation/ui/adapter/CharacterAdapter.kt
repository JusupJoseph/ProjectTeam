package com.example.projectteam.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.presentation.base.BaseDiffUtilItemCallback
import com.example.projectteam.databinding.ItemCharacterBinding
import com.example.projectteam.presentation.model.CharacterModelUI

class CharacterAdapter :
    androidx.recyclerview.widget.ListAdapter<CharacterModelUI, CharacterAdapter.CharacterViewHolder>(
        BaseDiffUtilItemCallback()
    ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder =
        CharacterViewHolder(
            ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        getItem(position).let { holder.onBind(it) }
    }

    class CharacterViewHolder(private val binding: ItemCharacterBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(characterModelUI: CharacterModelUI) {
            with(binding) {
                tvNameCharacter.text = characterModelUI.name
                Glide
                    .with(ivCharacter)
                    .load(characterModelUI.image)
                    .into(ivCharacter)

            }
        }
    }
}