package com.greeting

import androidx.compose.runtime.Immutable
import com.core.mvi.BaseViewModel
import com.core.mvi.UiAction
import com.core.mvi.UiEvent
import com.core.mvi.UiState

@Immutable
data class GreetingViewState(
    val name: String = "",
    val loading: Boolean = true
) : UiState

@Immutable
sealed class GreetingEvent: UiEvent {
    object Click: GreetingEvent()
}

@Immutable
sealed class GreetingAction: UiAction {
    object OpenNewScreen: GreetingAction()
}

class GreetingViewModel() : BaseViewModel<GreetingEvent, GreetingViewState, GreetingAction>() {
    override fun createInitialState(): GreetingViewState = GreetingViewState()

    override fun handleEvent(event: GreetingEvent) {
        when (event) {
            GreetingEvent.Click -> setAction { GreetingAction.OpenNewScreen }
        }
    }

}