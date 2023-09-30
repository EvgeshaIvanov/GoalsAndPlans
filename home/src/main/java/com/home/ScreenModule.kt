package com.home

import cafe.adriel.voyager.core.registry.screenModule
import com.navigation.SharedScreen

val featureHomeScreenModule = screenModule {
    register<SharedScreen.Home> {
        HomeScreen(it.id)
    }
}