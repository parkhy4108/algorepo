package programmers.level2//import kotlin.math.max
//
//fun level3.main() {
//    val dungeons = arrayOf(
//        intArrayOf(80, 20),
//        intArrayOf(50, 40),
//        intArrayOf(30, 10)
//    )
//    level3.Solution().solution(80, dungeons)
//}
//
//class level3.Solution {
//    fun solution(k: Int, dungeons: Array<IntArray>): Int = dungeonCnt(dungeons, BooleanArray(dungeons.size) { false }, k, 0, 0)
//
//    fun dungeonCnt(
//        dungeons: Array<IntArray>,
//        visited: BooleanArray,
//        tired: Int,
//        maxCnt: Int,
//        cnt: Int
//    ): Int {
//        var m = maxCnt
//        for (i in dungeons.indices) {
//            if (!visited[i] && tired >= dungeons[i][0]) {
//                visited[i] = true
//                m = dungeonCnt(dungeons, visited, tired - dungeons[i][1], m, cnt + 1)
//                visited[i] = false
//            }
//        }
//        return max(m, cnt)
//    }
//}

//class level3.Solution {
//    var max = 0
//    fun solution(k: Int, dungeons: Array<IntArray>): Int {
//        var answer: Int = 0
//        for (i in dungeons.indices) {
//            if(k>=dungeons[i][0]) {
//                val visited = Array<Boolean>(dungeons.size) { false }
//                dfs(dungeons = dungeons, current = i, visited = visited, tired = k, depth = 1)
//            }
//        }
//        answer = max
//        return answer
//    }
//
//    private fun dfs(
//        dungeons: Array<IntArray>,
//        current: Int,
//        visited: Array<Boolean>,
//        tired: Int,
//        depth: Int
//    ) {
//        visited[current] = true
//        val newTired = tired - dungeons[current][1]
//        for (i in dungeons.indices) {
//            if (!visited[i] && newTired >= dungeons[i][0]) {
//                dfs(dungeons, i, visited, newTired, depth + 1)
//            }
//        }
//        visited[current] = false
//        max = maxOf(max, depth)
//    }
//}