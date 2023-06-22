package programmers.level2

class Solution {
    fun solution(targets: Array<IntArray>): Int {
        var answer: Int = 0
        val sorted = targets.sortedWith(compareBy ({it[1]}, {it[0]}))
        val cost = Array<IntArray>(targets.size){ IntArray(targets[0].size){Int.MAX_VALUE} }
        var end = sorted[0][1]
        answer++
        for(i in sorted.indices) {
            if(sorted[i][0] >= end) {
                end = sorted[i][1]
                answer++
            }
        }
        return answer
    }
}