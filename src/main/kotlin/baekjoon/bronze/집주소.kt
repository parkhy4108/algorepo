package baekjoon.bronze

fun main(args: Array<String>) {
    val list = mutableListOf<String>()

    while (true) {
        val num = readln()
        if (num == "0") break
        else list.add(num)
    }

    list.forEach { str ->
        var result = 2
        str.forEach {
            result += when (it.digitToInt()) {
                0 -> 4
                1 -> 2
                else -> 3
            }
        }
        result += str.length - 1
        println(result)
    }
}