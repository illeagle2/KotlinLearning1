package com.example.mykotlinlearning1

// List are like arrays but resizable
// List is a readonly collections
// MutableList allows for modifications of elements


fun main() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    println(solarSystem[2])
    println(solarSystem.indexOf("Earth"))

    //loop through a list with For loop
    for (a in solarSystem) {
        println(a)
    }

    //Mutablelist to add or remove elements
    val solarSystem2 = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    // add element to end of list
    solarSystem2.add("Pluto")
    // add element at index
    solarSystem2.add(3, "Theia")
    //update element at index
    solarSystem2[1] = "Sun"
    //remove elements from a list can be specific element or at index
    solarSystem2.removeAt(9)
    //Boolean check does element exit in list
    println(solarSystem2.contains("Pluto"))
    println("Pluto" in solarSystem2)
}