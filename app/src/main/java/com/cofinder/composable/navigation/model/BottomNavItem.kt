package com.cofinder.composable.navigation.model


sealed class BottomNavItem(
    val title: String,
    val icon: Int,
    val screen: NavScreen
) {
    object Home : BottomNavItem(
        title = "홈",
        icon = androidx.core.R.drawable.ic_call_answer,
        screen = NavScreen.HOME
    )

    object Alarm : BottomNavItem(
        title = "알람",
        icon = androidx.core.R.drawable.ic_call_answer,
        screen = NavScreen.ALARM
    )
}