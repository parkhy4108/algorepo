package baekjoon.bronze

fun main(args: Array<String>) {
    val size = readln().split(" ").map { it.toInt() }
    val row = BooleanArray(size[0]) { false }
    val col = BooleanArray(size[1]) { false }
    val arr = Array<String>(size[0]) { "" }
    repeat(arr.size) {
        arr[it] = readln()
    }
    for (i in arr.indices) {
        for (j in arr[0].indices) {
            if (arr[i][j] == 'X') {
                if (!row[i]) row[i] = true
                if (!col[j]) col[j] = true
            }
        }
    }
    println(
        if (col.count { !it } > row.count { !it }) col.count { !it }
        else row.count{ !it }
    )
}