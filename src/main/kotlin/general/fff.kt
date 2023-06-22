//package general
//
//import java.util.Queue
//
//
//fun main() {
//    val str = "61-3+4"
//
//    println(
//        str.split("")
//    )
////    Solution().solution(n = 4, a = intArrayOf(3, 2, 4, 2), b = intArrayOf(3, 1, 7, 5))
//}
//
//class Solution {
//    fun solution(n: Int, a: IntArray, b: IntArray): Int {
//        var answer = 0
//        val indexList = mutableListOf<Pair<Int, Int>>()
//        for (i in a.indices) {
//            indexList.add(Pair(i, a[i] * b[i]))
//        }
//        val sortedList = indexList.sortedBy { it.second }
//
//
//
//        return answer
//    }
//
//    fun dfs(
//        visited: BooleanArray,
//        red: MutableList<Int>,
//        blue: MutableList<Int>,
//        str: String,
//        queue: MutableList<Int>
//    ): Int {
//        for (i in str.indices) {
//            if (!visited[i]) {
//                visited[i] = true
//                for (j in 0..1) {
//
//                    if (j == 0) {
//
//                    } else {
//
//                    }
//
//
//                }
//            }
//        }
//        return 0
//    }
//}