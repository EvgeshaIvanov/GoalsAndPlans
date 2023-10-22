package com.goalsandplans

import android.app.Application
import cafe.adriel.voyager.core.registry.ScreenRegistry
import com.greeting.featurePostsScreenModule
import com.greeting.homeModule
import org.kodein.di.DI
import org.kodein.di.DIAware

class MainApp : Application(), DIAware {

    override val di by DI.lazy {
        import(homeModule)
    }

    override fun onCreate() {
        super.onCreate()

        ScreenRegistry {
            featurePostsScreenModule
        }
    }
}