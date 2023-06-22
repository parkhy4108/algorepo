package baekjoon.silver

fun main() {
    val switchCnt = readln().toInt()
    val sArr = readln().split(" ").map { it.toInt() }
    val switches = IntArray(switchCnt + 1) { 0 }
    sArr.forEachIndexed { index, i ->
        switches[index + 1] = i
    }
    val numOfStudent = readln().toInt()
    val list = mutableListOf<Pair<Int, Int>>()
    repeat(numOfStudent) {
        val s = readln().split(" ").map { it.toInt() }
        list.add(Pair(s[0], s[1]))
    }
    list.forEach {
        if (it.first == 1) maleSwitchOp(switches, it.second)
        else femaleSwitchOp(switches, it.second)
    }
    for(i in 1..switches.lastIndex) {
        print("${switches[i]} ")
        if(i%20 == 0) println()
    }
}

fun maleSwitchOp(arr: IntArray, n: Int) {
    var i = 1
    while (n * i <= arr.lastIndex) {
        arr[n * i] = if (arr[n * i] == 0) 1 else 0
        i++
    }
}

fun femaleSwitchOp(arr: IntArray, n: Int) {
    var i = 0
    while (n - i >= 1 && n + i <= arr.lastIndex) {
        if (arr[n - i] != arr[n + i]) break
        i++
    }
    for (k in n - i + 1 until n + i) arr[k] = if (arr[k] == 0) 1 else 0
}