package com.example.mykotlinlearning1.practice

enum class Daypart4{
    MORNING, AFTERNOON, EVENING
}

//modify the data class to accept the new enum class
data class Event4 (
    val title: String,
    val description: String? = null,
    val daypart: Daypart7,
    val durationInMinutes: Int
)

fun main() {
    val event1 = Event7(title = "Wake up", description = "Time to get up", daypart = Daypart7.MORNING, durationInMinutes = 0)
    val event2 = Event7(title = "Eat breakfast", daypart = Daypart7.MORNING, durationInMinutes = 15)
    val event3 = Event7(title = "Learn about Kotlin", daypart = Daypart7.AFTERNOON, durationInMinutes = 30)
    val event4 = Event7(title = "Practice Compose", daypart = Daypart7.AFTERNOON, durationInMinutes = 60)
    val event5 = Event7(title = "Watch latest DevBytes video", daypart = Daypart7.AFTERNOON, durationInMinutes = 10)
    val event6 = Event7(title = "Check out latest Android Jetpack library", daypart = Daypart7.EVENING, durationInMinutes = 45)

    //Users creates multiple events. How can we store the events for reference
    val events = mutableListOf<Event7>(event1, event2, event3, event4, event5, event6)

    //filter the events to short when below 60 mins
    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("you have ${shortEvents.size} short events")
}
