package com.example.mykotlinlearning1

inline fun higherfun( str : String, mycall :(String)-> Unit){
    // inovkes the print() by passing the string str
    mycall(str)
}
// main function
fun main(args: Array<String>) {
    print("GeeksforGeeks: ")
    higherfun("A Computer Science portal for Geeks",::print)
}
