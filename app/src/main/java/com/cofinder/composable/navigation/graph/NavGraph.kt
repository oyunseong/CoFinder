package com.cofinder.composable.navigation.graph

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cofinder.composable.SplashScreen
import com.cofinder.composable.home.HomeScreen
import com.cofinder.composable.login.LoginScreen
import com.cofinder.composable.navigation.model.NavScreen

@Composable
fun NavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    fun popUp() {
        navController.popBackStack()
    }

    fun navigate(route: String) {
        navController.navigate(route) {
            launchSingleTop = true
        }
    }

    fun navigateAndPopUp(
        route: String,
        popUp: String
    ) {
        navController.navigate(route) {
            launchSingleTop = true
            popUpTo(popUp) {
                inclusive = true
            }
        }
    }

    fun clearAndNavigate(route: String) {
        navController.navigate(route) {
            launchSingleTop = true
            popUpTo(0) {
                inclusive = true
            }
        }
    }

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = NavScreen.SPLASH.name
    ) {
        composable(route = NavScreen.SPLASH.name) {
            SplashScreen(
                navigate = {
                    clearAndNavigate(it)
                }
            )
        }

        composable(route = NavScreen.LOGIN.name) {
            LoginScreen()
        }

        composable(route = NavScreen.HOME.name) {
            HomeScreen()
        }

        composable(route = NavScreen.ALARM.name) {
            HomeScreen()
        }

    }


}