package nam.tran

import java.util.*

// Number of Steps to Reduce a Number to Zero

fun main(){
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    print(numberOfSteps(n).toString())
}

fun numberOfSteps(num: Int): Int {

    var step = 0
    if(num == 0)
        return step
    var num1 = num
    while (true){
        if (num1 % 2 == 0){
            num1 /= 2
            step++
        }else{
            num1 -= 1
            step++
        }
        if (num1 == 0){
            break
        }
    }
    return step
}

//10 1010
// 5  101
// 4  100
// 2   10
// 1    1
// 0    0
fun numberOfSteps2(num: Int): Int = Integer.bitCount(num) + 31 - Integer.numberOfLeadingZeros(num)