package programmers.level2//fun level3.main() {
//    val users = arrayOf(
//        intArrayOf(40, 2900),
//        intArrayOf(23, 10000),
//        intArrayOf(11, 5200),
//        intArrayOf(5, 5900),
//        intArrayOf(40, 3100),
//        intArrayOf(27, 9200),
//        intArrayOf(32, 6900)
//    )
//    val emoticons = intArrayOf(1300, 1500, 1600, 4900)
//    level3.Solution().solution(users, emoticons)
//}
//
//class level3.Solution {
//    val list = mutableListOf<IntArray>()
//
//    fun solution(users: Array<IntArray>, emoticons: IntArray): IntArray {
//        dfs(users, emoticons, discountArr = IntArray(emoticons.size), depth = 0)
//        val sorted = list.sortedWith(compareByDescending<IntArray> { it[0] }.thenByDescending { it[1] })
//        return sorted[0]
//    }
//
//    private fun dfs(
//        users: Array<IntArray>,
//        emoticons: IntArray,
//        discountArr: IntArray,
//        depth: Int,
//    ) {
//        if (depth == emoticons.size) {
//            var joinCnt = 0
//            var income = 0
//            for (i in users.indices) {
//                val currentUser = users[i]
//                val userWantedRate = currentUser[0]
//                val userMoney = currentUser[1]
//                var totalBuyingMoney = 0
//                for (j in emoticons.indices) {
//                    val currentEmoRate = discountArr[j]
//                    val emoticonPrice = emoticons[j] / 100 * (100 - currentEmoRate)
//                    if (currentEmoRate >= userWantedRate) totalBuyingMoney += emoticonPrice
//                }
//                if (totalBuyingMoney >= userMoney) joinCnt++
//                else income += totalBuyingMoney
//                list.add(intArrayOf(joinCnt, income))
//            }
//        } else {
//            for (i in 1..4) {
//                discountArr[depth] = 10 * i
//                dfs(users, emoticons, discountArr, depth + 1)
//            }
//        }
//    }
//}
