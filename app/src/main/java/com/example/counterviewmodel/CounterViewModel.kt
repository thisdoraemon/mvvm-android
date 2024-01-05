package com.example.counterviewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class CounterViewModel: ViewModel() {
    private var _count = mutableStateOf(0)

    val count get()= _count.value

    fun increment() {
        _count.value++
    }

    fun decrement() {
        _count.value--
    }
}