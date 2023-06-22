package baekjoon.bronze

fun main(args: Array<String>) {
    val arr = readln().split(" ")
    val num1 = arr[0].toList().map{ it.digitToInt() }
    val num2 = arr[1].toList().map { it.digitToInt() }
    var result = 0L
    num1.forEach{ n1 ->
        num2. forEach { n2 ->
            result += (n1 * n2).toLong()
        }
    }
    println(result)
}