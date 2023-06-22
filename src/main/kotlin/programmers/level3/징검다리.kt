package programmers.level3//class Bridge {
//    fun solution(stones: IntArray, k: Int): Int {
//        var left = 0
//        var right = 200000000
//        while (left < right) {
//            val mid = (left + right)/2
//            if(isPossible(k, mid, stones)) left = mid+1
//            else right = mid
//        }
//        return left-1
//    }
//
//    fun isPossible(k: Int, mid: Int, stones: IntArray) : Boolean {
//        var cnt = 0
//        for(stone in stones) {
//            if(stone - mid < 0) cnt++
//            else cnt = 0
//            if(cnt == k) return false
//        }
//        return true
//    }
//}