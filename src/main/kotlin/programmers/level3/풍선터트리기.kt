//package level3
//
//fun main() {
//    val grid = arrayOf("R", "R")
//    Solution().solution(
//        a = intArrayOf(
////        -16,27,65,-2,58,-92,-71,-68,-61,-33
////        9,-1,-5
//            9, 10, 3
//        )
//    )
//}
//
//class Solution {
//    fun solution(a: IntArray): Int {
//        var answer = 0
//        if (a.size == 1) return 1
//        if (a.size == 2) return 2
//        val leftArr = IntArray(a.size)
//        val rightArr = IntArray(a.size)
//        var leftMin = a.first()
//        var rightMin = a.last()
//        for (i in a.indices) {
//            if (leftMin > a[i]) leftMin = a[i]
//            leftArr[i] = leftMin
//        }
//        for (i in a.size - 1 downTo 0) {
//            if (rightMin > a[i]) rightMin = a[i]
//            rightArr[i] = rightMin
//        }
//        println(leftArr.toList())
//        println(rightArr.toList())
//        for (i in a.indices) {
//            if (leftArr[i] >= a[i] || rightArr[i] >= a[i]) {
//                println(a[i])
//                answer++
//            }
//        }
//        return answer
//    }
//}