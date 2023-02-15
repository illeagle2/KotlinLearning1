package com.example.mykotlinlearning1

/**
 * inline functions reduce the overhead of lambdas when
 * using higher order functions
 * when we use the inline keyword the compiler does not allocate
 * any memory for this function, and instead the compiler copies
 * the piece of code virtually at runtime
 *
 * use cases
 * 1. when you need to access higher-order functions
 * 2. when you need to allocate memory more efficiently
 * 3. when you need to pass a functional type parameter
 * 4. Useful when a function accepts another function or lambdas as a parameter
 * 5. used when you need to prevent object creation and have better control flow
 */


//Example inline function
inline fun myInlineFun(myFun: () -> Unit ){
    myFun()
    println("tutorial inline function")
}
// main function
fun main() {
    myInlineFun { println("call to inline function") }
}

//Example of a one like function understood to return
fun multiply(a: Int, b: Int) = a * b

//Basic function that runs 3 lines of code
fun printThreeLines() {
    println("first")
    println("second")
    println("third")
}

//Function that has parameters and returns a value
fun printPow(base: Int, exp: Int): Int {
    var result = 1
    for (i in 1..exp){
        result *= base
    }
    return result
    //println("$base to the power of $exp is $result")
}

