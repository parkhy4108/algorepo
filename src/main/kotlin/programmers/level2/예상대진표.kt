//package level2
//class Solution6 {
//    fun solution(n: Int, a: Int, b: Int): Int {
//        var h1 = a - 1
//        var h2 = b - 1
//        var cnt = 0
//        while (h1 != h2 ) {
//            h1 /= 2
//            h2 /= 2
//            cnt++
//        }
//        return cnt
//    }
//}
//
//class Solution0 {
//    fun solution(k: Int, tangerine: IntArray): Int {
//        var answer: Int = 0
//        var kVAR = k
//        val hashMap = HashMap<Int,Int>()
//        for(i in tangerine.indices) {
//            hashMap[tangerine[i]] = (hashMap[tangerine[i]]?:0)+1
//        }
//        println(hashMap)
//        // val arr = tangerine.toList().groupingBy{ it }.eachCount().values.sortedBy{ -it }
//        // for(i in arr.indices) {
//        //     kVAR -= arr[i]
//        //     answer++
//        //     if(kVAR <= 0) break
//        // }
//        return answer
//    }
//}
//
//class Solution456 {
//    fun solution(k: Int, tangerine: IntArray): Int {
//        var answer: Int = 0
//        var kVAR = k
//        val hashMap = HashMap<Int,Int>()
//        for(i in tangerine.indices) {
//            hashMap[tangerine[i]] = (hashMap[tangerine[i]]?:0)+1
//        }
//        val arr = hashMap.values.sortedBy{ -it }
//        for(i in arr.indices) {
//            kVAR -= arr[i]
//            answer++
//            if(kVAR <= 0) break
//        }
//        return answer
//    }
//}
//
//
//
//
