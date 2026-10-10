package com.example.nobelprizeapp.ui.locale

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidedValue
import androidx.compose.runtime.staticCompositionLocalOf
import java.util.Locale

actual object LocalAppLocale {
    private val local = staticCompositionLocalOf { Locale.getDefault().language }

    actual val current: String
        @Composable get() = local.current

    @Composable
    actual infix fun provides(value: String): ProvidedValue<*> {
        Locale.setDefault(Locale.forLanguageTag(value))
        return local.provides(value)
    }
}