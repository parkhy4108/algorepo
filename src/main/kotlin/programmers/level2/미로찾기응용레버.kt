package programmers.level2
import java.util.LinkedList
import java.util.Queue

fun main() {
    val maps = arrayOf(
        "SOOOL", "XXXXO", "OOOOO", "OXXXX", "OOOOE"
//        "LOOOS","OOOOO","OOOOO","XOOOO","EXOOO"
//        "SLOOO","EOOOO","OOOOO","OOOOO","OOOOO"

    )
}

data class Node43(val y: Int, val x: Int)
class Solution4 {
    fun solution(maps: Array<String>): Int {
        val maze = maps.map { it.toCharArray() }.toTypedArray()
        val info = findStartLeverExit(maps)
        val start = info["Start"]!!
        val exit = info["Exit"]!!
        val lever = info["Lever"]!!
        maze[start.y][start.x] = 'O'
        maze[lever.y][lever.x] = 'O'
        maze[exit.y][exit.x] = 'O'
        var visited = Array(maze.size) { BooleanArray(maze[0].size) { false } }
        val countToLever = mazeRunner(start = start, end = lever, maze = maze, visited)
        if (countToLever == -1) return -1
        visited = Array(maze.size) { BooleanArray(maze[0].size) { false } }
        val countToExit = mazeRunner(start = lever, end = exit, maze = maze, visited)
        if (countToExit == -1) return -1
        return countToLever + countToExit
    }

    private fun mazeRunner(start: Node43, end: Node43, maze: Array<CharArray>, visited: Array<BooleanArray>): Int {
        val queue: Queue<Node43> = LinkedList<Node43>()
        val mazeDis = Array(maze.size) { IntArray(maze[0].size) { -1 } }
        val dx = arrayOf(0, 0, 1, -1)
        val dy = arrayOf(1, -1, 0, 0)
        queue.add(start)
        mazeDis[start.y][start.x] = 0
        visited[start.y][start.x] = true
        while (queue.isNotEmpty()) {
            val current = queue.remove()
            for (i in 0 until 4) {
                val ny = current.y + dy[i]
                val nx = current.x + dx[i]
                if (ny !in maze.indices || nx !in maze[0].indices || visited[ny][nx] || maze[ny][nx] != 'O') continue
                queue.add(Node43(ny, nx))
                visited[ny][nx] = true
                mazeDis[ny][nx] = mazeDis[current.y][current.x] + 1
                if (ny == end.y && nx == end.x) return mazeDis[end.y][end.x]
            }
        }
        return -1
    }

    private fun findStartLeverExit(maps: Array<String>): Map<String, Node43> {
        val info = mutableMapOf<String, Node43>()
        for (y in maps.indices) {
            for (x in maps[0].indices) {
                if (maps[y][x] == 'S') info["Start"] = Node43(y = y, x = x)
                if (maps[y][x] == 'L') info["Lever"] = Node43(y = y, x = x)
                if (maps[y][x] == 'E') info["Exit"] = Node43(y = y, x = x)
            }
        }
        return info
    }
}

