package com.example.mykotlinlearning1

const val WEBSITE_NAME = ""

fun main() {
    val cantChangeValue: String = "Something"
    var canChangeValue: String = "Nothing"

    canChangeValue = "somethingNew"

    println(canChangeValue)

    val intValue: Int = 2
    val floatValue: Float = 2.2f
    val doubleValue: Double = 2.4
    val stringValue: String = "LG"
    val booleanValue: Boolean = true

//    intValue = doubleValue

    var intValue1 = 2
    var floatValue1 = 2.2f
    var doubleValue1 = 2.4
    var stringValue1 = "LG"
    var booleanValue1 = true

    intValue1 = doubleValue.toInt()
    floatValue1 = intValue1.toFloat()
    doubleValue1 = floatValue1.toDouble()
    stringValue1 = doubleValue1.toString()

}