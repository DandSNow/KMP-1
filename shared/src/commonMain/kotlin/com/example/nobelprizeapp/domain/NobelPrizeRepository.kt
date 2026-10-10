package com.example.nobelprizeapp.domain

import com.example.nobelprizeapp.domain.model.Laureate

interface NobelPrizeRepository {
    fun getLaureates(): List<Laureate>
    fun getLaureate(id: String): Laureate?
}