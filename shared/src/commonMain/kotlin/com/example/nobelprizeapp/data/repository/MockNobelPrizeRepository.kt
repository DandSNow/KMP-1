package com.example.nobelprizeapp.data.repository

import com.example.nobelprizeapp.data.mock.mockLaureates
import com.example.nobelprizeapp.domain.NobelPrizeRepository
import com.example.nobelprizeapp.domain.model.Laureate

class MockNobelPrizeRepository : NobelPrizeRepository {
    override fun getLaureates(): List<Laureate> = mockLaureates
    override fun getLaureate(id: String): Laureate? = mockLaureates.find { it.id == id }
}