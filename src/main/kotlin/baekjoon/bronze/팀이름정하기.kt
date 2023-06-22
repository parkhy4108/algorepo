package baekjoon.bronze

fun main(args: Array<String>) {
    val arr = IntArray(4) { 0 }
    readln().forEach { c ->
        when (c) {
            'L' -> arr[0] += 1
            'O' -> arr[1] += 1
            'V' -> arr[2] += 1
            'E' -> arr[3] += 1
        }
    }
    val nameArr = Array(readln().toInt()) { readln() }
    val resultList = mutableListOf<Pair<String, Int>>()
    nameArr.forEach { name ->
        var L = arr[0]
        var O = arr[1]
        var V = arr[2]
        var E = arr[3]
        name.forEach { c ->
            when (c) {
                'L' -> L += 1
                'O' -> O += 1
                'V' -> V += 1
                'E' -> E += 1
            }
        }
        val per = ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)).mod(100)
        resultList.add(Pair(name, per))
    }
    println(resultList.sortedWith(compareBy({ -it.second }, { it.first })).first().first)
}