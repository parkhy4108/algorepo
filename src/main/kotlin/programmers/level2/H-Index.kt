package programmers.level2
class Solution7 {
    fun solution(citations: IntArray): Int {
        var answer = 0
        val list = mutableListOf<Int>()
        for (i in citations.indices) {
            if (citations.count { cnt -> cnt >= i + 1 } >= i + 1) list.add(i + 1)
        }
        answer = if (list.isEmpty()) 0 else list.last()
        return answer
    }
}

