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
    val obj = Animal()

    //to create a singleton notice we do not use the () after calling the class
    //we are not creating a new instance each time
    val singleton = Cat

}


class Animal{
    val name = "animal"
}

object Cat {
    val name = "cat"
}