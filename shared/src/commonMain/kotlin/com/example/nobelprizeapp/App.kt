package com.example.nobelprizeapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.NavKey
import com.example.nobelprizeapp.data.repository.MockNobelPrizeRepository
import com.example.nobelprizeapp.ui.locale.ProvideAppLocale
import com.example.nobelprizeapp.ui.navigation.AppNavigation
import com.example.nobelprizeapp.ui.navigation.Route
import com.example.nobelprizeapp.ui.screen.NobelPrizeIntent
import com.example.nobelprizeapp.ui.screen.NobelPrizeViewModel
import com.example.nobelprizeapp.ui.theme.NobelPrizeTheme

@Composable
fun App() {
    val repository = remember { MockNobelPrizeRepository() }
    val viewModel = remember { NobelPrizeViewModel(repository) }
    val state by viewModel.state.collectAsState()

    val backStack = remember { mutableStateListOf<NavKey>(Route.LaureateList) }
    var isDarkTheme by remember { mutableStateOf(true) }
    var language by remember { mutableStateOf("ru") }

    // Оборачиваем всё приложение в наш провайдер локали
    ProvideAppLocale(language) {
        key(language) { // Этот ключ заставит Compose пересоздать поддерево при смене языка
            NobelPrizeTheme(darkTheme = isDarkTheme) {
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(8.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Button(onClick = { isDarkTheme = !isDarkTheme }) {
                            Text(if (isDarkTheme) "☀ Light" else "🌙 Dark")
                        }
                        Button(onClick = { language = if (language == "ru") "en" else "ru" }) {
                            Text(if (language == "ru") "EN" else "RU")
                        }
                    }
                    AppNavigation(
                        backStack = backStack,
                        repository = repository,
                        state = state,
                        onIntent = { intent ->
                            when (intent) {
                                is NobelPrizeIntent.SelectLaureate -> {
                                    backStack.add(Route.LaureateDetail(intent.id))
                                }
                            }
                        }
                    )
                }
            }
        }
    }
}