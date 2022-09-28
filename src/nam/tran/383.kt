package nam.tran

import java.util.*

// Ransom Note

fun main(){
    val scanner = Scanner(System.`in`)
    val ransomNote = scanner.next()
    val magazine = scanner.next()
    print(canConstruct(ransomNote,magazine).toString())
}

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val map = mutableMapOf<Char,Int?>()
    magazine.forEach {
        if (map.containsKey(it)){
            val count = map[it]
            map[it] = count?.plus(1)
        }else{
            map[it] = 1
        }
    }
    println(map)
    for (c in ransomNote) {
        val v = map[c] ?: 0
        if (v == 0) return false
        map[c] = v - 1
    }
    return true
}