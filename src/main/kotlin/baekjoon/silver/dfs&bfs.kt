package baekjoon.silver

var result = mutableListOf<Int>()

fun main() {
    val (N, M, S) = readln().split(" ").map { it.toInt() }
    val nodes = Array<MutableList<Int>>(N + 1) { mutableListOf() }
    repeat(M) {
        val (n1, n2) = readln().split(" ").map { it.toInt() }
        nodes[n1].add(n2)
        nodes[n2].add(n1)
    }

//    dfs(nodes.map { it.sorted() }, IntArray(M + 1) { 0 }, S)
    println(result)
    result.clear()
//    bfs(nodes.map { it.sorted() }, IntArray(M + 1) { 0 }, S)
    println(result)
}


/*fun dfs(
    nodes: List<List<Int>>,
    visited: BooleanArray,
    node: Int
) {
    visited[node] = true
    result.add(node)
    nodes[node].forEach { next ->
        if (!visited[next]) dfs(nodes, visited, next)
    }
}*/

/*
fun bfs(
    nodes: List<List<Int>>,
    visited: BooleanArray,
    node: Int
) {
    val queue = mutableListOf<Int>()
    visited[node] = true
    queue.add(node)
    result.add(node)
    while(queue.isNotEmpty()) {
        val current = queue.removeFirst()
        nodes[current].forEach { next ->
            if(!visited[next] && !queue.contains(next)) {
                queue.add(next)
                result.add(next)
                visited[next] = true
            }
        }
    }
}*/
