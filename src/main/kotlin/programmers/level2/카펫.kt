package programmers.level2//class Solution5 {
//    fun solution0(brown: Int, yellow: Int): IntArray {
//        var width = 3
//        var height = 3
//        while (width >= height) {
//            val y = (width - 2) * (height - 2)
//            val b = width * height - (width - 2) * (height - 2)
//            if (y == yellow && b == brown) break
//            else if (y <= yellow && b >= brown) {
//                width--
//                height++
//            } else width++
//        }
//        return intArrayOf(width, height)
//    }
//
//    fun solution1(brown: Int, yellow: Int): IntArray {
//        var width = 3
//        var height = 3
//        while (width >= height) {
//            val y = (width - 2) * (height - 2)
//            val b = width * height - y
//            if (y == yellow && b == brown) break
//            if(y<yellow && b >= brown) {
//                width--
//                height++
//            } else width++
//        }
//        return intArrayOf(width, height)
//    }
//
//
//}