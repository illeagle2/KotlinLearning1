package com.example.mykotlinlearning1

/*
* Extension Function -> Let’s you extend a class functionality without having to inherit it
*/

class Circle(
    val radius: Double
) {

    fun area(): Double {
        return Math.PI * radius * radius
    }

}

// Extension Function

fun Circle.perimeter(): Double {
    return 2 * Math.PI * radius
}

fun Circle.perimeter1() = 2 * Math.PI * radius

fun main() {
    val circle = Circle(4.5)

    println("Radius   : ${circle.radius}")
    println("Area     : ${circle.area()}")
    println("Perimeter: ${circle.perimeter()}")

}