package com.aliasadi.data.util

import kotlinx.coroutines.CoroutineDispatcher

/**
 * Created 
 **/
interface DispatchersProvider {
    fun getIO(): CoroutineDispatcher
    fun getMain(): CoroutineDispatcher
    fun getMainImmediate(): CoroutineDispatcher
    fun getDefault(): CoroutineDispatcher
}