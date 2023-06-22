package programmers.level3//class level3.Solution {
//    fun solution(n: Int, times: IntArray): Long {
//        return binarySearch(n, times.sorted())
//    }
//
//    private fun binarySearch(n: Int, times: List<Int>): Long {
//        var left = 0L
//        var right = times.last().toLong() * n.toLong()
//        while (left < right) {
//            val mid = (left + right) / 2
//            var cnt = 0L
//            times.forEach { time -> cnt += mid / time }
//            println("left : $left, mid: $mid, right: $right, ")
//            if (cnt < n) left = mid+1
//            else right = mid
//        }
//        return right
//    }
//}