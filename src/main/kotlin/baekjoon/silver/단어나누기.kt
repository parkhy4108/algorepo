package baekjoon.silver

fun main() {
    val str = readln()
    val hashSet = HashSet<String>()
    for (i in 0..str.lastIndex - 2) {
        for (j in i + 1..str.lastIndex - 1) {
            val first = str.slice(0..i).reversed()
            val second = str.slice(i + 1..j).reversed()
            val third = str.slice(j+1..str.lastIndex).reversed()
            hashSet.add(first+second+third)
        }
    }
    println(hashSet.sortedBy { it }.first())
}