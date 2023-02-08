package com.example.mykotlinlearning1

/*
    example of primary and secondary constructors
 */


//primary  constructor

fun main() {
    Add(1, 2)
    Add2(1,2)
    Add2(1,2,3)
    Add2(1,2,3,4)
}
class Add (a: Int, b: Int) {
    var c = a + b

}

//Secondary constructor
//requires constructor keyword
//workd like overloading a class
class Add2{
    constructor(a: Int, b:Int) {
       val c = a + b
       println(c)
    }
    constructor(a:Int,b:Int,c:Int){
        val d = a + b + c
        println(d)
    }
    constructor(a:Int, b:Int,c:Int,d:Int){
        val e = a + b + c + d
        println(e)
    }
}

