package programmers.level2//fun level3.main() {
//    val cards = intArrayOf(2, 1)
//    level3.Solution().solution(cards)
//}
//
//class level3.Solution {
//    fun solution(cards: IntArray): Int {
//        var answer: Int = 0
//        val visited = BooleanArray(cards.size) { false }
//        val list = mutableListOf<List<Int>>()
//        while (!visited.all { it }) {
//            println("D")
//            val start = visited.indexOf(false)
//            list.add(
//                dfs(
//                    i = start,
//                    cards = cards.map { it - 1 },
//                    visited = visited,
//                    temp = mutableListOf()
//                )
//            )
//        }
//        answer = if (list.size == 1) 0
//        else list.map { it.size }
//            .sortedByDescending { it }
//            .slice(0..1)
//            .fold(1) { acc: Int, i: Int -> acc * i }
//        return answer
//    }
//
//    fun dfs(
//        i: Int,
//        cards: List<Int>,
//        visited: BooleanArray,
//        temp: MutableList<Int>
//    ): List<Int> {
//        if (temp.contains(i)) return temp.toList()
//        val next = cards.indexOf(i)
//        visited[i] = true
//        temp.add(i)
//        return dfs(next, cards, visited, temp)
//    }
//}