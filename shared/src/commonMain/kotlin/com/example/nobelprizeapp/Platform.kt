package com.example.nobelprizeapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform