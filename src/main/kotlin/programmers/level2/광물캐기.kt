//package level2
//
//fun main() {
//    Solution().solution(
//        picks = intArrayOf(3, 4, 4), minerals = arrayOf(
//            "diamond", "diamond", "diamond", "iron", "iron",
//            "diamond", "iron", "iron", "stone", "stone",
//            "iron", "iron", "iron", "iron", "stone",
//            "diamond", "iron", "iron", "iron", "iron",
//            "iron", "iron", "iron", "iron", "iron",
//            "diamond", "diamond", "diamond", "stone", "stone",
//            "iron", "stone", "stone", "stone", "stone",
//            "stone", "stone", "stone", "stone", "stone"
//        )
//    )
//}
//
//class Solution {
//    fun solution(picks: IntArray, minerals: Array<String>): Int {
//        var answer: Int = 0
//        val x = if (minerals.size > picks.sum() * 5) minerals.slice(0 until picks.sum() * 5).toList()
//            .chunked(5) else minerals.toList().chunked(5)
//        val arr = Array<IntArray>(x.size) { IntArray(3) }
//        x.forEachIndexed { index, strings ->
//            var d = 0
//            var i = 0
//            var s = 0
//            strings.forEach { v ->
//                when (v) {
//                    "diamond" -> d++
//                    "iron" -> i++
//                    else -> s++
//                }
//            }
//            arr[index][0] = d
//            arr[index][1] = i
//            arr[index][2] = s
//        }
//        val s = arr.toList().sortedWith(compareBy({ -it[0] }, { -it[1] }, { -it[2] }))
//        s.forEach {
//            if (picks[0] != 0) {
//                answer += it[0] + it[1] + it[2]
//                picks[0] -= 1
//            } else if (picks[1] != 0) {
//                answer += it[0] * 5 + it[1] + it[2]
//                picks[1] -= 1
//            } else {
//                answer += it[0] * 25 + it[1] * 5 + it[2]
//                picks[2] -= 1
//            }
//        }
//        return answer
//    }
//}