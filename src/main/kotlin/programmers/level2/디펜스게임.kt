package programmers.level2//fun level3.main() {
//    val n = 7
//    val k = 3
//    val enemy = intArrayOf(
////        5, 5, 5, 5, 2, 3, 1
//        4, 2, 4, 5, 3, 3, 1
////        2, 2, 2, 2, 3, 3, 1
////        2, 2, 2, 2, 2, 10
////        2, 2, 2, 2, 10
//    )
//    level3.Solution().solution(n, k, enemy)
//}
//
//class level3.Solution() {
//
//    fun solution(n: Int, k: Int, enemy: IntArray): Int {
//        var left = 0
//        var right = enemy.size
//        while (left < right) {
//            val mid = (left + right) / 2
//            if (isDefense(n, k, mid, enemy)) left = mid + 1
//            else right = mid
//        }
//
//        return left
//    }
//
//
//    private fun isDefense(n: Int, k: Int, mid: Int, enemy: IntArray): Boolean {
//        val arrSorted = enemy.sliceArray(0..mid).sortedDescending()
//        var sum: Double = 0.0
//        println(arrSorted.toList())
//        for (i in k..mid) {
//            sum += arrSorted[i].toDouble()
//        }
//        return sum <= n.toDouble()
//    }
//}
