package programmers.level3//fun level3.main() {
//    level3.Solution().solution(
//        n = 3, computers = arrayOf(
//            intArrayOf(1, 1, 0),
//            intArrayOf(1, 1, 1),
//            intArrayOf(0, 1, 1)
//        )
//    )
//}
//
//class level3.Solution {
//    fun solution(n: Int, computers: Array<IntArray>): Int {
//        var answer = 0
//        val tree = Array(n) { mutableListOf<Int>() }
//        for (i in computers.indices) {
//            computers[i][i] = 0
//        }
//        for (i in computers.indices) {
//            for (j in computers[0].indices) {
//                if (computers[i][j] == 1) tree[i].add(j)
//            }
//        }
//        val visited = BooleanArray(n) { false }
//        var start = 0
//        while (start != -1) {
//            val list = bfs(node = start, tree, BooleanArray(computers.size), mutableListOf())
//            if (list.isNotEmpty()) list.forEach { visited[it] = true }
//            else visited[start] = true
//            answer++
//            start = visited.indexOf(false)
//        }
//        println(answer)
//        return answer
//    }
//
//    private fun bfs(
//        node: Int,
//        tree: Array<MutableList<Int>>,
//        visited: BooleanArray,
//        temp: MutableList<Int>
//    ): MutableList<Int> {
//        val queue = mutableListOf<Int>()
//        visited[node] = true
//        queue.add(node)
//        temp.add(node)
//        while (queue.isNotEmpty()) {
//            val current = queue.removeFirst()
//            tree[current].forEach { next ->
//                if (!visited[next]) {
//                    visited[next] = true
//                    queue.add(next)
//                    temp.add(next)
//                }
//            }
//        }
//        return temp
//    }
//}