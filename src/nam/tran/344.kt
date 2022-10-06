package nam.tran

import java.util.*

// Reverse String

fun main(){
    while (true){
        val scanner = Scanner(System.`in`)
        println(reverseString(scanner.next().toCharArray()))
    }
}

fun reverseString(s: CharArray): CharArray {
    if (s.size == 1)
        return s
    var left = 0
    var right = s.size - 1
    while (true){
        val temp = s[left]
        s[left] = s[right]
        s[right] = temp
        left += 1
        right -= 1
        if (left > right)
            break
    }
    return s
}