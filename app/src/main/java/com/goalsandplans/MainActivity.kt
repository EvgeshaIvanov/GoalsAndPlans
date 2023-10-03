package com.goalsandplans

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.currentOrThrow
import cafe.adriel.voyager.transitions.FadeTransition
import cafe.adriel.voyager.transitions.ScaleTransition
import cafe.adriel.voyager.transitions.SlideTransition
import com.goalsandplans.ui.theme.GoalsAndPlansTheme
import com.greeting.GreetingScreen
import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // TODO (animation)
            GoalsAndPlansTheme {
                Navigator(GreetingScreen()) { navigator ->
                    FadeTransition(navigator, animationSpec = tween())
                }
            }
        }
    }
}


@Composable
@Preview
private fun PreviewSome() {
    GoalsAndPlansTheme {
        Box() {
            Text(text = "dwdwdw")
        }
    }
}