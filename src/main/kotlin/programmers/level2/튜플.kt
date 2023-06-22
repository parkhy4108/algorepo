package programmers.level2//fun level3.main() {
//    level3.Solution().solution(s = "{{4,2,3},{3},{2,3,4,1},{2,3}}")
//}
//
//class level3.Solution {
//    fun solution(s: String): IntArray {
//        println(
//            s.replace("[{}]".toRegex(), "")
//                .split(",")
//                .groupingBy { it }
//                .eachCount()
//                .entries.sortedByDescending { it.value }
//                .map { it.key.toInt() }.toIntArray()
//        )
//
//        return intArrayOf(0)
//    }
//}
//
////class level3.Solution {
////    fun solution(s: String): IntArray = s.replace("[{}]".toRegex(), "")
////        .split(",")
////        .groupingBy { it }
////        .eachCount()
////        .entries.sortedByDescending { it.value }
////        .map { it.key.toInt() }.toIntArray()
////}