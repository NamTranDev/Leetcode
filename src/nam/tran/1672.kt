package nam.tran

import java.util.*

// Richest Customer Wealth

fun main(){
    while (true){
        val scanner = Scanner(System.`in`)
        val n = scanner.nextInt()
        var arrayint = Array(n) { readLine()!!.split(" ").map { it.toInt() }.toIntArray() }
        println(maximumWealth(arrayint).toString())
    }
}

fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = 0
     accounts.forEach {
        val sum = it.sum()
        if (sum > max)
            max = sum
    }
    return max
}