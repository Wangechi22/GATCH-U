package net.simplifiedcoding.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.simplifiedcoding.ui.auth.AuthViewModel
import net.simplifiedcoding.ui.auth.LoginScreen
import net.simplifiedcoding.ui.auth.SignupScreen
import net.simplifiedcoding.ui.home.HomeScreen
import net.simplifiedcoding.ui.landing.LandingScreen
import net.simplifiedcoding.ui.providers.Providerscreen
import net.simplifiedcoding.ui.viewproviders.ViewingScreen

@Composable
fun AppNavHost(
    viewModel: AuthViewModel,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_LANDING
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN) {
            LoginScreen(viewModel, navController)
        }
        composable(ROUTE_SIGNUP) {
            SignupScreen(viewModel, navController)
        }
        composable(ROUTE_HOME) {
            HomeScreen(viewModel, navController)
        }

        composable(ROUTE_LANDING) {
            LandingScreen(viewModel, navController)
        }
        composable(ROUTE_PROVIDER) {
            Providerscreen(viewModel, navController)
        }
        composable(ROUTE_VIEWER) {
            ViewingScreen(viewModel, navController)
        }

    }
}