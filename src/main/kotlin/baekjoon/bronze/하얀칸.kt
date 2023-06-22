package baekjoon.bronze

fun main(args: Array<String>) {
    val arr = Array<String>(9) { "" }
    repeat(8) {
        arr[it+1] = readln()
    }
    var result = 0
    for(i in 1..8) {
        if(i%2 != 0) {
            for(j in 0..7 step 2) {
                if(arr[i][j] == 'F') result++
            }
        } else {
            for(j in 1..7 step 2) {
                if(arr[i][j] == 'F') result++
            }
        }
    }
    println(result)
}