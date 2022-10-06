package nam.tran

import java.util.*

// Max Consecutive Ones

fun main(){
    while (true){
        val text = readLine()
        val array = text?.split(" ")?.map {
            it.toInt()
        }?.toList() ?: arrayListOf()
        println(findMaxConsecutiveOnes(array.toIntArray()))
    }
}

fun findMaxConsecutive(nums: IntArray): Int {
    var count = 0
    var currentCount = 1
    var i = 0
    var k = 1
    while (true){
        if (nums[i] == nums[k]){
            currentCount++
            if (count < currentCount){
                count = currentCount
            }
        }else{
            currentCount = 1
            i = k
        }
        k++
        if (k >= nums.size){
            if (count < currentCount){
                count = currentCount
            }
            break
        }
    }
    return count
}

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var count = 0
    var currentCount = 0
    for (num in nums){
        if (num == 1){
            currentCount++
        }else{
            count = maxOf(count,currentCount)
            currentCount = 0
        }
    }

    return maxOf(count,currentCount)
}