package baekjoon.bronze

fun main(args: Array<String>) {
    val arr = readln().toList().map{ it.digitToInt() }
    var flag = false
    for(i in 0 until arr.lastIndex) {
        val left = arr.slice(0..i).fold(1){ total, num -> total*num }
        val right = arr.slice(i+1..arr.lastIndex).fold(1){ total, num -> total*num }
        if(left == right) {
            flag = true
            break
        }
    }
    if(flag) println("YES") else println("NO")
}