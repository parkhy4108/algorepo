package baekjoon.bronze

fun main(args: Array<String>) {
    val list = readln().split(" ").map{ it.toInt() }
    val N = list[0]
    val m = list[1]
    val M = list[2]
    val T = list[3]
    val R = list[4]
    if(M-m < T) {
        println(-1)
        return
    }
    var mac = m
    var t = 0
    var result = 0
    while(true) {
        t++
        if(mac+T <= M) {
            result++
            mac += T
            if(result == N) break
        } else {
            if(mac-R < m) mac = m
            else mac -= R
        }
    }
    println(t)
}