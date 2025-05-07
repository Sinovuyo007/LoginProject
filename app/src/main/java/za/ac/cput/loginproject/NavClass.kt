package za.ac.cput.loginproject

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
//Navigation Imports
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavigationHost(){
    //1. Create a NavController
    val navController = rememberNavController()

    //2. Create a NavHost container
    NavHost(
        navController = navController,
        startDestination = "login"
    ){
        // 3. Define each screen ("destination") associated with a route string
        composable(route = "login"){
            LoginScreen(navController)
        }
        composable(route = "register"){
            RegisterScreen(navController)
        }
        composable(route = "display"){
            DisplayScreen(navController)
        }
    }
}
