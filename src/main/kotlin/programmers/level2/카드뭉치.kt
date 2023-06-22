package programmers.level2//import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac.IntegrityHmacMD5
//
//fun level3.main() {
//    level3.Solution().solution(
//        cards1 = arrayOf("i", "drink", "water"), cards2 = arrayOf("want", "to"),
//        goal = arrayOf("i", "want", "to", "drink", "water")
//    )
//}
//
//class level3.Solution {
//    fun solution(
//        cards1: Array<String>,
//        cards2: Array<String>,
//        goal: Array<String>
//    ): String {
//        var answer = ""
//        var cnt1 = 0
//        var cnt2 = 0
//        goal.forEach {
//            if(cnt1 < cards1.size && it == cards1[cnt1]) cnt1++
//            else if(cnt2 < cards2.size && it == cards2[cnt2]) cnt2++
//            else return "No"
//        }
//        return "Yes"
//    }
//}