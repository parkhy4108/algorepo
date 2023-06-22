package baekjoon.silver

fun main(args: Array<String>) {
    val dir = mapOf(
        "R" to Pair(0, 1),
        "L" to Pair(0, -1),
        "B" to Pair(-1, 0),
        "T" to Pair(1, 0),
        "RT" to Pair(1, 1),
        "LT" to Pair(1, -1),
        "RB" to Pair(-1, 1),
        "LB" to Pair(-1, -1)
    )
    val alpha = mapOf(
        'A' to 1,
        'B' to 2,
        'C' to 3,
        'D' to 4,
        'E' to 5,
        'F' to 6,
        'G' to 7,
        'H' to 8
    )
    val num = mapOf(
         1 to 'A',
         2 to 'B',
         3 to 'C',
         4 to 'D',
         5 to 'E',
         6 to 'F',
         7 to 'G',
         8 to 'H'
    )
    val arr = readln().split(" ")
    var king = Pair(arr[0][1].digitToInt(), alpha[arr[0][0]]!!)
    var stone = Pair(arr[1][1].digitToInt(), alpha[arr[1][0]]!!)
    val move = arr[2].toInt()
    repeat(move) {
        val op = dir[readln()]!!
        val dy = op.first
        val dx = op.second
        if (king.first + dy in 1..8 && king.second + dx in 1..8) {
            if(king.first + dy == stone.first && king.second + dx == stone.second) {
                if(stone.first + dy in 1..8 && stone.second + dx in 1..8) {
                    king = Pair(king.first + dy, king.second + dx)
                    stone = Pair(stone.first + dy , stone.second + dx)
                }
            } else {
                king = Pair(king.first + dy, king.second + dx)
            }
        }
    }
    println("${num[king.second]}${king.first}")
    println("${num[stone.second]}${stone.first}")
}