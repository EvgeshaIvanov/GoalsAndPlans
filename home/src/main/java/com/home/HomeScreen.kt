package com.home

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

class HomeScreen(val id: String) : Screen {
    @Composable
    override fun Content() {
        Box {
            Text("dwdwd from $id")
        }
    }
}