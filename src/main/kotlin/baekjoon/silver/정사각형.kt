package baekjoon.silver

fun main(args: Array<String>) {
    var result = 1
    val (n, m) = readln().split(" ").map { it.toInt() }
    val x = if (n <= m) n else m
    val arr = Array(n) { IntArray(m) }
    for (i in 0 until n) {
        arr[i] = readln().map { it.digitToInt() }.toIntArray()
    }

    if (x >= 2) {
        for (k in x downTo 2) {
            for (i in 0..n - k) {
                for (j in 0..m - k) {
                    if (arr[i][j] == arr[i][j + k - 1] && arr[i][j] == arr[i + k - 1][j] && arr[i][j] == arr[i + k - 1][j + k - 1]) {
                        if(result <= k) result = k
                    }
                }
            }
        }
    }
    println(result*result)
}