package com.example.mykotlinlearning1

/*
*    Elvis Operator ( ?: ) -> gives you an option to have default value when there is a null ( variable ?: defaultValue )
*    Safe Call ( ?. ) -> makes sure the value you are trying to access has a value in it (to access safe value -> someVariable?.value )
*    Force Call ( !! ) -> overlooks the fact that it is a nullable variable because developer says so ( nullableVariable!!.value ) - (not recommended unless you have made sure with some sort of null check)
* */
fun main() {

    var intValue: Int? = null
    var floatValue: Float? = null
    var doubleValue: Double? = null
    var stringValue: String? = "Actual value here!"
    var booleanValue: Boolean? = null

    // Null safety magic
    val intValue1: Int = intValue ?: 1
    val floatValue1: Float = intValue?.toFloat() ?: 1.2f
    if (floatValue != null) {
        val doubleValue1: Double = floatValue!!.toDouble()
    }
    var stringValueNew = ""
    stringValue?.let { value ->
        stringValueNew = value
    }

    println(stringValueNew)

}