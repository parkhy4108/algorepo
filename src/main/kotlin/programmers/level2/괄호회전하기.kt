package programmers.level2//import java.util.Stack
//
//class Solution8 {
//    fun solution(s: String): Int {
//        var answer: Int = 0
//
//        val str = mutableListOf<Char>()
//        s.forEach { str.add(it) }
//
//        repeat(s.length) {
//            val stack = Stack<Char>()
//            for (i in str.indices) {
//                val item = str[i]
//                stack.add(item)
//                if (stack.size > 1) {
//                    if (stack[stack.lastIndex - 1] == '(' && stack.peek() == ')') {
//                        stack.pop()
//                        stack.pop()
//                    } else if (stack[stack.lastIndex - 1] == '{' && stack.peek() == '}') {
//                        stack.pop()
//                        stack.pop()
//                    } else if (stack[stack.lastIndex - 1] == '[' && stack.peek() == ']') {
//                        stack.pop()
//                        stack.pop()
//                    }
//                }
//            }
//            str.add(str.removeFirst())
//            if (stack.isEmpty()) answer++
//        }
//        return answer
//    }
//}

//
//class Solution8 {
//    fun solution(s: String): Int {
//        var answer: Int = 0
//        val str = mutableListOf<Char>()
//        val stack = mutableListOf<Char>()
//        s.forEach { str.add(it) }
//        repeat(s.length) {
//            var i = 0
//            while (i <= str.size - 1) {
//                if ((str[i] == ')' || str[i] == '}' || str[i] == ']')) {
//                    if (stack.isEmpty()) break
//                    else {
//                        when (str[i]) {
//                            ')' -> { if (stack.last() == '(') stack.removeLast() else break }
//                            '}' -> { if (stack.last() == '{') stack.removeLast() else break }
//                            else -> { if (stack.last() == '[') stack.removeLast() else break }
//                        }
//                    }
//                }
//                else { stack.add(str[i]) }
//                i++
//            }
//            if (i==str.size && stack.isEmpty()) { answer++ }
//            str.add(str.removeFirst())
//        }
//        return answer
//    }
//}