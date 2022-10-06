package nam.tran

import java.util.*

// Add Binary

fun main(){
    while (true) {
        val scanner = Scanner(System.`in`)
        val text1 = scanner.next()
        val text2 = scanner.next()
        println(strStr2(text1,text2))
    }
}

fun strStr(haystack: String, needle: String): Int {
    return haystack.indexOf(needle)
}

fun strStr2(haystack: String, needle: String): Int {
    if (needle.isEmpty()){
        return 0
    }
    val sizeCompair = needle.length
    var resultIndex = -1
    var index = 0
    var indexValid = -1
    var indexCompair = 0
    val sizeLoop = haystack.length - sizeCompair + 1
    while (index < sizeLoop){
        if (indexValid != -1){
            if (haystack[indexValid] == needle[indexCompair]){
                indexValid += 1
                indexCompair += 1
                if (indexCompair == sizeCompair){
                    break
                }
            }else{
                index += 1
                resultIndex = -1
                indexValid = -1
                indexCompair = 0
            }
            continue
        }
        if (haystack[index] == needle[indexCompair]){
            resultIndex = index
            indexValid = index + 1
            indexCompair += 1
            if (indexCompair == sizeCompair){
                break
            }
        }else{
            index += 1
        }
    }
    return resultIndex
}