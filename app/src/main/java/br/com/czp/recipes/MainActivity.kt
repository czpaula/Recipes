package br.com.czp.recipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.czp.recipes.screens.HomeScreen
import br.com.czp.recipes.screens.InitialScreen
import br.com.czp.recipes.screens.SignupScreen
import br.com.czp.recipes.ui.theme.RecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            RecipesTheme {
                //InitialScreen()
                //SignupScreen()
                //LoginScreen()
                HomeScreen()
            }
        }
    }
}

