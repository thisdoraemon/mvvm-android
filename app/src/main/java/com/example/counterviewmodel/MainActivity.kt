package com.example.counterviewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.counterviewmodel.ui.theme.CounterViewModelTheme

class MainActivity : ComponentActivity() {
    private val counterViewModel: CounterViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterViewModelTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CounterApp(counterViewModel = counterViewModel)
                }
            }
        }
    }
}

@Composable
fun CounterApp(counterViewModel: CounterViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Count: ${counterViewModel.count}")

        CounterButtons(counterViewModel = counterViewModel)
    }
}

@Composable
fun CounterButtons(counterViewModel: CounterViewModel) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        // Button to increment the count
        IconButton(onClick = { counterViewModel.increment() }) {
            Icon(imageVector = Icons.Default.Add, contentDescription = null)
        }

        // Button to decrement the count
        IconButton(onClick = { counterViewModel.decrement() }) {
            Icon(imageVector = Icons.Default.Remove, contentDescription = null)
        }
    }
}

