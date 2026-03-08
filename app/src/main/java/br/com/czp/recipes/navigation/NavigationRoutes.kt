package br.com.czp.recipes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import br.com.czp.recipes.screens.HomeScreen
import br.com.czp.recipes.screens.InitialScreen
import br.com.czp.recipes.screens.SignupScreen
import br.com.fiap.recipes.screens.LoginScreen

@Composable
fun NavigationRoutes() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Destination.InitialScreen.route
    ){
        composable(Destination.InitialScreen.route){
            InitialScreen(navController)
        }
        composable(Destination.HomeScreen.route){
            HomeScreen(navController)
        }
        composable(Destination.SignupScreen.route){
            SignupScreen(navController)
        }
        composable(Destination.LoginScreen.route){
            LoginScreen(navController)
        }
    }
}