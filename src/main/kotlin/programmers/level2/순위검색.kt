package programmers.level2//fun level3.main() {
//    val info = arrayOf(
//        "java backend junior pizza 150",
//        "python frontend senior chicken 210",
//        "python frontend senior chicken 150",
//        "cpp backend senior pizza 260",
//        "java backend junior chicken 80",
//        "python backend senior chicken 50"
//    )
//
//    val query = arrayOf(
//        "java and backend and junior and pizza 100",
//        "python and frontend and senior and chicken 200",
//        "cpp and - and senior and pizza 250",
//        "- and backend and senior and - 150",
//        "- and - and - and chicken 100",
//        "- and - and - and - 150"
//    )
//    level3.Solution().solution(info, query)
//}
//
////class level3.Solution {
////    private val hashMap= HashMap<String, MutableList<Int>>()
////    fun solution(info: Array<String>, query: Array<String>): IntArray {
////        val answer = IntArray(query.size)
////        val qConverted = query.map { it.replace(" and ", "").split(" ") }
////        val iConverted = info.map { it.split(" ") }
////        val list = mutableListOf<Int>()
//////        makeHashMap(info = iConverted)
////        for (i in info.indices) {
////            dfs(iConverted[i], depth = 0, combination = IntArray(4))
////        }
////        qConverted.forEachIndexed { index, finding ->
////            val key = finding[0]
////            val score = finding[1].toInt()
////            val candidates = hashMap[key]
////            answer[index] = candidates?.count { it >= score }?: 0
////        }
////        return answer
////    }
////
//////    private fun makeHashMap(info: Array<Array<String>>) {
//////        for (i in info.indices) {
//////            dfs(info[i], depth = 0, combination = IntArray(4))
//////        }
//////    }
////
////    private fun dfs(array: List<String>, depth: Int, combination: IntArray) {
////        if (depth == array.size-1) {
////            var key = ""
////            val list = mutableListOf<Int>()
////            for(i in 0..3) {
////                key += if (combination[i] == 0) array[i]
////                else "-"
////            }
////            if(hashMap[key] == null) hashMap[key] = mutableListOf(array.last().toInt())
////            else hashMap[key]!!.add(array.last().toInt())
////        } else {
////            for (i in 0..1) {
////                combination[depth] = i
////                dfs(array, depth + 1, combination)
////            }
////        }
////    }
////}
//
//class level3.Solution {
//    private val hashMap = HashMap<String, MutableList<Int>>()
//    fun solution(info: Array<String>, query: Array<String>): IntArray {
//        val answer = IntArray(query.size)
//        makeHashMap(info = info)
//        hashMap.replaceAll { _, scores ->
//            scores.sorted().toMutableList()
//        }
//        query.forEachIndexed { index, s ->
//            val str = s.split(" and ", " ")
//            val key = str[0] + str[1] + str[2] + str[3]
//            val score = str[4].toInt()
//            if (!hashMap.containsKey(key)) answer[index] = 0
//            else {
//                val candidates = hashMap[key]
//                answer[index] = lowerBoundCnt(candidates!!, score)
//            }
//        }
//        return answer
//    }
//
//    private fun makeHashMap(info: Array<String>) {
//        for (i in info.indices) {
//            dfs(info[i].split(" "), depth = 0, key = "")
//        }
//    }
//
//    private fun dfs(aInfo: List<String>, depth: Int, key: String) {
//        if (depth == 4) {
//            if (!hashMap.containsKey(key)) hashMap[key] = mutableListOf(aInfo[4].toInt())
//            else hashMap[key]!!.add(aInfo[4].toInt())
//        } else {
//            dfs(aInfo, depth + 1, key + aInfo[depth])
//            dfs(aInfo, depth + 1, "$key-")
//        }
//    }
//
//    private fun lowerBoundCnt(list: MutableList<Int>, score: Int): Int {
//        var left = 0
//        var right = list.size
//        var mid = 0
//        while (left < right) {
//            mid = (left + right) / 2
//            if (list[mid] < score) left = mid + 1
//            else right = mid
//        }
//        return list.size - right
//    }
//}
//
//
////    private fun dfs(aInfo: List<String>, depth: Int, combination: IntArray, str: String) {
////        if (depth == 4) {
////            var key = ""
//////            val str =  aInfo.split(" ")
////            combination.forEachIndexed { index, i ->
////                key += if(i == 0) str[index] else "-"
////            }
////            if(!hashMap.containsKey(key)) hashMap[key] = mutableListOf(str[4].toInt())
////            else hashMap[key]!!.add(str[4].toInt())
////        } else {
////            for (i in 0..1) {
////                combination[depth] = i
////                dfs(aInfo, depth + 1, combination)
////            }
////        }
////    }