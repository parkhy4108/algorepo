package baekjoon.bronze

fun main(args: Array<String>) {
    val str = readln()
        .map { it.uppercase() }
        .groupingBy { it }
        .eachCount().entries
        .sortedByDescending { it.value }
        .groupBy { it.value }.entries.first()

    println(if(str.value.size >= 2) "?" else str.value.first().key)
}