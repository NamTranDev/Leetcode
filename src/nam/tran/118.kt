package nam.tran

import java.util.*

// Pascal's Triangle

fun main(){
    while (true){
        val scanner = Scanner(System.`in`)
        val n = scanner.nextInt()
        println(generate(n))
    }
}

fun generate(numRows: Int): List<List<Int>> {
    val res = mutableListOf<List<Int>>()
    var pre = mutableListOf(1)
    for (i in 0 until numRows){
        val row = mutableListOf<Int>()
        for (j in 0..i){
            if (j == 0 || j == i){
                row.add(1)
            }else{
                row.add(pre[j-1]+pre[j])
            }
        }
        pre = row
        res.add(row)
    }
    return res
}