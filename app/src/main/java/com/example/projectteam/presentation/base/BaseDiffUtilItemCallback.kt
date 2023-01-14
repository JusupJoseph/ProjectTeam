package com.example.myapplication.presentation.base

import androidx.recyclerview.widget.DiffUtil

class BaseDiffUtilItemCallback<T : IBaseDiffModel<S>, S> : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean = oldItem == newItem
}