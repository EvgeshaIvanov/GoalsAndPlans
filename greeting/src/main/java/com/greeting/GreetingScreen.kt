package com.greeting

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.kodein.rememberScreenModel
import cafe.adriel.voyager.navigator.LocalNavigator
import com.core.Click
import com.core.theme.GoalsAndPlansTheme
import com.core.theme.LocalTypography
import com.home.HomeScreen
import kotlinx.coroutines.flow.collectLatest

class GreetingScreen() : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current

        val viewModel = rememberScreenModel<GreetingViewModel>()

        GreetingUI(click = { viewModel.setEvent(GreetingEvent.Click) })

        LaunchedEffect(viewModel.action) {
            viewModel.action.collectLatest { action ->
                when (action) {
                    GreetingAction.OpenNewScreen -> navigator?.push(HomeScreen("from greeting"))
                }
            }
        }
    }
}

@Composable
fun GreetingUI(click: Click) {

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = com.core.R.drawable.greeting_image),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
        Text(
            "Welcome to \n" +
                    "Some title",
            color = Color.White,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, top = 64.dp)
                .align(Alignment.TopCenter),
            style = LocalTypography.current.h1
        )
        GreetingCard(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 64.dp),
            onButtonClick = {
                click()
            }
        )
    }
}

@Composable
fun GreetingCard(modifier: Modifier = Modifier, onButtonClick: Click) {

    val gradient = Brush.horizontalGradient(
        colors = listOf(
            Color(0xFF000A09),
            Color(0xFF044742)
        )
    )

    val borderButtonColor = Color(0x80FFFFFF)

    Box(
        modifier = modifier
            .padding(horizontal = 16.dp)
            .background(
                brush = gradient,
                alpha = 0.6f,
                shape = RoundedCornerShape(28.dp)
            )
            .fillMaxWidth()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                "Explore and Mint NFTs",
                style = LocalTypography.current.h3,
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 28.dp),
                textAlign = TextAlign.Center
            )
            Text(
                "You can buy and sell the NFTs of the best artists in the world.",
                style = LocalTypography.current.secondary,
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 6.dp),
                textAlign = TextAlign.Center
            )
            Button(
                onClick = onButtonClick,
                modifier = Modifier
                    .padding(top = 32.dp, bottom = 28.dp),
                border = BorderStroke(width = 2.dp, color = borderButtonColor),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF000A09)
                )
            ) {
                Text(text = "Get started now", style = LocalTypography.current.button)
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun GreetingScreenPreview() {
    GoalsAndPlansTheme {
        GreetingUI {}
    }
}