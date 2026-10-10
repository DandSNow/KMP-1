package com.example.nobelprizeapp.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nobelprizeapp.domain.NobelPrizeRepository
import com.example.nobelprizeapp.domain.model.Laureate
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class NobelPrizeViewModel(
    private val repository: NobelPrizeRepository
) : ViewModel() {

    private val _state = MutableStateFlow(NobelPrizeState())
    val state: StateFlow<NobelPrizeState> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            val laureates = repository.getLaureates()
            _state.update { it.copy(laureates = laureates) }
        }
    }

    fun onIntent(intent: NobelPrizeIntent) {
        when (intent) {
            is NobelPrizeIntent.SelectLaureate -> { /* обрабатывается в App */ }
        }
    }
}

data class NobelPrizeState(
    val laureates: List<Laureate> = emptyList(),
    val isLoading: Boolean = false
)

sealed interface NobelPrizeIntent {
    data class SelectLaureate(val id: String) : NobelPrizeIntent
}