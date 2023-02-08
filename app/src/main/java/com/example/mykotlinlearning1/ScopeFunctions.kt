package com.example.mykotlinlearning1

import android.content.Intent

/**
 * Scope functions: let, run, with, apply, also
 * are used to help reduce code by implementing DRY code
 * they allow a temporary scope to work in
 */


fun main() {

    var number: Int? = null
    var i = 0

    if (number != null) {
        val number2 = number + 1
    }

    //Let used for null check
    val x = number?.let {
        val number2 = it + 1
        number2
    } ?: 7

    //Also is used to allow two operations
    // and returns the result
    fun getSquaredI() = (i * i).also { i++ }
    println(i)
    getSquaredI()
    println(i)

    //Apply used for modifying objects
    val intent = Intent().apply {
        putExtra("","")
        putExtra("", 0)
        action = ""
    }

    //Run is used similar to apply but returns the last line
    val intent2 = Intent().run {
        putExtra("","")
        putExtra("", 0)
        action = ""
    }

    //With uses an object then run this code
    with(Intent()){

    }
}