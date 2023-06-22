package programmers.level3//import java.util.PriorityQueue
//
//fun level3.main() {
//    level3.Solution().solution(operations = arrayOf(
////        "I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"
//        "I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"
//    ))
//}
//
//class level3.Solution {
//    fun solution(operations: Array<String>): IntArray {
//        val pqMax = PriorityQueue<Int>(reverseOrder())
//        val pqMin = PriorityQueue<Int>()
//        operations.forEach { str ->
//            val strList = str.split(" ")
//            val op = strList[0]
//            val num = strList[1].toInt()
//            if(op == "I") {
//                // insert 명령일 때 처리하는 부분
//                pqMax.offer(num)
//                pqMin.offer(num)
//            } else if(num == 1 && pqMax.isNotEmpty()){
//                // 큐에서 "최댓값"을 삭제하는 부분
//                pqMin.remove(pqMax.poll())
//            } else if(num == -1 && pqMin.isNotEmpty()){
//                // 큐에서 "최솟값"을 삭제하는 부분
//                pqMax.remove(pqMin.poll())
//            }
//        }
//        return if(pqMax.isEmpty()) intArrayOf(0,0)
//        else {
//            intArrayOf(pqMax.poll(), pqMin.poll())
//        }
//    }
//}