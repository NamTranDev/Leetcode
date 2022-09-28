package nam.tran

import java.util.*

// Fizz Buzz

fun main(){
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    print(fizzBuzz(n).toString())
}

fun fizzBuzz(n: Int): List<String> {
    val result = mutableListOf<String>()
    for (i in 1..n){
        if (i%3 == 0 && i%5 == 0)
            result.add("FizzBuzz")
        else if (i%3 == 0)
            result.add("Fizz")
        else if (i%5 == 0)
            result.add("Buzz")
        else result.add("$i")
    }
    return result
}