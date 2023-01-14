package com.example.projectteam.data.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.rickandmortyapi.base.BaseViewModel

abstract class BaseFragment<VB : ViewBinding, VM : BaseViewModel>(@LayoutRes layoutId: Int) :
    Fragment(layoutId) {

    protected abstract val binding: VB
    protected abstract val viewModel: VM

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupListener()
        setupSubscribe()
        setupRequest()
    }

    protected open fun initialize() {}

    protected open fun setupListener() {}

    protected open fun setupSubscribe() {}

    protected open fun setupRequest() {}
}