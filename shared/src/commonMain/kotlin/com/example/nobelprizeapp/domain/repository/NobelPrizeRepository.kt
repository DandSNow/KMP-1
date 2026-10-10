package com.example.nobelprizeapp.domain.repository

import com.example.nobelprizeapp.domain.model.Laureate

interface NobelPrizeRepository {
    fun getLaureates(): List<Laureate>
}