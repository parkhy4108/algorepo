package programmers.level3//class level3.Solution {
//    fun solution(tickets: Array<Array<String>>): List<String> {
//        val tree = HashMap<String, MutableList<String>>()
//        val visited = HashMap<String, BooleanArray>()
//        var total = 1
//        tickets.forEach { way ->
//            if (!tree.containsKey(way[0])) tree[way[0]] = mutableListOf(way[1])
//            else tree[way[0]]!!.add(way[1])
//        }
//        tree.forEach { (key, list) ->
//            visited[key] = BooleanArray(list.size)
//            total += list.size
//        }
//        return dfs(key = "ICN", total = total, tree, visited, mutableListOf("ICN"), "Z").chunked(3)
//    }
//
//    fun dfs(
//        key: String,
//        total: Int,
//        tree: HashMap<String, MutableList<String>>,
//        visited: HashMap<String, BooleanArray>,
//        route: MutableList<String>,
//        str: String
//    ): String {
//        var strVAR = str
//        if (route.size == total) {
//            if (strVAR > route.joinToString("")) return route.joinToString("")
//        } else {
//            tree[key]?.forEachIndexed { index, city ->
//                if (!visited[key]!![index]) {
//                    visited[key]!![index] = true
//                    route.add(city)
//                    strVAR = dfs(key = city, total, tree, visited, route, strVAR)
//                    route.removeLast()
//                    visited[key]!![index] = false
//                }
//            }
//        }
//        return strVAR
//    }
//}