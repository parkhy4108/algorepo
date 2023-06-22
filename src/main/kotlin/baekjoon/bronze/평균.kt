package baekjoon.bronze

fun main(args:Array<String>) {
    readln()
    val bool = BooleanArray(101){ false }
    val arr = readlnOrNull()?.split(" ")?.map{ it.toInt() }
    var result = 0
    println(arr)
    arr?.forEach {
        if(bool[it]) result++
        else bool[it] = true
    }
    println(result)
}

