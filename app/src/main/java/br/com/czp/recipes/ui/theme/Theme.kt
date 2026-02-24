package br.com.czp.recipes.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import br.com.fiap.recipes.ui.theme.DarkBackground
import br.com.fiap.recipes.ui.theme.DarkOnBackground
import br.com.fiap.recipes.ui.theme.DarkOnPrimary
import br.com.fiap.recipes.ui.theme.DarkOnSecondary
import br.com.fiap.recipes.ui.theme.DarkOnSurface
import br.com.fiap.recipes.ui.theme.DarkOnTertiary
import br.com.fiap.recipes.ui.theme.DarkPrimary
import br.com.fiap.recipes.ui.theme.DarkSecondary
import br.com.fiap.recipes.ui.theme.DarkSurface
import br.com.fiap.recipes.ui.theme.DarkTertiary
import br.com.fiap.recipes.ui.theme.LightBackground
import br.com.fiap.recipes.ui.theme.LightOnBackground
import br.com.fiap.recipes.ui.theme.LightOnPrimary
import br.com.fiap.recipes.ui.theme.LightOnSecondary
import br.com.fiap.recipes.ui.theme.LightOnSurface
import br.com.fiap.recipes.ui.theme.LightOnTertiary
import br.com.fiap.recipes.ui.theme.LightPrimary
import br.com.fiap.recipes.ui.theme.LightSecondary
import br.com.fiap.recipes.ui.theme.LightSurface
import br.com.fiap.recipes.ui.theme.LightTertiary
import br.com.fiap.recipes.ui.theme.Typography

private val DarkColorScheme = darkColorScheme(
    primary = DarkPrimary,
    secondary = DarkSecondary,
    tertiary = DarkTertiary,
    background = DarkBackground,
    surface = DarkSurface,
    onPrimary = DarkOnPrimary,
    onSecondary = DarkOnSecondary,
    onTertiary = DarkOnTertiary,
    onBackground = DarkOnBackground,
    onSurface = DarkOnSurface,
)

private val LightColorScheme = lightColorScheme(
    primary = LightPrimary,
    secondary = LightSecondary,
    tertiary = LightTertiary,
    background = LightBackground,
    surface = LightSurface,
    onPrimary = LightOnPrimary,
    onSecondary = LightOnSecondary,
    onTertiary = LightOnTertiary,
    onBackground = LightOnBackground,
    onSurface = LightOnSurface,
)




@Composable
fun RecipesTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }


    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}


