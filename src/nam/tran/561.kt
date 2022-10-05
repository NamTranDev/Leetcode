package nam.tran

import java.util.*

// Array Partition

fun main(){
    val array = readLine()?.split(" ")?.map {
        it.toInt()
    }?.toIntArray() ?: intArrayOf()
    print(arrayPairSum(array))
}

fun arrayPairSum(nums: IntArray): Int {
    nums.sort()
    var max = 0
    for(i in 0 until nums.size step 2){
        max+=nums[i]
    }
    return max
}