package programmers.level2//fun level3.main() {
//    val info = intArrayOf(
//        2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0
////        0, 0, 0, 0, 0, 0, 0, 0, 3, 4, 3
//    )
//    level3.Solution().solution(n = 5, info)
//}
//
//class level3.Solution {
//    private val map = mutableMapOf<Int, IntArray>()
//    var cnt = 0
//    private var diff = Int.MIN_VALUE
//    fun solution(n: Int, info: IntArray): IntArray {
//        var answer: IntArray = intArrayOf()
//        dfs(info, IntArray(info.size) { 0 }, 0, n)
//        answer = if (map.isEmpty()) intArrayOf(-1)
//        else {
//            val x = map.values.toList().sortedWith(
//                compareBy(
//                    { -it[10] },
//                    { -it[9] },
//                    { -it[8] },
//                    { -it[7] },
//                    { -it[6] },
//                    { -it[5] },
//                    { -it[4] },
//                    { -it[3] },
//                    { -it[2] },
//                    { -it[1] },
//                    { -it[0] })
//            )
//            x.first()
//        }
//        println(answer.toList())
//        return answer
//    }
//
//    private fun dfs(apeach: IntArray, lion: IntArray, start: Int, n: Int) {
//        if (n == 0) {
//            var lionScore = 0
//            var apeachScore = 0
//            for (i in apeach.indices) {
//                if (lion[i] == 0 && apeach[i] == 0) continue
//                if (lion[i] > apeach[i]) lionScore += 10 - i
//                else apeachScore += 10 - i
//            }
//            val currentDiff = lionScore - apeachScore
//            if (currentDiff > 0 && currentDiff >= diff) {
//                if (cnt == 0) {
//                    map[cnt++] = lion.clone()
//                } else {
//                    if (currentDiff > diff) {
//                        cnt = 0
//                        map.clear()
//                    }
//                    map[cnt++] = lion.clone()
//                }
//                diff = currentDiff
//            }
//        } else {
//            for (i in start..10) {
//                if (n > apeach[i] && i < 10) {
//                    lion[i] = apeach[i] + 1
//                    dfs(apeach, lion, i + 1, n - (apeach[i] + 1))
//                    lion[i] = 0
//                } else if (n > 0 && i == 10) {
//                    lion[10] = n
//                    dfs(apeach, lion, i + 1, 0)
//                    lion[i] = 0
//                }
//            }
//        }
//    }
//}
//
//
////private fun dfs(apeach: IntArray, lion: IntArray, start: Int, n: Int, temp:MutableList<Int>) {
////    println("dfs 들어옴")
////    if (n == 0) {
////        var lionScore = 0
////        var apeachScore = 0
//////            println("apeach: ${apeach.toList()}")
//////            println("lion:   ${lion.toList()}")
//////            println()
////        for (i in apeach.indices) {
////            if (lion[i] == 0 && apeach[i] == 0) continue
////            if (lion[i] > apeach[i]) lionScore += 10 - i
////            else apeachScore += 10 - i
////        }
////        val currentDiff = lionScore - apeachScore
////        if (currentDiff > 0 && currentDiff >= diff) {
////            if (cnt == 0) {
////                map[cnt++] = lion.clone()
////            } else {
////                if (currentDiff > diff) {
////                    cnt = 0
////                    map.clear()
////                }
////                map[cnt++] = lion.clone()
////            }
////            diff = currentDiff
////        }
////    } else {
////        for (i in start..9) {
////            println("n: $n ,start : $start, apeach[$i] = ${apeach[i]}")
////            if (n > apeach[i]) {
////                lion[i] = apeach[i] + 1
////                println("$n > ${apeach[i]}")
////                println("lion[$i] = ${lion[i]}")
////                println(lion.toList())
////                dfs(apeach, lion,i + 1, n - (apeach[i] + 1), temp)
////                lion[i] = 0
////            }
////        }
////    }
////    println("dfs 나감")
////    println()
////}
