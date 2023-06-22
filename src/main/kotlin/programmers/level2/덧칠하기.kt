package programmers.level2//class level3.Solution {
//    fun solution(n: Int, m: Int, section: IntArray): Int {
//        var answer: Int = 0
//        var index = 0
//        var cnt = 0
//        val arr = BooleanArray(n+1){ true }
//        section.forEach { arr[it] = false }
//        while(cnt != section.size) {
//            if(arr[index]) index++
//            else {
//                answer++
//                var repeatCnt = 0
//                while(index+repeatCnt <= n && repeatCnt<= m-1) {
//                    if(!arr[index+repeatCnt]) {
//                        arr[index+repeatCnt] = true
//                        cnt++
//                    }
//                    repeatCnt++
//                }
//                index++
//            }
//
//        }
//        return answer
//    }
//}