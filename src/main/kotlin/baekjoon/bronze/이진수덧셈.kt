package baekjoon.bronze

fun main(args: Array<String>) {
    val str = readln().split(" ")
    val size = if (str[0].length >= str[1].length) str[0].length else str[1].length
    val b1 = IntArray(size+1) { 0 }
    val b2 = IntArray(size+1) { 0 }
    val arr = IntArray(size+1) { 0 }
    val result = IntArray(size+1)
    str[0].reversed().forEachIndexed { index, c ->
        b1[index] = c.digitToInt()
    }
    str[1].reversed().forEachIndexed { index, c ->
        b2[index] = c.digitToInt()
    }
    println(b1.toList())
    println(b2.toList())
    for (i in b1.indices) {
        val sum = b1[i] + b2[i] + arr[i]
        if (sum >= 2) arr[i + 1] = 1
        result[i] = if (sum>=2) sum-2 else if(sum == 0) 0 else 1
    }
    val x = result.reversed().joinToString("")
    println(
        if(x.all { it=='0' }) "0"
        else x.trimStart { it == '0' }
    )
}