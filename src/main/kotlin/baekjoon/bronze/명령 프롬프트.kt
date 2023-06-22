package baekjoon.bronze

fun main3(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var result = ""
    val bw = System.`out`.bufferedWriter()
    val n = readln().toInt()
    val strList = mutableListOf<String>()
    repeat(n) {
        val str = readln()
        strList.add(str)
    }

    for(i in strList.first().indices) {
        var isSame = true
        val c = strList.first()[i]
        for(j in strList.indices) {
            if(c != strList[j][i]) {
                isSame = false
                result += '?'
                break
            }
        }
        if(isSame) result += c
    }
    bw.write(result)
    bw.flush()
    bw.close()
}