package com.greeting

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.home.HomeScreen

class GreetingScreen : Screen {

    @Composable
    override fun Content() {

        val navigator = LocalNavigator.currentOrThrow

        Box() {
            Text("dwadawdwad from greeting", modifier = Modifier.clickable(onClick = {
                navigator.push(HomeScreen("dawdawdawd"))
            }))
        }
    }

}