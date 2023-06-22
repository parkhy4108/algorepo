package programmers.level2//import kotlin.math.absoluteValue
//import kotlin.math.min
//
//fun level3.main() {
//    val n = 9
//    val wires = arrayOf(
//        intArrayOf(1, 3),
//        intArrayOf(2, 3),
//        intArrayOf(3, 4),
//        intArrayOf(4, 5),
//        intArrayOf(4, 6),
//        intArrayOf(4, 7),
//        intArrayOf(7, 8),
//        intArrayOf(7, 9)
//    )
//    level3.Solution().solution(n, wires)
//}
//
//class level3.Solution {
//    fun solution(n: Int, wires: Array<IntArray>): Int {
//        var answer: Int = Int.MAX_VALUE
//        val tree = Array(n + 1) {
//            mutableListOf<Int>()
//        }
//        wires.forEach { wire ->
//            val node1 = wire[0] // 1
//            val node2 = wire[1] // 3
//            tree[node1].add(node2)
//            tree[node2].add(node1)
//        }
//        wires.forEach { wire ->
//            val network1 = bfs(wire[0], wire[1], tree, BooleanArray(n + 1))
//            val network2 = bfs(wire[1], wire[0], tree, BooleanArray(n + 1))
//            answer = min((network1-network2).absoluteValue , answer)
//        }
//        return answer
//    }
//
//    fun bfs(node1: Int, node2: Int, tree: Array<MutableList<Int>>, visited: BooleanArray): Int {
//        var count = 1
//        val queue = ArrayDeque<Int>()
//        visited[node1] = true
//        queue.add(node1)
//        while (queue.isNotEmpty()) {
//            val current = queue.removeFirst()
//            tree[current].forEach { next ->
//                if (!visited[next] && next != node2) {
//                    count++
//                    visited[next] = true
//                    queue.add(next)
//                }
//            }
//        }
//        return count
//    }
//}
//
//
