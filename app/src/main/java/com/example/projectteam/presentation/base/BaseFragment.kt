package com.example.projectteam.presentation.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.viewbinding.ViewBinding
import com.example.projectteam.domain.either.Either
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

abstract class BaseFragment<VB : ViewBinding, VM : ViewModel>(@LayoutRes idLayout: Int) :
    Fragment(idLayout) {

    protected abstract val binding: VB
    protected abstract val viewModel: VM

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupListener()
        setupSubscribes()
    }

    protected open fun initialize() {}

    protected open fun setupListener() {}

    protected open fun setupSubscribes() {}

    protected open fun <T> Flow<Either<String, List<T>>>.subscribe(
        onError: (error: String) -> Unit,
        onSuccess: ((data: List<T>) -> Unit),
    ) {
        lifecycleScope.launch {
            collect {
                when (it) {
                    is Either.Left -> {
                        onError(it.message.toString())
                    }
                    is Either.Right -> {
                        it.data?.let { data ->
                            onSuccess(data)
                        }
                    }
                }
            }
        }
    }
}