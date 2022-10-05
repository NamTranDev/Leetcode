package nam.tran

import java.lang.StringBuilder
import java.util.*

// Longest Common Prefix
fun main() {
    val array = readLine()?.split(" ")?.map {
        it
    }?.toList() ?: arrayListOf()
    print(longestCommonPrefix(array.toTypedArray()))
}

fun longestCommonPrefix(strs: Array<String?>): String {
    val min = strs.minBy {
        it?.length ?: 0
    }?.length ?: 0
    val result = StringBuilder()

    for (i in 0 until min){
        var char : String? = null
        var notValid = false
        for (str in strs){
            val charCurrent = str?.toCharArray()?.get(i).toString()
            if (char == null){
                char = charCurrent
            }else{
                if (char == charCurrent){
                    continue
                }else{
                    notValid = true
                    break
                }
            }
        }
        if (notValid)
            break
        else
            result.append(char)
    }

    return result.toString()
}