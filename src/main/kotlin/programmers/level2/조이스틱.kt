package programmers.level2//import kotlin.math.min
//fun level3.main(){
//    level3.Solution().solution(name = "ABABBBBBBABA")
//}
//class level3.Solution {
//    var move = Int.MAX_VALUE
//    fun solution(name: String): Int {
//        var answer = 0
//        val b = BooleanArray(name.length) { true }
//        var limit = 0
//        var cnt = 0
//        var depth = 0
//        name.forEachIndexed { index, c ->
//            if (c != 'A') {
//                b[index] = false
//                limit++
//            }
//        }
//        println(b.toList())
//        if (!b[0]) {
//            b[0] = true
//            cnt = findUpDown(name[0])
//            depth = 1
//        }
//        answer = dfs(name, depth, limit, 0, cnt, 100000000, b)
//        return answer
//    }
//
//    //
//    fun dfs(
//        name: String,
//        depth: Int,
//        limit: Int,
//        index: Int,
//        cnt: Int,
//        min: Int,
//        visited: BooleanArray
//    ): Int {
//        var m = min
//        return if (depth == limit) min(m, cnt)
//        else {
//            for (i in 0..1) {
//                val p = findRightLeft(name, visited, index, i)
//                visited[p.first] = true
//                m = dfs(name, depth + 1, limit, p.first, cnt + p.second, m, visited)
//                visited[p.first] = false
//            }
//            m
//        }
//    }
//
//    fun findRightLeft(name: String, visited: BooleanArray, start: Int, direction: Int): Pair<Int, Int> {
//        var index = if(direction == 0) start + 1 else start - 1
//        var cnt = 1
//        var p = Pair(0,0)
//        for(i in 1 until name.length) {
//            if (direction==0 && index >= name.length) index = 0
//            if (direction==1 && index < 0) index = name.length - 1
//            if (name[index] != 'A' && !visited[index]) {
//                p =Pair(index, cnt + findUpDown(name[index]))
//                break
//            }
//            cnt++
//            if(direction==0) index++ else index--
//            println("3 index: $index")
//            println()
//        }
//        return p
//    }
//
//    fun findUpDown(c: Char): Int {
//        val up = c.code - 'A'.code
//        val down = 'Z'.code - c.code + 1
//        return min(up, down)
//    }
//}