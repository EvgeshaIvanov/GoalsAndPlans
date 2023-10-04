package com.core

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

// TODO (refactor fonts, colors)
val h1 = TextStyle(
    fontSize = 36.sp,
    fontFamily = FontFamily(Font(R.font.sf_pro_regular)),
    fontWeight = FontWeight(900),
    color = Color(0xFFFFFFFF),
)

val h2 = TextStyle(
    fontSize = 26.sp,
    fontFamily = FontFamily(Font(R.font.sf_pro_regular)),
    fontWeight = FontWeight(750),
    color = Color(0xFFFFFFFF),
    letterSpacing = 0.32.sp,
)

val h3 = TextStyle(
    fontSize = 20.sp,
    lineHeight = 25.sp,
    fontFamily = FontFamily(Font(R.font.sf_pro_regular)),
    fontWeight = FontWeight(700),
    color = Color(0xFFFFFFFF),
    letterSpacing = 0.32.sp,
)

val testSecondary = TextStyle(
    fontSize = 14.sp,
    lineHeight = 16.sp,
    fontFamily = FontFamily(Font(R.font.sf_pro_regular)),
    fontWeight = FontWeight(404),
    color = Color(0x99EBEBF5),
)

val buttonTextStyle = TextStyle(
    fontSize = 16.sp,
    lineHeight = 20.sp,
    fontFamily = FontFamily(Font(R.font.sf_pro_regular)),
    fontWeight = FontWeight(600),
    color = Color(0xFFFFFFFF),
    textAlign = TextAlign.Center
)

val FontNew = FontFamily(
    Font(R.font.sf_pro_regular, FontWeight.Medium)
)

private val appFontFamily = FontFamily(
    fonts = listOf(
        Font(
            resId = R.font.sf_pro_regular,
            weight = FontWeight.W900,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.sf_pro_regular,
            weight = FontWeight.W900,
            style = FontStyle.Italic
        ),
        Font(
            resId = R.font.sf_pro_regular,
            weight = FontWeight.W700,
            style = FontStyle.Normal
        ),
    )
)

private val defaultTypography = Typography()
val appTypography = Typography(
    headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = appFontFamily),
    headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = appFontFamily),
    headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = appFontFamily),
//    h4 = defaultTypography.h4.copy(fontFamily = appFontFamily),
//    h5 = defaultTypography.h5.copy(fontFamily = appFontFamily),
//    h6 = defaultTypography.h6.copy(fontFamily = appFontFamily),
    displayMedium = defaultTypography.displayMedium.copy(fontFamily = appFontFamily),
)
