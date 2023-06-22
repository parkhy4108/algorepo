package programmers.level2//class level3.Solution {
//    fun solution(wallpaper: Array<String>): IntArray {
//        var answer: IntArray = intArrayOf()
//        val map = mutableListOf<Pair<Int, Int>>()
//        wallpaper.forEachIndexed { index, s ->
//            s.forEachIndexed { i, c ->
//                if (c == '#') {
//                    map.add(index to i)
//                }
//            }
//        }
//        val ySortedMap = map.sortedBy { it.first }
//        val xSortedMap = map.sortedBy { it.second }
//
//        answer = intArrayOf(
//            ySortedMap.first().first,
//            xSortedMap.first().second,
//            ySortedMap.last().first + 1,
//            xSortedMap.last().second + 1
//        )
//        return answer
//    }
//}