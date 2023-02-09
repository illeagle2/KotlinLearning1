package com.example.mykotlinlearning1

//2) Replace annotations in a string with the provided map.
//Example -> input one: "some random string @test challenge @okay"
//Input two: @test is Laptop, @okay is Gone
//Output: some random string Laptop challenge Gone

fun main() {
//    val input1 = "some random string @test challenge @okay"
//    //val input2 = "@test is Laptop, @okay is Gone"
//    val input2 = mapOf("@test" to "Laptop", "@okay" to "Gone")
//    //grab mapping from input2
//    val testMap = "Laptop"
//    val okMap = "Gone"
//    //replace @test with Laptop and @okay with Gone
//    val output = input1
//        .replace("@test", testMap)
//        .replace("@okay", okMap)

    println(
        mapString(
        "some random string @test challenge @okay",
        mapOf("@test" to "Laptop", "@okay" to "Gone") as HashMap<String, String>
        )
    )

}

fun mapString(input1: String, input2: HashMap<String,String>): String {
    var output = input1
    for (key in input2.keys){
        output = output.replace(key, input2[key].toString())
    }

    return output

}