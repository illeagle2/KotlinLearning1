package com.example.mykotlinlearning1

import java.io.File

/*
*This is an example sealed class
* sealed classes are classes with
* restricted access
*
 */
sealed class Demo {
    class A:Demo(){
        fun display(){
            println("Subclass A of sealed class")
        }
    }
}

fun main() {
    val obj = Demo.A()
    obj.display()
}
