package programmers.level2//import kotlin.math.pow
//
//class level3.Solution {
//    fun solution(n: Int, l: Long, r: Long): Long {
//        var answer: Long = 0
//        val t = intArrayOf(1, 2, 2, 3, 4)
//        if (n == 1) {
//            return if(l-1 == 0L) t[(r-1).toInt()].toLong()
//            else t[(r-1).toInt()].toLong() - t[(l-2).toInt()].toLong()
//        }
//
//        println((4.0).pow(-1).toLong())
//        var cntL = n
//        var cntR = n
//        var lVAR = l - 1
//        var rVAR = r
//        var untilL = 0L
//        var untilR = 0L
//        while (cntL > 0) {
//
//            if (cntL == 1) {
//                untilL += t[(lVAR - 1).toInt()]
//                break
//            }
//
//            val divider = (5.0).pow(cntL - 1).toLong()
//            val num1 = (4.0).pow(cntL - 1).toLong()
//
//            // 몫
//            val a = lVAR / divider
//            println("a : $a, lVAR : ${((lVAR) % divider)}")
//            // 몫 x 1의 개수
//            untilL += a * num1
//
//            // 몫 처리 부분
//            if (a == 2L) break
//            else if (a >= 3L) untilL -= num1
//
//            // 나머지가 있을 때 없을 때 분기
//            if (lVAR % divider != 0L) {
//                lVAR %= divider
//                cntL--
//            } else break
//            println("untilL: $untilL")
//        }
//
//        println("untilL : $untilL")
//
//        while (cntR > 0) {
//
//            if (cntR == 1) {
//                untilR += t[(rVAR - 1).toInt()]
//                break
//            }
//
//            val divider = (5.0).pow(cntR - 1).toLong()
//            val num1 = (4.0).pow(cntR - 1).toLong()
//
//            // 몫
//            val b = rVAR / divider
//            println("b : $b, rVAR : ${((rVAR) % divider)}")
//            // 몫 x 1의 개수
//            untilR += b * num1
//
//            // 몫 처리 부분
//            if (b == 2L) break
//            else if (b >= 3L) untilR -= num1
//
//            // 나머지가 있을 때 없을 때  분기
//            if (rVAR % divider != 0L) {
//                rVAR %= divider
//                cntR--
//            } else break
//        }
//        println("untilR : $untilR")
//        answer = untilR - untilL
//        println(answer)
//
//        return answer
//    }
//}
//
////class level3.Solution {
////    fun solution(n: Int, l: Long, r: Long): Int {
////        var answer: Int = 0
////        val t = intArrayOf(1, 2, 2, 3, 4)
////        if (n == 1) return t[r.toInt()-1] - t[l.toInt()-1]
////        var cntL = n
////        var cntR = n
////        var lVAR = l
////        var rVAR = r
////        var untilL: Double = 0.0
////        var untilR: Double = 0.0
////        while (cntL > 0) {
////            if (cntL == 1 && lVAR != 0L) {
////                untilL += t[lVAR.toInt()-1]
////                break
////            }
////            val divider = (5.0).pow(cntL - 1)
////            val num1 = (4.0).pow(cntL - 1)
////            val a = (lVAR / divider).toInt()
////            lVAR = (lVAR % divider).toLong()
////            untilL += a * num1
////            if (a == 2) break
////            if (a >= 3) untilL -= num1
////            cntL--
////        }
////        while (cntR > 0) {
////            if (cntR == 1 && rVAR != 0L) {
////                untilR += t[rVAR.toInt()-1]
////                break
////            }
////            val divider = (5.0).pow(cntR - 1)
////            val num1 = (4.0).pow(cntR - 1)
////            val b = (rVAR / divider).toInt()
////            rVAR = (rVAR % divider).toLong()
////            untilR += b * num1
////            if (b == 2) break
////            if (b >= 3) untilR -= num1
////            cntR--
////        }
////        answer = (untilR - untilL + 1).toInt()
////        return answer
////    }
////}