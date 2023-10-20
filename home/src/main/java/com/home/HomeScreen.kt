package com.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.PagerDefaults
import androidx.compose.foundation.pager.PagerSnapDistance
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import com.core.Click
import com.core.R
import com.core.theme.GoalsAndPlansTheme
import com.core.theme.LocalTypography
import com.core.theme.h2
import kotlin.math.absoluteValue


class HomeScreen(val id: String) : Screen {
    @Composable
    override fun Content() {
        Column {
            HomeUIToolbar()
            HomeUIContent()
        }
    }
}


@Composable
private fun HomeUIToolbar() {

    val backColor = Color(0xFF000A09)

    val navigator = LocalNavigator.current

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = backColor)
            .height(100.dp)
            .padding(horizontal = 16.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        IconButton(
            onClick = { navigator?.pop() },
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                contentDescription = null,
                tint = Color.White
            )
        }
        Text(
            text = "Text Toolbar",
            style = LocalTypography.current.h2,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
private fun HomeUIContent() {

    val backColor = Color(0xFF0B1A18)

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.greeting_image),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize(),
            colorFilter = ColorFilter.tint(backColor, blendMode = BlendMode.Overlay)
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun HomeScreenPreview() {
    GoalsAndPlansTheme {
        Column {
            HomeUIToolbar()
            HomeUIContent()
        }
    }
}