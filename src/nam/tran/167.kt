package nam.tran

import java.util.*

// Two Sum II - Input Array Is Sorted

fun main(){
    while (true){
        val scanner = Scanner(System.`in`)
        val target = scanner.nextInt()
        val array = readLine()?.split(" ")?.map {
            it.toInt()
        }?.toList() ?: arrayListOf()
        println(Arrays.toString(twoSum(array.toIntArray(),target)))
    }
}

fun twoSum2(numbers: IntArray, target: Int): IntArray {
    for (i in 0 until numbers.size){
        for (j in i + 1 until numbers.size){
            if (numbers[i] + numbers[j] == target){
                return intArrayOf(i+1,j+1)
            }
        }
    }
    return intArrayOf()
}

fun twoSum(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.size - 1
    while (left < right){
        val sum = numbers[left] + numbers[right]
        when {
            sum == target -> {
                return intArrayOf(left + 1,right + 1)
            }
            sum > target -> {
                right--
            }
            else -> left++
        }
    }
    return intArrayOf()
}