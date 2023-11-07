package com.cofinder.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.cofinder.R
import com.cofinder.composable.navigation.model.BottomNavItem
import com.cofinder.composable.navigation.model.NavScreen
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(
    navigate: (String) -> Unit = {}
) {
    LaunchedEffect(key1 = Unit, block = {
        delay(2000L)
        navigate.invoke(NavScreen.LOGIN.toString())
    })

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        Image(
            modifier = Modifier.align(Alignment.Center),
            painter = painterResource(id = R.drawable.img_splash),
            contentScale = ContentScale.FillWidth,
            contentDescription = "SplashImage"
        )
    }


}

@Preview
@Composable
private fun PreviewSplashScreen() {
    SplashScreen()
}