package baekjoon.bronze

fun main(args: Array<String>) {
    val num = readln().toInt()
    var cnt = 1
    var next = when (num) {
        in 1..9 -> {
            num * 10 + num
        }
        in 10..99 -> {
            num % 10 * 10 + if ((num / 10 + num % 10) >= 10) (num / 10 + num % 10) % 10 else (num / 10 + num % 10)
        }
        else -> 0
    }

    while (num != next) {
        next = when (next) {
            in 1..9 -> {
                next * 10 + next
            }
            in 10..99 -> {
                next % 10 * 10 + if ((next / 10 + next % 10) >= 10) (next / 10 + next % 10) % 10 else (next / 10 + next % 10)
            }
            else -> 0
        }
        cnt++
    }
    println(cnt)
}