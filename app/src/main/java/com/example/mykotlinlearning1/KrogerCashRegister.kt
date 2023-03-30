package com.example.mykotlinlearning1


/***
 * Code challenge for Kroger
 * Q.) Tell us what you would do if you were asked to join a group of people to help complete a project.
 * The rest of the group has been working together for weeks and you have new ideas on how to approach the project.
 * Your ideas are different from the group's current approach. How would you handle the situation? (Video recording)
 *
 * A) Learn their approach and try out new things. If their approach is working stick with it. If not work on an example to bring to meetings and explain a better approach
 *
 * Q.) Please describe a time you were asked to perform skills or meet requirements that were outside of your comfort zone.
 * Describe the situation, the steps you took, and the outcome. (Video recording)
 *
 * A) STAR When i was working on a project and asked to be a team lead. This was new to me coming from just being a developer as it required more management skills
 * along with more attention to details for planning. I took up the roll with some guidance and was able to lead my team of 10 developers working on my last project
 *
 * Q.) Please describe a time you had to cope with a high-pressure or stressful situation at work or in school.
 * Describe the situation, how you responded, and your approach. What was the outcome? (Video recording)
 *
 * A) STAR Having deadlines are important to keeps projects in motion but they are stress inducing. I was working on a project once where
 * an important deadline was staring me down. In this situation I was hitting roadblocks and reached out to my colleges to help because I knew he had
 * worked on a similar project before. With his help I was able to meet the deadline with my task completed
 *
 * Q.) Please describe a time when you were faced with conflicting interests between what was right for
 * a customer or coworker versus what was right for your company as a whole. Describe the situation, your actions, and the outcome. (Video recording)
 *
 * A) STAR In highschool I picked up work in the service industry that taught me alot about work. Being friendly to customers was the most important trait that I learned
 * as people form opinions within the first few minutes of meeting you. In one instance a cowork and a customer were arguing over something and I was tasked as the shift lead
 * at the time so my responsibility was to step in. To approach the situation I asked my coworker to step away as I could see the fustration he was showing was not helping the situation.
 * I asked the customer how i could help and what their concerns were. After listening to the customer I apologised for my coworkers actions, offered to cover their meal and asked that they leave the
 * building. I learned that people are bound to have differences but its important on how we handle those difference.
 *
 */


class KrogerCashRegister (){

    private val cashMap = mapOf(
        "ONE HUNDRED" to 10000,
        "FIFTY" to 5000,
        "TWENTY" to 2000,
        "TEN" to 1000,
        "FIVE" to 500,
        "TWO" to 200,
        "ONE" to 100,
        "HALF DOLLAR" to 50,
        "QUARTER" to 25,
        "DIME" to 10,
        "NICKLE" to 5,
        "PENNY" to 1
    )

    private val coin = mutableListOf<String>()
    private var cost: Double = 0.0
    private var paid: Double = 0.0
    private var change: Int = 0


    fun getUserInput() {
        println("Enter PP;CH: ")
        val stringInput = readLine()
        //println("you entered: $stringInput")
        val strs = stringInput?.split(";")
        //println("Split input: $strs")
        cost = strs?.get(0)?.toDouble() ?: 0.00
        //multiple by 100 to get convert decimal to int
        cost = cost * 100
        paid = strs?.get(1)?.toDouble() ?: 0.00
        paid = paid * 100
        change = calculateChangeDue(cost.toInt(), paid.toInt())
    }

     fun calculateChangeDue(price: Int, cash: Int): Int {
        return cash - price
    }

    fun countCoinsDue(){

        for (keys in cashMap){
            while (keys.value<=change){
                coin.add(keys.key)
                change -= keys.value
            }
        }

        if (coin.isNotEmpty()) {
            coin.sort()
            println(coin)
        }else if (paid == cost){
            println("ZERO")
        }else {
            println("ERROR")
        }

    }
}

fun main() {
    val register = KrogerCashRegister()
    register.getUserInput()
    register.countCoinsDue()
}