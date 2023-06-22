package programmers.level2//import kotlin.math.max
//import kotlin.math.min
//
//fun level3.main() {
//    level3.Solution().solution(line = arrayOf(
//        intArrayOf(2, -1, 4),
//        intArrayOf(-2, -1, 4),
//        intArrayOf(0, -1, 1),
//        intArrayOf(5, -8, -12),
//        intArrayOf(5, 8, 12)
//    ))
//}
//
//class level3.Solution {
//    fun solution(line: Array<IntArray>): List<String> {
//        val list = mutableListOf<IntArray>()
//        var maxH = Int.MIN_VALUE
//        var minH = Int.MAX_VALUE
//        var maxW = Int.MIN_VALUE
//        var minW = Int.MAX_VALUE
//        line.forEachIndexed { index, (a, b, e) ->
//            for (i in index + 1 until line.size) {
//                val c = line[i][0]
//                val d = line[i][1]
//                val f = line[i][2]
//                val deno = a.toLong() * d.toLong() - b.toLong() * c.toLong()
//                if (deno == 0L) continue
//                val numer1 = b.toLong() * f.toLong() - e.toLong() * d.toLong()
//                val numer2 = e.toLong() * c.toLong() - a.toLong() * f.toLong()
//                if (numer1%deno != 0L || numer2%deno != 0L) continue
//                val x = intArrayOf((numer1 / deno).toInt(), (numer2 / deno).toInt())
//                list.add(x)
//                maxH = max(maxH, x[1])
//                minH = min(minH, x[1])
//                maxW = max(maxW, x[0])
//                minW = min(minW, x[0])
//            }
//        }
//        val starArr = Array(maxH - minH + 1) { CharArray(maxW - minW + 1) { '.' } }
//        list.forEach { (x, y) ->
//            starArr[maxH - y][x - minW] = '*'
//        }
//        return starArr.map { it.joinToString("") }
//    }
//}