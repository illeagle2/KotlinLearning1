package com.example.mykotlinlearning1.practice

data class Event (
    val Title: String,
    val description: String? = null,
    val daypart: String,
    val duration: Int
        )