package baekjoon.bronze

fun main(args: Array<String>) {
    var num = ""
    var result = 0L
    for(i in 1..3) {
        val l = readln()
        if(i != 3) {
            num += when(l) {
                "black" -> { "0" }
                "brown" -> { "1" }
                "red" -> { "2" }
                "orange" -> { "3" }
                "yellow" -> { "4" }
                "green" -> { "5" }
                "blue" -> { "6" }
                "violet" -> { "7" }
                "grey" -> { "8" }
                else -> { "9" }
            }
        } else {
            val x = when(l) {
                "black" -> { 1 }
                "brown" -> { 10 }
                "red" -> { 100 }
                "orange" -> { 1000 }
                "yellow" -> { 10000 }
                "green" -> { 100000 }
                "blue" -> { 1000000 }
                "violet" -> { 10000000 }
                "grey" -> { 100000000 }
                else -> { 1000000000 }
            }
            result = num.toLong()*x
        }
    }
    println(result)
}