package com.example.nobelprizeapp.ui.navigation

import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.ui.NavDisplay
import com.example.nobelprizeapp.domain.NobelPrizeRepository
import com.example.nobelprizeapp.ui.screen.LaureateDetailScreen
import com.example.nobelprizeapp.ui.screen.LaureateListScreen
import com.example.nobelprizeapp.ui.screen.NobelPrizeIntent
import com.example.nobelprizeapp.ui.screen.NobelPrizeState

@Composable
fun AppNavigation(
    backStack: MutableList<NavKey>,
    repository: NobelPrizeRepository,
    state: NobelPrizeState,
    onIntent: (NobelPrizeIntent) -> Unit,
) {
    NavDisplay(
        backStack = backStack,
        modifier = Modifier.fillMaxSize(),
        transitionSpec = {
            slideInHorizontally(initialOffsetX = { it }) togetherWith
                    slideOutHorizontally(targetOffsetX = { -it / 3 })
        },
        popTransitionSpec = {
            slideInHorizontally(initialOffsetX = { -it / 3 }) togetherWith
                    slideOutHorizontally(targetOffsetX = { it })
        },
        entryProvider = { route ->
            when (route) {
                is Route.LaureateList -> NavEntry(route) {
                    LaureateListScreen(
                        state = state,
                        onIntent = onIntent
                    )
                }
                is Route.LaureateDetail -> {
                    val laureate = repository.getLaureate(route.id)
                    NavEntry(route) {
                        LaureateDetailScreen(
                            laureate = laureate,
                            onBack = { backStack.removeLastOrNull() }
                        )
                    }
                }
                else -> error("Unknown route: $route")
            }
        }
    )
}