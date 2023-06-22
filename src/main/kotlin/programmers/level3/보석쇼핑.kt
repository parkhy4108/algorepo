package programmers.level3//class Gems {
//    fun solution(gems: Array<String>): IntArray {
//        var answer = intArrayOf()
//        val gemG = gems.groupBy { it }.keys
//        val t = HashMap<String, Int>()
//        var l = Int.MAX_VALUE
//        var s = 0
//        var e = 0
//        while (true) {
//            if (t.size == gemG.size) {
//                t[gems[s]] = t[gems[s]]!! - 1
//                if (t[gems[s]] == 0) t.remove(gems[s])
//                s++
//            }
//            else if (e == gems.size) break
//            else if (t.size < gemG.size) {
//                t[gems[e]] = t.getOrDefault(gems[e], 0) + 1
//                e++
//            }
//            if (t.size == gemG.size && e - s < l) {
//                l = e - s
//                answer = intArrayOf(s + 1, e)
//            }
//        }
//        return answer
//    }
//}
