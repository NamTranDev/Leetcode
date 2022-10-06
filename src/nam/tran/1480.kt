package nam.tran

import java.util.*
import kotlin.collections.HashMap

// Running Sum of 1d Array

fun main(){
    while (true){
        val scanner = Scanner(System.`in`)
        val n = scanner.nextInt()
        var arrayint = IntArray(n) { readLine()!!.toInt() }
        println(Arrays.toString(runningSum(arrayint)))
    }
}

fun runningSum(nums: IntArray): IntArray {
    if (nums.size == 1)
        return nums

    for (i in 1 until nums.size){
        nums[i] += nums[i-1]
    }
    return nums
}