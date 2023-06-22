package baekjoon.silver

fun main(args: Array<String>) {
    val list = mutableListOf<Int>()
    val input = readln().split(" ").map { it.toInt() }
    var cnt = input[0]
    var i = -1
    val arr = BooleanArray(cnt) { false }
    while (cnt > 0) {
        var c = 0
        while (c < input[1]) {
            if (i+1 > arr.lastIndex) i = -1
            if (!arr[i+1]) c++
            i++
        }
        arr[i] = true
        list.add(i+1)
        cnt--
    }
    print("<")
    list.forEachIndexed { index, n ->
        if(index != list.lastIndex) print("$n, ")
        else print("$n")

    }
    println(">")
}