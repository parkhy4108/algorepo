package programmers.level3//class level3.Solution {
//    /**
//     *  @param enroll 판매원 이름 배열
//     *  @param referral 판매원을 다단계에 참여시킨 판매원 이름 배열
//     *  @param seller 판매자
//     *  @param amount 판매량
//     *  @return enroll 순서에 따라 배분된 이익금 배열
//     */
//    fun solution(enroll: Array<String>, referral: Array<String>, seller: Array<String>, amount: IntArray): IntArray {
//        var answer = IntArray(enroll.size) { 0 }
//        val hash = HashMap<String, Int>()
//        val profitHash = HashMap<String, Int>()
//        enroll.forEachIndexed { index, s -> hash[s] = index }
//        hash.forEach {
//            println(it)
//        }
//        enroll.forEach { profitHash[it] = 0 }
//        seller.forEachIndexed { index, s ->
//            var cnt = 0
//            var referName = ""
//            var sellerName = s
//            var profit = amount[index] * 100
//            profitHash[sellerName] = profitHash[sellerName]!! + profit - profit / 10
//            println("seller : $sellerName, profit : $profit")
//            println("profitHash: $profitHash")
//            while (referName != "-") {
//                cnt++
//                profit /= 10
//                if (profit == 0) break
//                referName = referral[hash[sellerName]!!]
//                sellerName = referName
//                println("referNAme : $referName")
//                if (sellerName != "-") profitHash[sellerName] = profitHash[sellerName]!! + profit - profit / 10
//                println("profitHash: $profitHash")
//            }
//            println()
//        }
//        enroll.forEachIndexed { index, s -> answer[index] = profitHash[s]!! }
//        println(answer.toList())
//        return answer
//    }
//}