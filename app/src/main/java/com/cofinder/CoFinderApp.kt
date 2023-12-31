package com.cofinder

import android.annotation.SuppressLint
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.cofinder.composable.components.BottomNavigationBar
import com.cofinder.composable.components.bottomBarHeight
import com.cofinder.composable.navigation.graph.NavGraph

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CoFinderApp(
    onFinished: () -> Unit = {}
) {
    val navController = rememberNavController()
    var bottomPadding = 0.dp
    val context = LocalContext.current
    var start: Long = 0
    var end: Long = 0
//    val snackbarState = remember { mutableStateOf<SnackbarMessage?>(null) }

    BackHandler {
        if (end > System.currentTimeMillis()) {
            onFinished.invoke()
        } else {
            start = System.currentTimeMillis()
            end = start.plus(2000)
            // show dialog
//            context.showToast("한번 더 누르면 종료")
        }
    }

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController) {
                bottomPadding = if (it) bottomBarHeight else 0.dp
            }
        }
    ) { _ ->
        NavGraph(
            modifier = Modifier.padding(bottom = bottomPadding),
            navController = navController,
        )
    }

//    val snackbar = SnackbarManager.snackbar.collectAsState()
//
//    snackbar.value.let { snackbars ->
//        snackbars.forEach {
//            Snackbar(message = it, pop = {
//                SnackbarManager.clearIfAllisInvisible()
//            })
//        }
//    }
}