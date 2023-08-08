package com.example.linalove

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform