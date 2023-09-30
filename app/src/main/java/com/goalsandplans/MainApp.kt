package com.goalsandplans

import android.app.Application
import cafe.adriel.voyager.core.registry.ScreenRegistry
import com.greeting.featurePostsScreenModule
import com.home.featureHomeScreenModule

class MainApp : Application() {

    override fun onCreate() {
        super.onCreate()

        ScreenRegistry {
            featurePostsScreenModule
            featureHomeScreenModule
        }
    }
}