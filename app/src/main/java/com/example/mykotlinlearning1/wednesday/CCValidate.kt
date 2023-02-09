package com.example.mykotlinlearning1

//3) validate a credit card:
//Input is a card number and expiry date.
//Output should be valid or not.
//
//First 4 digits should be either
//1111, 1232, 5627, 8121
//
//Last 4 digits should be expiry date mm/yy
//
//Input: 1111-2321-7625-1234
//Input2: 12/34
//
//Output should be valid/true

fun validate( cc:String, exp:String ): Boolean {
    val check1: Boolean
    val check2: Boolean
    //grab first 4 digits
    val first4 = cc.take(4).toInt()
    //grab last 4 digits
    val last4 = cc.takeLast(4).toInt()
    //convert exp dat to int for comparison
    val expInt = exp.replace("/","").toInt()

    //check first 4 digits against valid inputs
    check1 = first4 == 1111 || first4 == 1232 || first4 == 5627 || first4 == 8121

    //check last 4 digits of CC to entered exp date
    check2 = last4 == expInt

    //if both conditions are met return true
    return check1 && check2
}

fun main() {
    val response = validate("1111-2321-7625-1234", "12/34")
    println(response)
}