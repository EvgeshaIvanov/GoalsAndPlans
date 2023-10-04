package com.core.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle

@Immutable
data class GoalsAndPlansTypography(
    val h1: TextStyle,
    val h2: TextStyle,
    val h3: TextStyle,
    val secondary: TextStyle,
    val button: TextStyle,
)

val LocalTypography = staticCompositionLocalOf<GoalsAndPlansTypography> {
    error("No font provided")
}
