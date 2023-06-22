package programmers.level2//class level3.Solution {
//    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
//        val answer = IntArray(targets.size)
//        val keyHashMap = HashMap<Char, Int>()
//        keymap.forEach { key ->
//            key.forEachIndexed { index, c ->
//                if (keyHashMap.containsKey(c)) {
//                    if (index + 1 < keyHashMap[c]!!) keyHashMap[c] = index + 1
//                } else keyHashMap[c] = index + 1
//            }
//        }
//        targets.forEachIndexed { index, key ->
//            var cnt = 0
//            for (c in key) {
//                if (keyHashMap.containsKey(c)) cnt += keyHashMap[c]!!
//                else {
//                    answer[index] = -1
//                    break
//                }
//            }
//            if(answer[index] != -1) answer[index] = cnt
//        }
//        return answer
//    }
//}