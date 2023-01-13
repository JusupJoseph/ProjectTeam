package com.example.projectteam.data.base

import com.example.projectteam.common.either.Either
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

abstract class BaseRepository {

    protected fun <T> doRequest(request: suspend () -> List<T>) = flow<Either<String, List<T>>> {
        emit(Either.Right(data = request()))
    }.flowOn(Dispatchers.IO).catch { exception ->
        emit(Either.Left(message = exception.localizedMessage ?: "Error Occurred!"))
    }
}