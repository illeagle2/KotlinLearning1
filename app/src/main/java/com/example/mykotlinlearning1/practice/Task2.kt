package com.example.mykotlinlearning1.practice

//creat an emum class to hold day part values of:
//Morning, Afternoon, Evening

enum class DayPart{
    MORNING, AFTERNOON, EVENING
}

//modify the data class to accept the new enum class
data class Event2 (
    val Title: String,
    val description: String? = null,
    val daypart: DayPart,
    val duration: Int
)