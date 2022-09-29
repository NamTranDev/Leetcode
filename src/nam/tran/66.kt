package nam.tran

import java.util.*

// Plus One

fun main() {
    val array = readLine()?.split(" ")?.map {
        it.toInt()
    }?.toIntArray() ?: intArrayOf()
    println(Arrays.toString(array))
    print(Arrays.toString(plusOne(array)))
}

fun plusOne(digits: IntArray): IntArray {
    for (i in digits.size - 1 downTo 0){
        digits[i] += 1
        if (digits[i] <= 9) return digits
        digits[i] = 0
    }
    val result = IntArray(digits.size + 1)
    result[0] = 1
    return result
}