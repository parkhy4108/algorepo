package programmers.level3//class level3.Solution {
//    fun solution(n: Int, costs: Array<IntArray>): Int {
//        var answer = 0
//        val parent = IntArray(n) { it }
//        val sortedCosts = costs.sortedBy { it[2] }
//        println(sortedCosts.map { it.toList() })
//        for(node in sortedCosts) {
//            if(getParent(parent,node[0]) != getParent(parent,node[1])) {
//                println("${node[0]} -> ${node[1]}")
//                union(parent,node[0], node[1])
//                answer += node[2]
//                println(parent.toList())
//            }
//        }
//        println(answer)
//        return answer
//    }
//
//    private fun getParent(parent: IntArray, node: Int) : Int {
//        if(parent[node] == node) return node
//        return getParent(parent, parent[node])
//    }
//
//    private fun union(parent: IntArray, a: Int, b: Int) {
//        val rootA = getParent(parent,a)
//        val rootB = getParent(parent,b)
//        if(rootA < rootB) parent[rootB] = rootA
//        else parent[rootA] = rootB
//    }
//}
