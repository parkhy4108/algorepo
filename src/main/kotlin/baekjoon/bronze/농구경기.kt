package baekjoon.bronze

fun main(args: Array<String>) {
    val arr = Array<String>(readln().toInt()) { "" }
    for (i in arr.indices) {
        arr[i] = readln()
    }
    arr.groupingBy { it[0] }
        .eachCount()
        .toList()
        .filter { it.second >= 5 }
        .let {
            if (it.isEmpty()) println("PREDAJA")
            else println(
                it.sortedBy { it.first }
                    .map { it.first }
                    .joinToString("")
            )
        }

}