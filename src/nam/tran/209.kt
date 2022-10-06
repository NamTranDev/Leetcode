package nam.tran

import java.util.*

// Minimum Size Subarray Sum

fun main(){
    while (true) {
        val scanner = Scanner(System.`in`)
        val target = scanner.nextInt()
        val array = readLine()?.split(",")?.map {
            it.toInt()
        }?.toList() ?: arrayListOf()
        println(minSubArrayLen(target,array.toIntArray()))
    }
}

fun minSubArrayLen(target: Int, nums: IntArray): Int {
    var min = Int.MAX_VALUE
    var sum = 0
    var l = 0

    for (i in nums.indices) {
        sum += nums[i]

        while (sum >= target) {
            min = minOf(min, i - l + 1)
            sum -= nums[l]
            l++
        }
    }

    return if (min == Int.MAX_VALUE) 0 else min
}