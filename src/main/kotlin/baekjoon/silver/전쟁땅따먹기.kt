package baekjoon.silver

fun main() {
    val size = readln().toInt()
    val arr = Array<LongArray>(size) { longArrayOf() }
    repeat(size) {
        val str = readln().split(" ").map { it.toLong() }
        val arrSize = str[0].toInt()
        val longArr = LongArray(arrSize)
        for (i in 1..str.lastIndex) {
            longArr[i - 1] = str[i]
        }
        arr[it] = longArr
    }
    arr.forEach { soldiersArr ->
        val half = soldiersArr.size.toLong() / 2L
        val hashM = HashMap<Long, Long>()
        for (i in soldiersArr.indices) {
            hashM[soldiersArr[i]] = hashM.getOrDefault(soldiersArr[i], 0L) + 1L
        }
        val can = mutableListOf<Long>()
        hashM.forEach { (key, value) ->
            if(value > half) can.add(key)
        }
        if(can.isEmpty()) println("SYJKGW")
        else println(can.first())
    }
}