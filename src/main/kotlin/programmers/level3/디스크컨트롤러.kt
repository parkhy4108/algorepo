//package level3
//
//import java.util.PriorityQueue
//
//fun main() {
//    Solution().solution(
//        jobs = arrayOf(
//            intArrayOf(0,3),
//            intArrayOf(1,9),
//            intArrayOf(2,6),
//        )
//    )
//}
//
//class Solution {
//    fun solution(jobs: Array<IntArray>): Int {
//        var answer = 0
//        val arr = Array<IntArray?>(jobs.last()[0]){ null }
//        var index = 0
//        var end = 0
//        val sortedJobs = jobs.sortedBy { it[0] }
////        val waitingList = PriorityQueue<IntArray>{ it}
//        sortedJobs.forEach {arr[it[0]] = it }
//        for(i in arr.indices) {
////            if(arr[i] != null) {
////                waitingList.add(arr[i]!!)
////            }
//
//        }
//        return answer
//    }
//
//}