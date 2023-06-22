package programmers.level2//fun level3.main() {
//
//    level3.Solution().solution(storey = 95)
//}

//class level3.Solution {
//    fun solution(storey: Int): Int {
//        var answer: Int = 0
//        val list = storey.toString().reversed().toMutableList()
//        list.forEachIndexed { index, c ->
//            val num = c.digitToInt()
//            when {
//                num > 5 -> {
//                    answer += 10 - num
//                    if(index != list.lastIndex) {
//                        if(list[index + 1].inc().digitToInt() == 10) list[index+1] = '0'
//                        else list[index+1] = list[index+1].inc()
//                    }
//                }
//                num == 5 -> {
//                    answer += 10 - num
//                    if(index != list.lastIndex) {
//                        if(list[index+1].digitToInt() > 5) {
//                            if(list[index + 1].inc().digitToInt() == 10) list[index+1] = '0'
//                            else list[index+1] = list[index+1].inc()
//                        }
//                    }
//                }
//                else -> answer += num
//            }
//        }
//        println(answer)
//        return answer
//    }
//}


