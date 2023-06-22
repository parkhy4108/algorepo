package programmers.level3//fun level3.main(){
//    level3.Solution().solution(n = 5, results = arrayOf(
//        intArrayOf(4,3),
//        intArrayOf(4,2),
//        intArrayOf(3,2),
//        intArrayOf(1,2),
//        intArrayOf(2,5)
//    ))
//}
//class level3.Solution {
//    fun solution(n: Int, results: Array<IntArray>): Int {
//        var answer = n
//        val graph = Array<Array<Int?>>(n){ arrayOfNulls(n) }
//
//        for(i in 0 until n) {
//            graph[i][i] = 0
//        }
//
//        results.forEach { (n1, n2) ->
//            graph[n1-1][n2-1] = 1
//            graph[n2-1][n1-1] = -1
//        }
//
//        for(k in 0 until n) {
//            for(i in 0 until n) {
//                for(j in 0 until n) {
//                    if(graph[i][k] == 1 && graph[k][j] == 1) {
//                        graph[i][j] = 1
//                        graph[j][i] = -1
//                    }
//                }
//            }
//        }
//        graph.forEach {
//            if(it.contains(null)) answer--
//        }
//        return answer
//    }
//}