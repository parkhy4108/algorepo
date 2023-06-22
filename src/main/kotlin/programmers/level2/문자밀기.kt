package programmers.level2//class Solution3 {
//    fun solution(s: String, n: Int): String {
//        var answer = ""
//        s.forEach {
//            answer += if (it == ' ') it
//            else {
//                if (it.isUpperCase()) {
//                    if (it.code + n > 'Z'.code) (('A'.code + ((it.code + n) - 'Z'.code - 1))).toChar()
//                    else (it.code + n).toChar()
//                } else {
//                    if (it.code + n > 'z'.code) (('a'.code + ((it.code + n) - 'z'.code - 1))).toChar()
//                    else (it.code + n).toChar()
//                }
//            }
//        }
//        return answer
//    }
//}