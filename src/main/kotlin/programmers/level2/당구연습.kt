//package level2
//import kotlin.math.min
////
//fun main() {
//    val m = 10
//    val n = 10
//    val startX = 3
//    val startY = 7
//    val balls = arrayOf(
//        intArrayOf(7, 7),
//        intArrayOf(2, 7),
//        intArrayOf(7, 3)
//    )
//    Solution().solution(m, n, startX, startY, balls)
//}
//
//class Solution {
//    fun solution(m: Int, n: Int, startX: Int, startY: Int, balls: Array<IntArray>): IntArray {
//        val answer: IntArray = IntArray(balls.size)
//        val x1 = startX
//        val y1 = startY
//        balls.forEachIndexed { index, (x2, y2) ->
//            if (x1 == x2) {
//                val d1 = (y2 - y1) * (y2 - y1) + 4 * x1 * x1
//                val d2 = (y2 - y1) * (y2 - y1) + 4 * (m - x1) * (m - x1)
//                val d3 = if (y1 < y2) (y1 + y2) * (y1 + y2) else (2 * n - y1 - y2) * (2 * n - y1 - y2)
//                answer[index] = min(min(d1, d2), d3)
//            } else if (y1 == y2) {
//                val d1 = (x2 - x1) * (x2 - x1) + 4 * y1 * y1
//                val d2 = (x2 - x1) * (x2 - x1) + 4 * (n - y1) * (n - y1)
//                val d3 = if (x1 < x2) (x1 + x2) * (x1 + x2) else (2 * m - x1 - x2) * (2 * m - x1 - x2)
//                answer[index] = min(min(d1, d2), d3)
//            } else {
//                //바닥 기준 뒤집기
//                val d1 = (x2 - x1) * (x2 - x1) + (y2 + y1) * (y2 + y1)
//                // 왼쪽 기준 뒤집기
//                val d2 = (x2 + x1) * (x2 + x1) + (y2 - y1) * (y2 - y1)
//                // 오른쪽 기준 뒤집기
//                val d3 = (y2 - y1) * (y2 - y1) + (2 * m - x1 - x2) * (2 * m - x1 - x2)
//                // 위 기준 뒤집기
//                val d4 = (x2 - x1) * (x2 - x1) + (2 * n - y1 - y2) * (2 * n - y1 - y2)
//                answer[index] = min(min(d1, d2), min(d3, d4))
//            }
//        }
//        return answer
//    }
//}