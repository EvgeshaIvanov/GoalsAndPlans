package com.core.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.core.R

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
