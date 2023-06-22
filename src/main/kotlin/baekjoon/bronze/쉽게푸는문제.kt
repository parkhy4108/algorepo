package baekjoon.bronze

fun main(args: Array<String>) {
    val range = readln().split(" ").map { it.toInt() }
    var n = 1
    val arr = IntArray(1000)
    var i = 0

    while (i < 1000) {
        for(j in 1..n) {
            arr[i++] = n
            if(i == 1000) break
        }
        n++
    }
    println(arr.slice(range[0]-1 until range[1]).sum())
}