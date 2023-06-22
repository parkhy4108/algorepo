package baekjoon.silver

fun main(args: Array<String>) {
    val check = BooleanArray(readln().toInt()) { false }
    val line = readln().split(" ").map { it.toInt() }
    val result = IntArray(check.size)
    line.forEachIndexed { i, n ->
        var cnt = n
        for(j in check.indices) {
            if(!check[j] && cnt-- == 0) {
                result[j] = i+1
                check[j] = true
            }
        }
    }
    result.forEach{
        print("$it ")
    }
}