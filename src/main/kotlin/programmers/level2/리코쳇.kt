package programmers.level2//import java.util.LinkedList
//import kotlin.math.min
//
//fun level3.main() {
//    level3.Solution().solution(
//        board = arrayOf(
//            "...D..R",
//            ".D.G...",
//            "....D.D",
//            "D....D.",
//            "..D...."
//        )
//    )
//}
//
//class level3.Solution {
//    val dy = intArrayOf(-1, 0, 1, 0)
//    val dx = intArrayOf(0, 1, 0, -1)
//
//    fun solution(board: Array<String>): Int {
//        var answer = -1
//        val start = findStartNode(board)
//        answer =
//            bfs(board, Array(board.size) { BooleanArray(board[0].length) }, intArrayOf(start.first, start.second, 0))
//        answer = dfs(
//            board,
//            Array(board.size) { BooleanArray(board[0].length) },
//            Array(board.size) { IntArray(board[0].length) { Int.MAX_VALUE / 2 } },
//            start,
//            0,
//            Int.MAX_VALUE/2
//        )
//        return answer
//    }
//
//    fun bfs(
//        board: Array<String>,
//        visited: Array<BooleanArray>,
//        node: IntArray,
//    ): Int {
//        val queue = LinkedList<IntArray>()
//        queue.add(node)
//        while (queue.isNotEmpty()) {
//            val current = queue.removeFirst()
//            val cRow = current[0]
//            val cCol = current[1]
//            val cCnt = current[2]
//            if (board[cRow][cCol] == 'G') return cCnt
//            for (i in 0..3) {
//                val next = findNextNode(board, cRow, cCol, dy[i], dx[i])
//                if (next != Pair(cRow, cCol) && !visited[next.first][next.second]) {
//                    queue.add(intArrayOf(next.first, next.second, current[2] + 1))
//                    visited[next.first][next.second] = true
//                }
//            }
//        }
//        return -1
//    }
//
//    fun dfs(
//        board: Array<String>,
//        visited: Array<BooleanArray>,
//        cntArr: Array<IntArray>,
//        start: Pair<Int, Int>,
//        cnt: Int,
//        minCnt: Int,
//    ): Int {
//        var m = minCnt
//        if (board[start.first][start.second] == 'G') return min(m, cnt)
//        for (i in 0..3) {
//            val next = findNextNode(board, start.first, start.second, dy[i], dx[i])
//            val nextRow = next.first
//            val nextCol = next.second
//            if (next != start && !visited[nextRow][nextCol] && cnt + 1 < cntArr[nextRow][nextCol]) {
//                visited[nextRow][nextCol] = true
//                cntArr[nextRow][nextCol] = cnt + 1
//                m = dfs(board, visited, cntArr, next, cnt + 1, m)
//                visited[nextRow][nextCol] = false
//            }
//        }
//        return m
//    }
//
//
//    fun findNextNode(board: Array<String>, startRow: Int, startCol: Int, dy: Int, dx: Int): Pair<Int, Int> {
//        var row = startRow
//        var column = startCol
//        while (true) {
//            if (row + dy == -1 || row + dy == board.size) return Pair(row, column)
//            if (column + dx == -1 || column + dx == board[0].length) return Pair(row, column)
//            if (board[row + dy][column + dx] == 'D') return Pair(row, column)
//            row += dy
//            column += dx
//        }
//    }
//
//    fun findStartNode(board: Array<String>): Pair<Int, Int> {
//        var start = Pair(0, 0)
//        board.forEachIndexed { row, s ->
//            s.forEachIndexed { column, c ->
//                if (c == 'R') start = Pair(row, column)
//            }
//        }
//        return start
//    }
//}
//
//
//
