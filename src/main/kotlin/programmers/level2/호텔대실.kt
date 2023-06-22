package programmers.level2//fun level3.main() {
//    val book_time = arrayOf(
//        arrayOf("15:00", "17:00"),
//        arrayOf("16:40", "18:20"),
//        arrayOf("14:20", "15:20"),
//        arrayOf("14:10", "19:20"),
//        arrayOf("18:20", "21:20")
//    )
////    val book_time = arrayOf(
////        arrayOf("09:10", "10:10"),
////        arrayOf("10:20", "12:20")
////    )
//    println(
//        level3.Solution().solution(book_time)
//    )
//}
//
////class level3.Solution {
////    fun solution(book_time: Array<Array<String>>): Int {
////        var answer: Int = 0
////        answer = dfs(book_time, BooleanArray(book_time.size) { false }, scheduleTable = mutableListOf(), 0, Int.MAX_VALUE)
////        return answer
////    }
////
////    fun dfs(
////        book_time: Array<Array<String>>,
////        checked: BooleanArray,
////        scheduleTable: MutableList<MutableList<Array<String>>>,
////        count: Int,
////        roomCnt: Int
////    ): Int {
////        var rcnt = roomCnt
////        if (count == book_time.size) {
////            return min(scheduleTable.size, roomCnt)
////        }
////        for (i in book_time.indices) {
////            if (!checked[i]) {
////                checked[i] = true
////                var assigned = false
////                val currentBook = book_time[i]
////                var room = 0
////                if (scheduleTable.isEmpty()) scheduleTable.add(room, mutableListOf(currentBook))
////                else {
////                    for (roomNum in scheduleTable.indices) {
////                        var check = true
////                        for (booked in scheduleTable[roomNum]) {
////                            val startHHmm = currentBook[0].split(":")
////                            val endHHmm = currentBook[1].split(":")
////                            val bookedStartHHmm = booked[0].split(":")
////                            val bookedEndHHmm = booked[1].split(":")
////                            val startMM = startHHmm[0].toInt() * 60 + startHHmm[1].toInt()
////                            val endMM = endHHmm[0].toInt() * 60 + endHHmm[1].toInt() + 10
////                            val bookedStartMM = bookedStartHHmm[0].toInt() * 60 + bookedStartHHmm[1].toInt()
////                            val bookedEndMM = bookedEndHHmm[0].toInt() * 60 + bookedEndHHmm[1].toInt() + 10
////                            if (
////                                startMM in bookedStartMM until bookedEndMM ||
////                                endMM in bookedStartMM until bookedEndMM ||
////                                (startMM <= bookedStartMM && endMM >= bookedEndMM)
////                            ) {
////                                check = false
////                                break
////                            }
////                        }
////                        if (check) {
////                            scheduleTable[roomNum].add(currentBook)
////                            room = roomNum
////                            assigned = true
////                            break
////                        }
////                    }
////                    if (!assigned) {
////                        scheduleTable.add(scheduleTable.lastIndex + 1, mutableListOf(currentBook))
////                        room = scheduleTable.lastIndex
////                    }
////                }
////                rcnt = dfs(book_time, checked, scheduleTable, count + 1, rcnt)
////                checked[i] = false
////                scheduleTable[room].removeLast()
////                if (scheduleTable[room].isEmpty()) scheduleTable.removeAt(room)
////            }
////        }
////        return rcnt
////    }
////}
//
//class level3.Solution {
//    fun solution(book_time: Array<Array<String>>): Int {
//        var answer: Int = 0
//        val scheduleTable = HashMap<Int,MutableList<List<Int>>>()
//        val convertedBookList = book_time.map {
//            it.mapIndexed { index, strTime ->
//                val t = strTime.split(":")
//                if(index == 0) t[0].toInt()*60+t[1].toInt()
//                 else t[0].toInt()*60+t[1].toInt()+10
//            }
//        }.sortedBy { reservation -> reservation[0] }
//        scheduleTable[0] = mutableListOf(convertedBookList[0])
//        for (i in 1 until convertedBookList.size) {
//            val reservation = convertedBookList[i]
//            var assigned = false
//            for (roomSchedule in scheduleTable) {
//                val roomEndTime = roomSchedule.value.last()[1]
//                val reservationStartTime = reservation[0]
//                if (reservationStartTime >= roomEndTime) {
//                    roomSchedule.value.add(reservation)
//                    assigned = true
//                    break
//                }
//            }
//            if (!assigned) scheduleTable[scheduleTable.size] = mutableListOf(reservation)
//        }
//        answer = scheduleTable.size
//        return answer
//    }
//}