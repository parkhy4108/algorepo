package baekjoon.bronze

fun main() {
    val hashMap = HashMap<Char, Int>()
    while (true) {
        val str = readlnOrNull() ?: break
        str.split(" ").map { it.toList() }.flatten().forEach {
            hashMap[it] = (hashMap[it]?:0).plus(1)
        }
    }
    println(hashMap.filter { it.value == hashMap.maxOf { it.value } }.keys.sortedBy { it }.joinToString(""))
}