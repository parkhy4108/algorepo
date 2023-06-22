package baekjoon.bronze

import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.pow

fun main1(args: Array<String>) = with(System.`in`.bufferedReader()) {
//    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val bw = System.`out`.bufferedWriter()

    val n = readln().toInt()
    val arr = ArrayList<Pair<Int,Int>>()
    repeat(n) {
        val (x,y) = readln().split(" ").map { it.toInt() }
        arr.add(Pair(x,y))
    }
    for(i in arr.indices) {
        val a = arr[i].first.toDouble()
        val b = arr[i].second
        val num = if(b%4 == 0) a.pow(4) else a.pow(b%4)
        val result = if(num%10 == 0.0) "10" else (num%10).toInt().toString()
        bw.write(result + "\n")
    }
    bw.flush()
    bw.close()
}


