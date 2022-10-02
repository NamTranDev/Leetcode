package nam.tran

import java.util.*

// Spiral Matrix

fun main(){
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var arrayint = Array(n) { readLine()!!.split(" ").map { it.toInt() }.toIntArray() }
    print(Arrays.toString(spiralOrder(arrayint).toIntArray()))
}

//left to right => row += 0 , column += 1
//up to down => row += 1, column += 0
//right to left => row += 0, column += -1
//down to up => row += -1, column += 0
private val DIR = listOf(0 to 1, 1 to 0, 0 to -1, -1 to 0)

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    val m = matrix.size
    val n = matrix[0].size
    val res = mutableListOf<Int>()
    var d = 0
    var x = 0
    var y = 0
    val visited = Array(m) { BooleanArray(n) }

    while (true) {
        res += matrix[x][y]
        visited[x][y] = true
        if (res.size == m * n) {
            return res
        }
        val x2 = x + DIR[d].first
        val y2 = y + DIR[d].second

        if (x2 < 0 || x2 == m || y2 < 0 || y2 == n || visited[x2][y2]) {
            d = (d + 1) % DIR.size
            x += DIR[d].first
            y += DIR[d].second
        } else {
            x = x2
            y = y2
        }
    }
}