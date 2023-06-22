package baekjoon.bronze

import java.util.Scanner

fun main(args: Array<String>) {
    val str = readln()
    if(str == " ") println(0)
    else println(str.trim().split(" ").count())
}