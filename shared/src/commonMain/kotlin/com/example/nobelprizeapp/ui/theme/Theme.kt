package com.example.nobelprizeapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF6B4E2E),
    onPrimary = Color.White,
    primaryContainer = Color(0xFFF4E1C1),
    onPrimaryContainer = Color(0xFF2A1A05),
    surface = Color(0xFFFFFBF5),
    onSurface = Color(0xFF1F1B16),
    surfaceVariant = Color(0xFFEDE1D2),
    onSurfaceVariant = Color(0xFF4F4539),
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFFD4B98A),
    onPrimary = Color(0xFF3B2A11),
    primaryContainer = Color(0xFF524025),
    onPrimaryContainer = Color(0xFFF4E1C1),
    surface = Color(0xFF1A1612),
    onSurface = Color(0xFFEAE1D9),
    surfaceVariant = Color(0xFF4F4539),
    onSurfaceVariant = Color(0xFFD3C4B4),
)

@Composable
fun NobelPrizeTheme(
    darkTheme: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        content = content
    )
}