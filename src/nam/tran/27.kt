package nam.tran

import java.util.*

// Remove Element

fun main(){
    while (true) {
        val scanner = Scanner(System.`in`)
        val target = scanner.nextInt()
        val array = readLine()?.split(" ")?.map {
            it.toInt()
        }?.toList() ?: arrayListOf()
        println(removeElement(array.toIntArray(),target))
    }
}

fun removeElement(nums: IntArray, `val`: Int): Int {
    var k = 0
    for (i in nums.indices){
        if (nums[i] != `val`){
            nums[k] = nums[i]
            k++
        }
    }
    println(Arrays.toString(nums))
    return k
}