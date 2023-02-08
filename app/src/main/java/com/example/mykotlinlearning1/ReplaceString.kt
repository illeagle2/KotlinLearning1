package com.example.mykotlinlearning1

//2) Replace annotations in a string with the provided map.
//Example -> input one: "some random string @test challenge @okay"
//Input two: @test is Laptop, @okay is Gone
//Output: some random string Laptop challenge Gone

fun main() {
    val input1 = "some random string @test challenge @okay"
    //val input2 = "@test is Laptop, @okay is Gone"
    val input2 = mapOf("@test" to "Laptop", "@okay" to "Gone")

    //grab mapping from input2
    val testMap = "Laptop"
    val okMap = "Gone"


    //replace @test with Laptop and @okay with Gone
    val output = input1
        .replace("@test", testMap)
        .replace("@okay", okMap)

    println(output)

//    //from input1 grab up to @test
//    val out1 = input1.replaceAfter("string", "")
//    //from input2 grab keyword Laptop
//    var out2 = input2.replaceAfter("Laptop","")
//    out2 = out2.replaceBefore("Laptop","")
//    //From input1 grab keyword challenge
//    var out3 = input1.replaceAfter("challenge", "")
//    out3 = out3.replaceBefore("challenge","")
//    //from input2 get keyword Gone
//    val out4 = input2.replaceBefore("Gone", "")
//    //combine the request
//    val output = "$out1 $out2 $out3 $out4"
//
//    println(output)

}