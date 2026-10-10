package com.example.nobelprizeapp.ui.locale

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidedValue

expect object LocalAppLocale {
    val current: String
        @Composable get

    @Composable
    infix fun provides(value: String): ProvidedValue<*>
}

@Composable
fun ProvideAppLocale(language: String, content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalAppLocale.provides(language), content = content)
}