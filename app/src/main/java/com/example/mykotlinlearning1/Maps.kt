package com.example.mykotlinlearning1

/**
 * A Map is a collection of key/value pairs
 * A Maps keys are unique
 * Can be created as a mapof or mutablemapof
 *
 */

fun main() {

    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    //Maps also contain a size property
    println(solarSystem.size)
    //Add a key/value pair to the map
    solarSystem["Pluto"] = 5
    println(solarSystem.size)
    //getting the value from a key in the map
    println(solarSystem["Pluto"])
    //if the key does not exist the get will return null
    println(solarSystem["Theia"])
    //To remove a key/value pair
    solarSystem.remove("Pluto")
    //modify a value for a given key
    solarSystem["Jupiter"] = 78
    solarSystem.put("Jupiter", 78)

}