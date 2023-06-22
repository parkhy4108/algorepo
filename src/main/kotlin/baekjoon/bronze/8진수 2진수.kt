package baekjoon.bronze

fun main(args: Array<String>) {
    val str = readln()
    val parser = arrayOf("001", "010", "011", "100", "101", "110", "111")
    if(str == "0") {
        println("0")
        return
    }

    val sb = StringBuilder()
    str.forEach {
        sb.append(parser[it.digitToInt()])
    }
    println(sb.trimStart{ it == '0'})
}