package programmers.level2//val dfsList = mutableListOf<Int>()
//val bfsList = mutableListOf<Int>()
//fun level3.main() {
//    val arr = arrayOf(
//        intArrayOf(1, 2),
//        intArrayOf(1, 3),
//        intArrayOf(1, 4),
//        intArrayOf(2, 4),
//        intArrayOf(3, 4)
//    )
//    val n = 4
//    val way = 5
//    val start = 1
//    val tree = Array(n + 1) { mutableListOf<Int>() }
//    arr.forEach { wire ->
//        val node1 = wire[0]
//        val node2 = wire[1]
//        tree[node1].add(node2)
//        tree[node2].add(node1)
//    }
//    dfs(start, visited = BooleanArray(n+1), tree)
//    println(dfsList)
//    bfs(start, visited = BooleanArray(n+1), tree)
//    println(bfsList)
//}
//
//fun dfs(node: Int, visited: BooleanArray, tree: Array<MutableList<Int>>) {
//    visited[node] = true
//    dfsList.add(node)
//    tree[node].forEach { next ->
//        if(!visited[next]) dfs(next, visited, tree)
//    }
//}
//
//fun bfs(node: Int, visited: BooleanArray, tree: Array<MutableList<Int>>) {
//    val queue = ArrayDeque<Int>()
//    visited[node] = true
//    queue.add(node)
//    bfsList.add(node)
//    while(queue.isNotEmpty()) {
//        val current = queue.removeFirst()
//        tree[current].forEach { next ->
//            if(!visited[next] && !queue.contains(node)) {
//                visited[next] = true
//                queue.add(next)
//                bfsList.add(next)
//            }
//        }
//    }
//}