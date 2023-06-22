package programmers.level3//class level3.Solution {
//    fun solution(n: Int, edge: Array<IntArray>): Int {
//        val tree = Array(n + 1) { mutableListOf<Int>() }
//        edge.forEach {
//            tree[it[0]].add(it[1])
//            tree[it[1]].add(it[0])
//        }
//        return bfs(1, tree, visited = IntArray(n + 1) { 0 })
//            .toList().groupingBy { it }.eachCount()
//            .toSortedMap().values.last()
//    }
//
//    fun bfs(node: Int, tree: Array<MutableList<Int>>, visited: IntArray): IntArray {
//        val queue = ArrayDeque<Int>()
//        queue.addLast(node)
//        visited[node] = 1
//        while (queue.isNotEmpty()) {
//            val current = queue.removeFirst()
//            tree[current].forEach { next ->
//                if (visited[next] == 0) {
//                    queue.add(next)
//                    visited[next] = visited[current] + 1
//                }
//            }
//        }
//        return visited
//    }
//}