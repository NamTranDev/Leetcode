package nam.tran

import java.util.*

// Largest Number At Least Twice of Others

fun main() {
    val array = readLine()?.split(" ")?.map {
        it.toInt()
    }?.toIntArray() ?: intArrayOf()
    println(Arrays.toString(array))
    print(dominantIndex(array))
}

fun dominantIndex(nums: IntArray): Int {
    var max = 0
    var index = 0
    for (i in nums.indices){
        val value = nums[i]
        if (max < value)   {
            index = i
            max = value
        }
    }
    for(i in nums.indices){
        val value = nums[i]
        if(value == max)
            continue
        if(value * 2 > max){
            return -1
        }
    }
    return index
}