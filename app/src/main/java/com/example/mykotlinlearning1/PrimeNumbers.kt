package com.example.mykotlinlearning1

class primeNumbers() {

    var primNumber = mutableListOf<Int>()

    fun check100(){
        for (i in 1..100){
            if (isPrime(i)) primNumber.add(i)
        }
        println(primNumber)
    }

    fun isPrime(num:Int): Boolean{
        for (i in 2 until num){
            if (num % i == 0){
                //println("not prim")
                return false
            }
        }
        return true
    }
}

fun main () {
    val num = primeNumbers()
    //num.isPrime(4)
    num.check100()

}