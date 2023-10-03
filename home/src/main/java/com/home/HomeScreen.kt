package com.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.core.screen.Screen
import com.core.h2

class HomeScreen(val id: String) : Screen {
    @Composable
    override fun Content() {
        Box {
            Text("dwdwd from $id")
        }
    }
}

@Composable
private fun HomeUIToolbar() {
    Row(modifier = Modifier) {
        Text(text = "NFT Marketplace", style = h2)
    }
}

@Composable
@Preview(showBackground = true)
private fun HomeScreenPreview() {
    HomeUIToolbar()
}