package nam.tran

import java.util.*

// Add Binary

fun main(){
    val scanner = Scanner(System.`in`)
    print(addBinary(scanner.next(),scanner.next()))
}

fun addBinary(a: String, b: String): String {
    return (a.toBigInteger(2) + b.toBigInteger(2)).toString(2)
}