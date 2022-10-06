package nam.tran

import java.util.*

// Middle of the Linked List

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

var head: ListNode? = null


fun main(){
    while (true){
        readLine()!!.split(" ").reversed().forEach {
            pushNode(it.toInt())
        }
        println(head)
        println(middleNode(head).toString())
    }
}

/*Function to add a new Node*/
fun pushNode(data: Int) {
    val new_node = ListNode(data)
    new_node.next = head
    head = new_node
}

fun middleNode(head: ListNode?): ListNode? {
    var middle = head
    var end = head
    while(end?.next != null){
        middle = middle?.next
        end = end.next?.next
    }
    return middle
}

class ListNode(var value: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        return "ListNode(value=$value, next=$next)"
    }
}