package com.navigation

import cafe.adriel.voyager.core.registry.ScreenProvider

sealed class SharedScreen : ScreenProvider {
    object Greeting : SharedScreen()
    object Home : SharedScreen()
    object Stats : SharedScreen()
}