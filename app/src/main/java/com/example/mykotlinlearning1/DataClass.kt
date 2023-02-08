package com.example.mykotlinlearning1


/**
* this is an example data class
* data class builds a class that holds data
* data can be passed to constructor or body
**/

data class DataClass(
    var name: String,
    var `eye-color`: String,
)
{
    var age: Int = 0
}
/*
*Nama and eyecolor are passed as constructor parameters
* age has a getter and setter applied
 */
fun main() {
    val person1 = DataClass("John", "blue")
    person1.age = 10

    println(
        " Name: ${person1.name}, Age: ${person1.age},  Eye color: ${person1.`eye-color`}"
    )

}
