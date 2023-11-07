package com.cofinder.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cofinder.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

@Composable
fun dpToSp(dp: Dp) = with(LocalDensity.current) { dp.toSp() }

@Composable
fun pxToDp(pixels: Float) = with(LocalDensity.current) { pixels.toDp() }

val minsansFontFamily = FontFamily(
    Font(R.font.minsans_light, FontWeight.Normal),
    Font(R.font.minsans_regular, FontWeight.Medium),
    Font(R.font.minsans_bold, FontWeight.Bold),
    Font(R.font.minsans_etralight, FontWeight.ExtraBold),
)

val minSansBold: TextStyle
    @Composable
    get() = TextStyle(
        fontFamily = minsansFontFamily,
        fontSize = dpToSp(dp = 20.dp),
        lineHeight = dpToSp(dp = 30.dp),
        letterSpacing = dpToSp(dp = (-0.2).dp),
        fontWeight = FontWeight.Bold,
        color = MainDeepColor
    )

val minSansMedium: TextStyle
    @Composable
    get() = TextStyle(
        fontFamily = minsansFontFamily,
        fontSize = dpToSp(dp = 15.dp),
        lineHeight = dpToSp(dp = 20.dp),
        fontWeight = FontWeight.Medium,
    )

val minSansNormal: TextStyle
    @Composable
    get() = TextStyle(
        fontFamily = minsansFontFamily,
        fontSize = dpToSp(dp = 12.dp),
        lineHeight = dpToSp(dp = 16.dp),
        fontWeight = FontWeight.Normal,
    )