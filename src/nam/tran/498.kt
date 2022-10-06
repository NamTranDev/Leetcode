package nam.tran

import java.util.*


// Diagonal Traverse

fun main(){
    while (true){
        val scanner = Scanner(System.`in`)
        val n = scanner.nextInt()
        var arrayint = Array(n) { readLine()!!.split(" ").map { it.toInt() }.toIntArray() }
        println(Arrays.toString(findDiagonalOrder(arrayint)))
    }
}

fun findDiagonalOrder(matrix: Array<IntArray>?): IntArray {

    // Check for empty matrices
    if (matrix == null || matrix.isEmpty()) {
        return IntArray(0)
    }

    // Variables to track the size of the matrix
    val N: Int = matrix.size
    val M: Int = matrix.get(0).size

    // The two arrays as explained in the algorithm
    val result = IntArray(N * M)
    var k = 0
    val intermediate = ArrayList<Int>()

    // We have to go over all the elements in the first
    // row and the last column to cover all possible diagonals
    for (d in 0 until N + M - 1) {

        println(d)

        // Clear the intermediate array every time we start
        // to process another diagonal
        intermediate.clear()

        // We need to figure out the "head" of this diagonal
        // The elements in the first row and the last column
        // are the respective heads.
        var r = if (d < M) 0 else d - M + 1
        var c = if (d < M) d else M - 1

        println(r)
        println(c)

        // Iterate until one of the indices goes out of scope
        // Take note of the index math to go down the diagonal
        while (r < N && c > -1) {
            intermediate.add(matrix.get(r).get(c))
            ++r
            --c
        }

        // Reverse even numbered diagonals. The
        // article says we have to reverse odd
        // numbered articles but here, the numbering
        // is starting from 0 :P
        if (d % 2 == 0) {
            intermediate.reverse()
        }
        for (i in intermediate.indices) {
            result[k++] = intermediate[i]
        }
    }
    return result
}