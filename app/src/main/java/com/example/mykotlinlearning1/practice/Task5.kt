package com.example.mykotlinlearning1.practice

//show a summary of events by darpart

enum class Daypart5{
    MORNING, AFTERNOON, EVENING
}

//modify the data class to accept the new enum class
data class Event5 (
    val title: String,
    val description: String? = null,
    val daypart: Daypart5,
    val durationInMinutes: Int
)

fun main() {
    val event1 = Event5(title = "Wake up", description = "Time to get up", daypart = Daypart5.MORNING, durationInMinutes = 0)
    val event2 = Event5(title = "Eat breakfast", daypart = Daypart5.MORNING, durationInMinutes = 15)
    val event3 = Event5(title = "Learn about Kotlin", daypart = Daypart5.AFTERNOON, durationInMinutes = 30)
    val event4 = Event5(title = "Practice Compose", daypart = Daypart5.AFTERNOON, durationInMinutes = 60)
    val event5 = Event5(title = "Watch latest DevBytes video", daypart = Daypart5.AFTERNOON, durationInMinutes = 10)
    val event6 = Event5(title = "Check out latest Android Jetpack library", daypart = Daypart5.EVENING, durationInMinutes = 45)

    //Users creates multiple events. How can we store the events for reference
    val events = mutableListOf<Event5>(event1, event2, event3, event4, event5, event6)

    //filter the events to short when below 60 mins
    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("you have ${shortEvents.size} short events")

    //show events by daypart
    val groupedEvents = events.groupBy { it.daypart }
    groupedEvents.forEach{
        (daypart, events) -> println("$daypart: ${events.size} events")
    }
}