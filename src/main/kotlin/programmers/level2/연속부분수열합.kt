package programmers.level2

//class Solution {
//    fun solution(elements: IntArray): Int {
//        var answer: Int = 0
//        val arr = elements+elements
//        val numSet = HashSet<Int>()
//        for(i in 1..elements.size) {
//            for(j in elements.indices) {
//                var sum = 0
//                for(k in j until j+i) {
//                    sum += arr[k]
//                }
//                numSet.add(sum)
//            }
//        }
//        return numSet.size
//    }
//}




fun main(){
    Solution111().solution(priorities = intArrayOf(2, 1, 3, 2), location = 2)
}

class Solution111 {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 1
        val deq = ArrayDeque<Pair<Int,Int>>()
        val prioritiesSortedDescending = priorities.sortedDescending().toMutableList()
        priorities.forEachIndexed { i, p ->
            deq.addLast(Pair(i,p))
        }

        while(deq.isNotEmpty()) {
            val currentDoc = deq.removeFirst()
            if(currentDoc.second < prioritiesSortedDescending.first()) {
                deq.addLast(currentDoc)
            } else {
                prioritiesSortedDescending.removeFirst()
                if(currentDoc.first == location) break
                else answer++
            }
        }
        return answer
    }
}

