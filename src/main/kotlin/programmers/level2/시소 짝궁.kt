package programmers.level2//import java.util.Arrays
//
//fun level3.main() {
//    level3.Solution().solution(
//        weights = intArrayOf(
//            100, 180, 360, 100, 270
//        )
//    )
//}
//
//class level3.Solution {
//    fun solution(weights: IntArray): Long {
//        var answer: Long = 0
//        val sortedWeights = weights.sorted().toIntArray()
//        val rates = arrayOf(intArrayOf(1, 1), intArrayOf(3, 2), intArrayOf(4, 2), intArrayOf(4, 3))
//        for (rate in rates) {
//            for (i in sortedWeights.indices) {
//                val weight = sortedWeights[i]
//                if (weight * rate[0] % rate[1] != 0) continue
//                val find = (weight * rate[0]) / rate[1]
//                val upper = upperBound(find, sortedWeights, i + 1, sortedWeights.size)
//                val lower = lowerBound(find, sortedWeights, i + 1, upper)
//                answer += (upper - lower)
//            }
//        }
//        println(answer)
//        return answer
//    }
//
//    private fun upperBound(target: Int, array: IntArray, start: Int, end: Int): Int {
//        var left = start
//        var right = end
//        while (left < right) {
//            val mid = ((left.toLong() + right.toLong()) / 2).toInt()
//            if (target < array[mid]) right = mid
//            else left = mid + 1
//        }
//        return left
//    }
//
//    private fun lowerBound(target: Int, array: IntArray, start: Int, end: Int): Int {
//        var left = start
//        var right = end
//        while (left < right) {
//            val mid = ((left.toLong() + right.toLong()) / 2).toInt()
//            if (target <= array[mid]) right = mid
//            else left = mid + 1
//        }
//        return left
//    }
//}
//
//
////class level3.Solution {
////    fun solution(weights: IntArray): Int {
////        var answer = 0
////        val hashSet = HashSet<Int>()
////        val sortedWeights = weights.sorted().toIntArray()
////        for (i in weights.indices) {
////            val current = sortedWeights[i]
////            val arr = possibleArray(num = current)
////            val num = binarySearch(sortedWeights, arr.last())
////            for (j in i + 1 ..num) {
////                if(arr.contains(sortedWeights[j])) {
////                    answer++
////                }
////            }
////        }
////        return answer
////    }
////
////    private fun binarySearch(array: IntArray, target: Int): Int {
////        var left = 0
////        var right = array.size-1
////        while(left<right){
////            val mid = (left+right)/2
////            if(array[mid]<target) left = mid+1
////            else right = mid
////        }
////        return left
////    }
////
////    private fun possibleArray(num: Int): IntArray {
////        val list = mutableListOf<Int>()
////        list.add(num)
////        list.add(num*2)
////        if((num*3).toLong()%2 == 0L  && (num*3).toLong()/2 in 100..1000) list.add(((num*3).toLong()/2).toInt())
////        if((num*4).toLong()%3 == 0L && (num*4).toLong()/3 in 100..1000) list.add(((num*4).toLong()/3).toInt())
////        return list.sorted().toIntArray()
////    }
////}