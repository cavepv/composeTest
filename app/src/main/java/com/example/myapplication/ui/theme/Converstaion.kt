package com.example.myapplication.ui.theme

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable

@Composable
fun Conversation(messages: List<CustomMessage>) {
    LazyColumn {
        items(messages) { message ->
            CustomMessage(message)
        }
    }
}
