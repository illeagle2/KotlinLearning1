package com.example.mykotlinlearning1

/**
 * Objects in kotlin are classes that have been created
 * in your code
 *
 * Singleton Objets can only be created once and are made
 * using the keyword object
 */


fun main() {
    //to create an object we must call the class
    val obj = animal()

    //to create a singleton
    val singleton = cat

}


class animal{
    val name = "animal"
}

object cat {
    val name = "cat"
}