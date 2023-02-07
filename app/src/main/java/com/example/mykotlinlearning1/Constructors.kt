package com.example.mykotlinlearning1

/*
* example of primary and secondary constructors
 */


//primary  constructor
class Add(val a: Int, val b: Int){
    //some code
}

//Secondary constructor
//requires constructor keyword
class Add2(val name: String){
    constructor(a: Int, b:Int) {
       var c = a + b
       println(c)
    }
}