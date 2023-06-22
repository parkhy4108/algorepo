package baekjoon.bronze

fun main(args: Array<String>) {
    var cnt = 1
    while (true) {
        val str = readln()
        if (str == "0 0") break
        var (o, w) = str.split(" ").map { it.toInt() }
        var death = false
        while (true) {
            val (op, n) = readln().split(" ")
            if (op == "E") w -= n.toInt()
            if (op == "F") w += n.toInt()
            if (w <= 0) death = true
            if (op == "#") break
        }
        if (death) println("${cnt++} RIP")
        else {
            if (w in (o / 2)+1 until (o * 2)) println("${cnt++} :-)")
            else println("${cnt++} :-(")
        }
    }
}