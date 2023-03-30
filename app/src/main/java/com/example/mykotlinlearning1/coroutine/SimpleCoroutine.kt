package com.example.kotlinbasics.advnaced.coroutinebasic

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.io.path.fileVisitor


/*
* In this example, a coroutine is launched in the global scope and the delay function is used to pause the coroutine for a specified amount of time.
* */
fun main2() {
    GlobalScope.launch {
        delay(1000L)
        println("Hello from coroutine!")
    }
    println("Hello from main!")
    runBlocking { delay(2000L) }
}


fun main(){

    var names = listOf<String>("Jon", "Kim", "Jon", "Larry")
    var names2 = names.toSet().toList()

    println(names2)

    GlobalScope.launch {
        delay(1000L)
        println("from coroutine")
    }
    println(filterList(names))
    runBlocking { delay(2000L) }

}

fun filterList(names: List<String>): List<String> {
    return names.distinct()

}
