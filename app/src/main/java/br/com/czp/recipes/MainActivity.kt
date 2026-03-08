package br.com.czp.recipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import br.com.czp.recipes.navigation.NavigationRoutes

import br.com.czp.recipes.ui.theme.RecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            RecipesTheme {
                NavigationRoutes()
            }
        }
    }
}

