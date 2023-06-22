package baekjoon.bronze

fun main(args: Array<String>) {
    val list = mutableListOf<String>()
    while(true) {
        val str = readln()
        if(str != "0") list.add(str)
        else break
    }
    list.forEach { s ->
        var i = 0
        var j = s.length-1
        var flag = false

        while(i <= j) {
            if(s[i++] != s[j--]) {
                flag = true
                break
            }
        }
        if(flag) println("no")
        else println("yes")
    }
}