package com.cuteboy.contact.utils

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.cuteboy.contact.screens.CategoryScreen
import com.cuteboy.contact.screens.LoginScreen
import com.cuteboy.contact.screens.SignupScreen

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Login") {
        composable("Login") {
            LoginScreen(navController)
        }
        composable("Category") {
            CategoryScreen(navController)
        }
        composable(
            "Contact/{category}",
            arguments = listOf(navArgument("category") { type = NavType.StringType })
        ) { backStackEntry ->
            val category = backStackEntry.arguments?.getString("category") ?: ""
            App(navController, category = category)
        }
//        composable(
//            "Contact",
//        ) {
//            App(navController, "Friends")
//        }
        composable("Signup") {
            SignupScreen(navController)
        }
    }
}

enum class Pages {
    LISTING,
    DETAIL
}