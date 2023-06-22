package programmers.level2//fun level3.main() {
//    val storey = 654
//    level3.Solution().solution(storey)
//}

//class level3.Solution {
//    fun solution(storey: Int): Int {
//        var answer: Int = 0
//        var storeyVar = storey
//        var i = 1
//        while (storeyVar != 0) {
//            val divider = (1..i).fold(1) { acc, _ -> acc * 10 }
//            val calNum = storeyVar.mod(divider)
//            val calFront = calNum.toString()[0].digitToInt()
//            when {
//                calFront > 5 -> {
//                    storeyVar += divider - calNum
//                    answer += 10 - calFront
//                    println("storey : $storeyVar")
//                    println("calFront: $calFront")
//                    println("answer : $answer")
//                    println()
//                }
//                calFront < 5 -> {
//                    storeyVar -= calNum
//                    answer += calFront
//                    println("storey : $storeyVar")
//                    println("calFront: $calFront")
//                    println("answer : $answer")
//                    println()
//                }
//                else -> {
//                    val nextFront = storeyVar.mod(divider * 10).toString()[0].digitToInt()
//                    val totalDigit = storeyVar.toString().count()
//                    if (i != totalDigit && nextFront >= 5) storeyVar += calNum
//                    else storeyVar -= calNum
//                    answer += calFront
//                    println("storey : $storeyVar")
//                    println("calFront: $calFront")
//                    println("answer : $answer")
//                    println()
//                }
//            }
//            i++
//        }
//        println(answer)
//        return answer
//    }
//}


//class level3.Solution {
//    fun solution(storey: Int): Int {
//        var answer: Int = 0
//        var storeyVar = storey
//        var i = 1
//        while (storeyVar != 0) {
//            val divider = (1..i).fold(1) { acc, _ -> acc * 10 }
//            val calNum = storeyVar.mod(divider)
//            val calFront = calNum.toString()[0]
//            if (calFront == '5') {
//                if (i != storeyVar.toString().count() && storeyVar.mod(divider * 10)
//                        .toString()[0].digitToInt() >= '5'.digitToInt()
//                ) storeyVar += calNum
//                else storeyVar -= calNum
//                answer += calFront.digitToInt()
//            } else if (calFront < '5') {
//                storeyVar -= calNum
//                answer += calFront.digitToInt()
//            } else {
//                storeyVar += divider - calNum
//                answer += 10 - calFront.digitToInt()
//            }
//            i++
//        }
//        println(answer)
//        return answer
//    }
//}


//class level3.Solution {
//    fun solution(storey: Int): Int {
//        var answer: Int = 0
//        var storeyVar = storey
//        while (storeyVar != 0) {
//            val current = storeyVar.mod(10)
//            val next =  storeyVar.div(10).mod(10)
//            when {
//                current > 5 -> {
//                    storeyVar += 10 - current
//                    answer += 10 - current
//                }
//                current == 5 -> {
//                    if (next >= 5) storeyVar += current
//                    answer += current
//                }
//                else -> answer += current
//            }
//            storeyVar /= 10
//        }
//        println(answer)
//        return answer
//    }
//}