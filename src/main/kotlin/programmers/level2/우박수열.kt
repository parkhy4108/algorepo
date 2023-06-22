package programmers.level2//fun level3.main() {
//    val k = 5
//    val ranges = arrayOf(
//        intArrayOf(0, 0),
//        intArrayOf(0, -1),
//        intArrayOf(2, -3),
//        intArrayOf(3, -3)
//    )
//    level3.Solution().solution(k, ranges)
//}
//
//class level3.Solution {
//    fun solution(k: Int, ranges: Array<IntArray>): DoubleArray {
//        var kVar = k
//        val list = mutableListOf<IntArray>()
//        var i = 0
//        list.add(intArrayOf(i, k))
//        while (kVar != 1) {
//            kVar = calY(kVar)
//            i++
//            list.add(intArrayOf(i, kVar))
//        }
//        val area = DoubleArray(list.size - 1)
//        for (i in 0..list.size - 2) {
//            area[i] = (list[i][1] + list[i + 1][1]).toDouble() / 2
//        }
//        val areaSum = DoubleArray(list.size)
//        var sum: Double = 0.0
//        areaSum[0] = sum
//        for (i in area.indices) {
//            sum += area[i]
//            areaSum[i + 1] = sum
//        }
//        val answer = DoubleArray(ranges.size)
//        for (i in ranges.indices) {
//            val c = ranges[i]
//            val start = 0 + c[0]
//            val end = list.lastIndex + c[1]
//            answer[i] = if (end < start) -1.0 else if (end == start) 0.0 else areaSum[end] - areaSum[start]
//        }
//        return answer
//    }
//    fun calY(n: Int): Int = if (n.mod(2) == 0) n / 2 else n * 3 + 1
//}