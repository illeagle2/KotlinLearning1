package com.example.mykotlinlearning1

/**
 * Sets are a collection that does not have a specific order
 * and does not allow duplicates. able to do this with hash codes
 *
 *
 * searching a set is much faster than searching a list
 * Sets use more memory than a list
 *
 * both set and MutableSet are used
 *
 */

fun main() {
    //Mutable Set example
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    //can still print the size of this set
    println(solarSystem.size)
    //Because this Set is mutable we can add, remove, and edit elements
    solarSystem.add("Pluto")
    //Can do boolean checks for elements
    println(solarSystem.contains("Pluto"))
    println("Pluto" in solarSystem)
    //Trying to add a duplicate does nothing
    solarSystem.add("Pluto")
    //Removing elements for the Set
    solarSystem.remove("Pluto")
}

