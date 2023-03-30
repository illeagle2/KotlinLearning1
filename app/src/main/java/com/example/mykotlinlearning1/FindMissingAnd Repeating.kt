package com.example.mykotlinlearning1

class FindMissingAndRepeating {

    fun arrayFilter(numbers: IntArray): Pair<Int, Int> {

        var set = HashSet<Int>()
        var missing = 0
        var repeating = 0

        for (i in numbers) {
            if (set.contains(i)) {
                repeating = i
            } else {
                set.add(i)
            }
        }

        for (i in 1..numbers.size) {
            if (!set.contains(i)) {
                missing = i
            }
        }

        return Pair(missing, repeating)

    }
}

fun main() {

    val result = FindMissingAndRepeating().arrayFilter(intArrayOf(1, 2, 3, 5))
    println(result)
}