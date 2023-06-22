package programmers.level2

data class Node(
    val index: Int,
    val distance: Int
) : Comparable<Node> {
    override fun compareTo(other: Node): Int = distance-other.distance
}

//class Dijkstra {
//    val INF = 1000000000
//    fun dijkstra(start: Int, arr: Array<MutableList<level2.Node>>, ) {
//        val distance: IntArray = IntArray(arr.size)
//        for (i in distance.indices) distance[i] = INF
//        distance[start] = 0
//        val pQueue = PriorityQueue<level2.Node>()
//        pQueue.add(level2.Node(start, 0))
//
//        while (pQueue.isNotEmpty()) {
//            pQueue.forEach { println(it) }
//            val currentIndex = pQueue.peek().index
//            val currentDist = pQueue.peek().distance
//            println("currentIndex: $currentIndex")
//            println("currentDist= $currentDist")
//            pQueue.poll()
//            println(distance.toList())
//            if (distance[currentIndex] < currentDist) continue
//            arr[currentIndex].forEach { nextNode ->
//                val nextIndex = nextNode.index
//                val nextDist = currentDist + nextNode.distance
//                if (nextDist < distance[nextIndex]) {
//                    distance[nextIndex] = nextDist
//                    pQueue.add(level2.Node(nextIndex, nextDist))
//                }
//            }
//            println(distance.toList())
//            println()
//        }
//    }
//}
//
//class Dijkstra {
//    val INF = 1000000000
//    fun dijkstra(start: Int, arr: Array<MutableList<Pair<Int,Int>>>, ) {
//        val distance: IntArray = IntArray(arr.size)
//        for (i in distance.indices) distance[i] = INF
//        distance[start] = 0
//        val pQueue = PriorityQueue<Pair<Int,Int>>{ p1, p2 ->
//            p1.second.compareTo(p2.second)
//        }
//        pQueue.add(Pair(start, 0))
//
//        while (pQueue.isNotEmpty()) {
//            pQueue.forEach { println(it) }
//            val currentIndex = pQueue.peek().first
//            val currentDist = pQueue.peek().second
//            println("currentIndex: $currentIndex")
//            println("currentDist= $currentDist")
//            pQueue.poll()
//            println(distance.toList())
//            if (distance[currentIndex] < currentDist) continue
//            arr[currentIndex].forEach { next ->
//                val nextIndex = next.first
//                val nextDist = currentDist + next.second
//                if (nextDist < distance[nextIndex]) {
//                    distance[nextIndex] = nextDist
//                    pQueue.add(Pair(nextIndex, nextDist))
//                }
//            }
//            println(distance.toList())
//            println()
//        }
//    }
//}


