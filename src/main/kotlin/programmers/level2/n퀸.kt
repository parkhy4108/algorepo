package programmers.level2//import kotlin.math.abs
//
//fun level3.main() {
//    println(
//        SolutionNQueen().solution(n = 4)
//    )
//}
//
////    fun solution(n: Int): Int = backtracking(
////        n = n,
////        row = 0,
////        column = mutableListOf(),
////        colHash = HashSet<Int>(),
////        xyDiff = HashSet<Int>(),
////        xySum = HashSet<Int>(),
////        count = 0
////    )
//class SolutionNQueen {
//
//    private lateinit var colArr: IntArray
//    fun solution(n: Int): Int {
//        colArr = IntArray(n) { -1 }
//        return backTracking(n = n, row = 0, count = 0)
//    }
//
//    private fun backTracking(n: Int, row: Int, count: Int): Int {
//        var cnt = count
//        if (row == n) return cnt + 1
//        else {
//            for (column in 0 until n) {
//                if (check(row, column)) {
//                    colArr[row] = column
//                    cnt = backTracking(n, row + 1, cnt)
//                    colArr[row] = -1
//                }
//            }
//        }
//        return cnt
//    }
//
//    private fun check(row: Int, column: Int): Boolean {
//        for (k in 0 until row) {
//            if (colArr[row] == column || abs(colArr[k] - column) == abs(k - row))
//                return false
//        }
//        return true
//    }
//
//    private fun backtracking(
//        n: Int,
//        row: Int,
//        column: MutableList<Int>,
//        colHash: HashSet<Int>,
//        xyDiff: HashSet<Int>,
//        xySum: HashSet<Int>,
//        count: Int
//    ): Int {
//        var cnt = count
//        if (row == n) {
//            return count + 1
//        } else {
//            for (col in 0 until n) {
//                if (!colHash.contains(col) && !xyDiff.contains(row - col) && !xySum.contains(row + col)) {
//                    column.add(col)
//                    colHash.add(col)
//                    xyDiff.add(row - col)
//                    xySum.add(row + col)
//                    cnt = backtracking(n, row + 1, column, colHash, xyDiff, xySum, cnt)
//                    column.removeLast()
//                    colHash.remove(col)
//                    xyDiff.remove(row - col)
//                    xySum.remove(row + col)
//                }
//            }
//        }
//        return cnt
//    }
//}
////}
//////    fun backtracking(
//////        n: Int,
//////        row: Int,
//////        column: MutableList<Int>,
//////        colHash: HashSet<Int>,
//////        xyDiff: HashSet<Int>,
//////        xySum: HashSet<Int>,
//////        boolean: Boolean
//////    ): Boolean {
//////        var b = boolean
//////        if (row == n) return true
//////        else {
//////            for (col in 0 until n) {
//////                if (!colHash.contains(col) && !xyDiff.contains(row - col) && !xySum.contains(row + col)) {
//////                    column.add(col)
//////                    colHash.add(col)
//////                    xyDiff.add(row - col)
//////                    xySum.add(row + col)
//////                    b = backtracking(n, row + 1, column, colHash, xyDiff, xySum, boolean)
//////                }
//////            }
//////        }
//////        return b
//////    }
