package com.example.mykotlinlearning1.coroutine

import kotlinx.coroutines.*

fun main() {

    runBlocking {// blocks the main thread until the inside executions are completed
        GlobalScope.launch {  // returns a job
            delay(1000)
            println("Hi, I'm from your launch Coroutine!")
        }

        println("Hi, I'm main function!")
        delay(2000)
    }

    println("Hi, I'm outside RunBlocking!")

    runBlocking {  // blocks the main thread until the inside executions are completed
        val asyncTaskExec = async {// returns a deferred
            delay(1000)
            println("Hi, I'm from your async Coroutine!")
        }

        println(asyncTaskExec.await())
        println("Hi, I'm main function part 2!")
        delay(2000)
    }

    println("Hi, I'm outside RunBlocking!")


}