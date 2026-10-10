package com.example.nobelprizeapp.domain.model

data class Laureate(
    val id: String,
    val knownName: String,
    val fullName: String,
    val gender: String,
    val birthDate: String,
    val birthPlace: String,
    val nobelPrizes: List<Prize>
)