package programmers.level3//import kotlin.math.min
//
//class WordChange {
//    var min = Int.MAX_VALUE
//    fun solution(begin: String, target: String, words: Array<String>): Int {
//        if (!words.contains(target)) return 0
//        else dfs(begin, target, visited = BooleanArray(words.size), words, 0)
//        if(min == Int.MAX_VALUE) return 0
//        println(min)
//        return min
//    }
//
//    private fun dfs(begin: String, target: String, visited: BooleanArray, words: Array<String>, cnt: Int) {
//        if (begin == target) min = min(min, cnt)
//        else {
//            for (i in words.indices) {
//                var c = 0
//                for (j in begin.indices) if (begin[j] == words[i][j]) c++
//                if (!visited[i] && c == begin.length - 1) {
//                    visited[i] = true
//                    println(words[i])
//                    dfs(words[i], target, visited, words, cnt + 1)
//                    visited[i] = false
//                }
//            }
//        }
//    }
//}
//
///*
//
// */