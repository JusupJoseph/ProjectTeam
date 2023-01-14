package com.example.projectteam.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.projectteam.data.remote.dtos.CharacterModel
import com.example.projectteam.databinding.ItemCharacterBinding

class CharacterAdapter(val list: ArrayList<CharacterModel>) :
    RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder =
        CharacterViewHolder(
            ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    class CharacterViewHolder(private val binding: ItemCharacterBinding) :
        ViewHolder(binding.root) {
        fun onBind(model: CharacterModel) {
            binding.ivCharacter.load(model.image)
            binding.tvNameCharacter.text = model.name
            binding.tvStatus.text = model.status
            binding.tvSpecies.text = model.species
            binding.tvType.text = model.type
            binding.tvFirstSeen.text = model.gender
        }
    }

    fun addNewItems(characterModel: List<CharacterModel>) {
        list.addAll(characterModel)
        notifyDataSetChanged()
    }
}