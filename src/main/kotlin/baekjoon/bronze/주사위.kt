package baekjoon.bronze

fun main(args: Array<String>) {
    val arr = readln().split(" ").map { it.toInt() }
    val dice1 = IntArray(arr[0]) { i -> i + 1 }
    val dice2 = IntArray(arr[1]) { i -> i + 1 }
    val dice3 = IntArray(arr[2]) { i -> i + 1 }
    val sumMap = HashMap<Int, Int>()
    dice1.forEach { d1 ->
        dice2.forEach { d2 ->
            dice3.forEach { d3 ->
                sumMap[d1 + d2 + d3] = sumMap.getOrDefault(d1 + d2 + d3, 0) + 1
            }
        }
    }
    println(
        sumMap.entries
            .sortedWith(compareBy({ -it.value }, { it.key }))
            .first()
            .key
    )
}