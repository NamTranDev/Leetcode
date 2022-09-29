package nam.tran

import java.util.*

// Find the Middle Index in Array

fun main() {
    val array = readLine()?.split(" ")?.map {
        it.toInt()
    }?.toIntArray() ?: intArrayOf()
    println(Arrays.toString(array))
    print(findMiddleIndex(array))
}

fun findMiddleIndex(nums: IntArray): Int {
    var index = -1
    var countStart = 0
    for (i in nums.indices) {
        var count = 0
        for (j in i + 1..nums.size - 1) {
            count += nums[j]
        }
        println(countStart)
        println(count)
        if (countStart == count) {
            index = i
            break
        } else {
            countStart += nums[i]
        }
    }
    return index
}