package com.cofinder.composable.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cofinder.R
import com.cofinder.composable.common.CommonButton
import com.cofinder.composable.ext.VerticalSpacer
import com.cofinder.ui.theme.minSansBold
import com.cofinder.ui.theme.minSansNormal

@Composable
fun LoginScreen() {
    LoginScreenContent()
}

@Composable
fun LoginScreenContent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(30.dp)
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.ic_logo),
                contentDescription = "logo"
            )
            VerticalSpacer(dp = 30.dp)
            Text(
                text = "CO-FINDER\n회원으로 로그인",
                style = minSansBold,
            )
        }

        CommonButton(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 83.dp),
            text = "아직 회원이 아니신가요?",
            icon = R.drawable.ic_chat_bubble
        )
        Text(
            modifier = Modifier.align(Alignment.BottomStart),
            text = "powered by cofinder",
            style = minSansNormal,
            color = Color(0xFFCDCAE2)
        )
    }
}

@Preview
@Composable
private fun PreviewLoginScreen() {
    LoginScreenContent()
}