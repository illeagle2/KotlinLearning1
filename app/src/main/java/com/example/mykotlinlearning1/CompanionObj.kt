package com.example.mykotlinlearning1

/**
 * an object used within a class is a companion object
 * we use these to control the visibility of the object
 */

class School{

    companion object Math {
        fun create(): School = School()
    }
}

fun main() {
    //access to the companion object can be using only the class name
    val highschool = School.create()

}