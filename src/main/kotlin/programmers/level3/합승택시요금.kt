package programmers.level3//import kotlin.math.min
//
//class level3.Solution {
//
//    fun solution(n: Int, s: Int, a: Int, b: Int, fares: Array<IntArray>): Int {
//        val d = floyd(n, fares)
//        var fareMin = 30000000
//        for(i in d.indices) {
//            val with = d[s-1][i]
//            val fareA = d[i][a-1]
//            val fareB = d[i][b-1]
//            println("${s-1} -> $i : $with")
//            println("a: $fareA")
//            println("b: $fareB")
//            fareMin = min(d[s-1][i] + d[i][a-1] + d[i][b-1] , fareMin)
//        }
//        return fareMin
//    }
//
//    /**
//     * 플로이드 와샬 함수
//     * @param n 전체 노드의 개수
//     * @param arr [x 노드, y 노드, w 값]을 같는 입력 배열 집합
//     * @return 각 노드가 갖는 최단 경로 값 2차원 배열
//     */
//    fun floyd(n: Int, arr: Array<IntArray>): Array<IntArray> {
//        // 배열을 선언 (size = 전체 노드 n개 만큼) , 10000000는 many 를 의미
//        val d = Array(n) { IntArray(n) { 10000000 } }
//        // 자기 자신은 0으로 초기화
//        for (i in 0 until n) d[i][i] = 0
//        // 입력 받은 노드 간선 정보 배열을 정리
//        arr.forEach {
//            d[it[0] - 1][it[1] - 1] = it[2]
//            d[it[1] - 1][it[0] - 1] = it[2]
//        }
//        // k는 중간에 들리는 노드
//        for (k in d.indices) {
//            // i는 i에서 출발하는 노드
//            for (i in d.indices) {
//                // j는 j에서 끝나는 노드
//                for (j in d.indices) {
//                    // i -> k 갔다가 k -> j 로 갈 때 더 작은 값으로 갱신
//                    if (d[i][k] + d[k][j] < d[i][j]) {
//                        d[i][j] = d[i][k] + d[k][j]
//                    }
//                }
//            }
//        }
//        return d
//    }
//}
//
///*
//1. 각자 가는 경우
//2. 같이 가는 경우
//3. 같이 가면 몇 번 노드까지 같이갈지
//4. 같이 간 후 각자 가는 경우
// */
///*
//각 노드까지 금액을 계산
// */