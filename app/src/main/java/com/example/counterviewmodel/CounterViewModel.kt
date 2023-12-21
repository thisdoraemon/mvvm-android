package com.example.counterviewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class CounterViewModel: ViewModel() {
    private var _count by remember {
        mutableStateOf(0)
    }

    val count get() = _count

    fun increment() {
        _count++
    }

    fun decrement() {
        _count--
    }
}