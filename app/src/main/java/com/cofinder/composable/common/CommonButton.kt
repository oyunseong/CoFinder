package com.cofinder.composable.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cofinder.R
import com.cofinder.composable.ext.noRippleClickable
import com.cofinder.ui.theme.MainColor
import com.cofinder.ui.theme.minSansMedium

@Composable
fun CommonButton(
    modifier: Modifier = Modifier,
    text: String = "",
    icon: Int? = null,
    isEnabled: Boolean = true,
    onClick: () -> Unit = {},
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(54.dp)
            .clip(shape = RoundedCornerShape(4.dp))
            .background(color = if (isEnabled) MainColor else Color.Gray)
            .noRippleClickable {
                if (isEnabled) {
                    onClick.invoke()
                }
            }

    ) {
        if (icon != null) {
            Row(
                modifier = Modifier
                    .align(Alignment.Center)
            ) {
                Image(
                    modifier = Modifier.align(Alignment.CenterVertically),
                    painter = painterResource(id = icon),
                    contentDescription = "chatBubble"
                )
                Text(
                    modifier = Modifier.padding(start = 6.dp),
                    text = text,
                    color = Color.White,
                    style = minSansMedium
                )
            }
        } else {
            Text(
                modifier = Modifier
                    .align(Alignment.Center),
                text = text,
                color = Color.White,
                style = minSansMedium
            )
        }
    }
}

@Preview
@Composable
private fun PreviewCommonButton() {
    CommonButton(
        text = "아직 회원이 아니신가요?",
        icon = R.drawable.ic_chat_bubble
    )
}