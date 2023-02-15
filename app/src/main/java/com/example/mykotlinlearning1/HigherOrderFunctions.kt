package com.example.mykotlinlearning1

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)


fun main() {

    //Loop over a list with forEach()
    cookies.forEach{
        println("Menu item: ${it.name}")
    }

    //map() function let you transform a collection
    //into a new collection of the same size

    val fullMenu = cookies.map {
        "${it.name} - $ ${it.price}"
    }

    fullMenu.forEach{
        println(it)
    }

    //filer() function lets you transform a collection
    //into a subset of a collection
    //lets filter the list to show only sofBaked cookies
    val softBakedMenu = cookies.filter {
        it.softBaked
    }

    softBakedMenu.forEach{
        println("Soft cookies:")
        println(it.name)
    }

    //groupBy() function can be used to turn a list into a map
    val groupedMenu = cookies.groupBy {
        it.softBaked
    }
    val softBakedGroup = groupedMenu[true] ?: listOf()
    val crunchyGroup = groupedMenu[false] ?: listOf()

    crunchyGroup.forEach{
        println("Crunchy cookies:")
        println(it.name)
    }

    //fold() function is used to generate a sigle value from a collction
    //common use case for calculating a total
    val totalPrice = cookies.fold(0.0) {
        total, cookie -> total + cookie.price
    }

    println("Total Price: $ $totalPrice")

    //sortedBy() function used to sort objects with multiple properties
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }

}