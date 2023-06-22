//package level2
//
//fun main() {
//    Solution().solution(
//        plans = arrayOf(
//            arrayOf("science", "12:40", "50"),
//            arrayOf("music", "12:20", "40"),
//            arrayOf("history", "14:00", "30"),
//            arrayOf("computer", "12:30", "100")
//        )
//    )
//}
//
//class Solution {
//    fun solution(plans: Array<Array<String>>): Array<String> {
//        val homeWorkList = plans.map { arr ->
//            val name = arr[0]
//            val subTime = arr[1].split(":")
//            val hour = subTime[0].toInt()*60
//            val min = subTime[1].toInt()
//            val during = arr[2].toInt()
//            Work(name =  name, start = hour+min, during = during)
//        }.sortedBy { it.start }.toMutableList()
//
//        var currentSub: Work? = homeWorkList.removeFirst()
//        var time: Int = currentSub!!.start
//        val waitingList = mutableListOf<Work>()
//        val endList = mutableListOf<String>()
//
//        while(currentSub != null || homeWorkList.isNotEmpty() || waitingList.isNotEmpty()) {
//            time++
//            if(currentSub != null) {
//                currentSub.during--
//                if(currentSub.during == 0) {
//                    endList.add(currentSub.name)
//                    currentSub = null
//                }
//            }
//            if(homeWorkList.isNotEmpty()) {
//                if (time == homeWorkList.first().start) {
//                    if (currentSub != null) waitingList.add(currentSub)
//                    currentSub = homeWorkList.removeFirst()
//                }
//            }
//            if(currentSub == null && waitingList.isNotEmpty()) currentSub = waitingList.removeLast()
//        }
//        return endList.toTypedArray()
//    }
//}
//
//data class Work(
//    val name: String,
//    val start: Int,
//    var during: Int
//)