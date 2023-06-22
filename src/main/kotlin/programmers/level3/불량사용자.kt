package programmers.level3//class RogueUser {
//    var cnt = 0
//    val set = HashSet<String>()
//    fun solution(user_id: Array<String>, banned_id: Array<String>): Int {
//        var answer = 0
//        val tree = HashMap<Int, MutableList<String>>()
//        banned_id.forEachIndexed { index, ban ->
//            user_id.forEach { user ->
//                var sameCnt = ban.length
//                if (ban.length == user.length) {
//                    for (i in ban.indices) {
//                        if (ban[i] == user[i] || ban[i] == '*') sameCnt--
//                    }
//                    if (sameCnt == 0) {
//                        if (!tree.containsKey(index)) tree[index] = mutableListOf()
//                        tree[index]!!.add(user)
//                    }
//                }
//            }
//        }
//        dfs(user_id, banned_id, tree, mutableListOf(), 0)
//        answer = set.size
//        return answer
//    }
//
//    private fun dfs(
//        user_id: Array<String>,
//        banned_id: Array<String>,
//        tree: HashMap<Int, MutableList<String>>,
//        temp: MutableList<String>,
//        count: Int
//    ) {
//        if (temp.size == banned_id.size) {
//            val str = temp.sorted().joinToString("")
//            set.add(str)
//        } else {
//            tree[count]
//            for(i in tree[count]!!.indices) {
//                if(!temp.contains(tree[count]!![i])) {
//                    temp.add(tree[count]!![i])
//                    dfs(user_id, banned_id, tree, temp, count+1)
//                    temp.removeLast()
//                }
//            }
//        }
//    }
//}