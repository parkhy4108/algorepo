package programmers.level1

fun main() {
    programmers.level1.Solution().solution(
        park =
        arrayOf(
            "OSO","OOO","OXO","OOO"
        ),
        arrayOf(
            "E 2","S 3","W 1"
        )
    )
}

class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {

        var dx = 0
        var dy = 0

        park.forEachIndexed { row, s ->
            s.forEachIndexed { col, c ->
                if (c == 'S') {
                    dx = col
                    dy = row
                }
            }
        }

        routes.forEach { d ->
            val c = d[2].digitToInt()
            var b = true
            var index = 1
            when (d[0]) {
                'N' -> if (dy - c >= 0) {
                    while (index <= c) {
                        if (park[dy - index][dx] == 'X') {
                            b = false
                            break
                        }
                        index++
                    }
                    if (b) dy -= c
                }

                'S' -> if (dy + c < park.size) {
                    while (index <= c) {
                        if (park[dy + index][dx] == 'X') {
                            b = false
                            break
                        }
                        index++
                    }
                    if (b) dy += c
                }

                'W' -> if (dx - c >= 0) {
                    while (index <= c) {
                        if (park[dy][dx - index] == 'X') {
                            b = false
                            break
                        }
                        index++
                    }
                    if (b) dx -= c
                }

                else -> if (dx + c < park[0].length) {
                    while (index <= c) {
                        if (park[dy][dx + index] == 'X') {
                            b = false
                            break
                        }
                        index++
                    }
                    if (b) dx += c
                }
            }
        }
        return intArrayOf(dy, dx)
    }
}