package programmers.level2//import java.util.LinkedList
//import java.util.Queue
//
//class level3.Solution {
//    fun solution(board: Array<IntArray>): Int {
//        var answer = 0
//
//        return answer
//    }
//
//    fun bfs(
//        start: level2.Node,
//        end: level2.Node,
//        straightCNT: Int,
//        cornerCNT: Int,
//        board: Array<IntArray>,
//        visited: Array<BooleanArray>
//    ) {
//        val queue: Queue<level2.Node> = LinkedList<level2.Node>()
//        val dx = arrayOf(0, 0, 1, -1)
//        val dy = arrayOf(1, -1, 0, 0)
//        queue.add(start)
//        visited[start.y][start.x] = true
//        while (queue.isNotEmpty()) {
//            val current = queue.remove()
//            for (i in 0..3) {
//                val ny = current.y + dy[i]
//                val nx = current.x + dx[i]
//                val nDirection = if (i == 0) "down" else if (i == 1) "up" else if (i == 2) "right" else "left"
//                if (ny !in board.indices || nx !in board[0].indices || visited[ny][nx]) continue
//                if ((current.direction == "up" && (nDirection == "left" || nDirection == "right")) ||
//                    (current.direction == "down" && (nDirection == "left" || nDirection == "right")) ||
//                    (current.direction == "right" && (nDirection == "up" || nDirection == "down")) ||
//                    (current.direction == "left" && (nDirection == "up" || nDirection == "down"))
//                )
//            }
//        }
//    }
//}
//
//data class level2.Node(val y: Int, val x: Int, val direction: String)
//
///*
//직선의 개수
//코너의 개수
// */