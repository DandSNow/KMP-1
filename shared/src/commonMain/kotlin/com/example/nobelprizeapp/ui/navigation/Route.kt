package com.example.nobelprizeapp.ui.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed interface Route : NavKey {
    @Serializable
    data object LaureateList : Route

    @Serializable
    data class LaureateDetail(val id: String) : Route
}