package com.navigation

import cafe.adriel.voyager.core.registry.ScreenProvider

sealed class SharedScreen : ScreenProvider {
    object Greeting : SharedScreen()
    class Home(val id: String) : SharedScreen()
    object Stats : SharedScreen()
}