package baekjoon.bronze

fun main(args: Array<String>) {
    val strList = mutableListOf<String>()
    while (true) {
        val s = readln()
        if (s == "#") break
        else strList.add(s)
    }
    strList.forEach { str ->
        println(
            str.replace(" ", "")
                .count { it == 'a' || it == 'A' ||
                        it == 'e' || it == 'E' ||
                        it == 'i' || it == 'I' ||
                        it == 'o' ||  it == 'O' ||
                        it == 'u' ||  it == 'U'
                }
        )
    }
}