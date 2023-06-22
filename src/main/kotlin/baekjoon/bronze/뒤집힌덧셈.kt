package baekjoon.bronze

fun main(args: Array<String>) {
    val arr = readln().split(" ")
    val x = arr[0].toList()
    val y = arr[1].toList()
    val sum = x.reversed().joinToString("").toInt() + y.reversed().joinToString("").toInt()
    println(sum.toString().toList().reversed().joinToString("").toInt())
}