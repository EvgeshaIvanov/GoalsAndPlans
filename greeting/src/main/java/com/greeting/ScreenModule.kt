package com.greeting

import cafe.adriel.voyager.core.registry.screenModule
import com.navigation.SharedScreen
import org.kodein.di.DI
import org.kodein.di.bindProvider

val featurePostsScreenModule = screenModule {
    register<SharedScreen.Greeting> {
        GreetingScreen()
    }
}

val homeModule = DI.Module(name = "home") {
    bindProvider { GreetingViewModel() }
    bindProvider { GreetingScreen() }
}