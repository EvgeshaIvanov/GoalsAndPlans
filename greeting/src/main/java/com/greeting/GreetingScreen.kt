package com.greeting

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

class GreetingScreen : Screen {
    @Composable
    override fun Content() {
        Box() {
            Text("dwadawdwad from greeting")
        }
    }

}