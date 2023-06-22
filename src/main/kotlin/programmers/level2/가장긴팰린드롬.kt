package programmers.level2//import kotlin.math.max
//
//class level3.Solution {
//    fun solution(s: String): Int {
//        if(s.length == 1) return 0
//        if(s.length == 2 && s[0] == s[1]) return 2
//        var maxLeft = 0
//        var maxRight = 0
//        var left = s.length/2-1
//        var right = if(s.length%2==0) s.length/2 else s.length/2+1
//        val repeatCnt = s.length/2-1
//        if(s.length%2 != 0) maxLeft = max(isPalindrome(s.length/2, s), maxLeft)
//        repeat(repeatCnt) {
//            maxLeft = max(isPalindrome(left--, s), maxLeft)
//            maxRight = max(isPalindrome(right++,s), maxRight)
//        }
//        val max: Int = max(maxLeft, maxRight)
//
//
//        return if(max!=0) max*2+1 else 0
//    }
//
//    fun isPalindrome(index: Int, s: String) : Int {
//        var left = index-1
//        var right = index+1
//        var cnt = 0
//        while(left >= 0 && right <= s.length-1) {
//            if(s[left--] == s[right++]) cnt++
//            else break
//        }
//        return if(cnt==0) -1 else cnt
//    }
//
//}