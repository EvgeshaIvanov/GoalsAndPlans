package com.greeting

import cafe.adriel.voyager.core.registry.screenModule
import com.navigation.SharedScreen

val featurePostsScreenModule = screenModule {
    register<SharedScreen.Greeting> {
        GreetingScreen()
    }
}