package com.goalsandplans

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import cafe.adriel.voyager.navigator.Navigator
import com.goalsandplans.ui.theme.GoalsAndPlansTheme
import com.greeting.GreetingScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoalsAndPlansTheme {
                Navigator(GreetingScreen())
            }
        }
    }
}