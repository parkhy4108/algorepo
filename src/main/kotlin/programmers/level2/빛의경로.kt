package programmers.level2//class level3.Solution {
//    fun solution(grid: Array<String>): IntArray {
//        var answer: IntArray = intArrayOf()
//
//        val list = Array(4) { mutableListOf<IntArray>() }
//        for (i in 0..3) {
//            var y = 0
//            var x = 0
//            var nDirection = grid[y][x]
//            var before = i
//            val l = mutableListOf<IntArray>()
//            val a = intArrayOf(y, x, before)
//            l.add(a)
//            while (true) {
//                val arr = nextNode(
//                    y = y,
//                    x = x,
//                    go = nDirection,
//                    before = before,
//                    xMax = grid[0].length - 1,
//                    yMax = grid.size - 1
//                )
//                y = arr[0]
//                x = arr[1]
//                nDirection = grid[y][x]
//                before = arr[2]
////                println("($y, $x) $nDirection")
//                if (a.contentEquals(arr)) break
//                else l.add(arr)
//            }
//            list[i] = l
//        }
//
//        if (list.size == 1) return intArrayOf(list[0].size)
//        else {
//            val arr = intArrayOf(0,1,2,3)
//            val b = booleanArrayOf(false,false,false,false)
//            for(i in 0..3) {
//                for(j in 0..3) {
//                    val n = list[i]
//                    if(!b[j]){
//                        val m = list[j]
//                        val nS = n.sortedWith(compareBy({it[0]}, {it[1]}, {it[2]}))
//                        val mS = m.sortedWith(compareBy({it[0]}, {it[1]}, {it[2]}))
//                        if(nS.first().contentEquals(mS.first())) {
//                            b[j] = true
//                            arr[j] = i
//                        }
//                    }
//                }
//            }
//            answer = arr.groupBy { it }.keys.map { list[it].size }.toIntArray()
//        }
//
//        return answer
//    }
//
//    fun nextNode(
//        y: Int,
//        x: Int,
//        go: Char,
//        before: Int,
//        xMax: Int,
//        yMax: Int
//    ): IntArray {
////        println("y $y x $x,direction: ${direction(go, inputDirection = before)}")
//        when (val nextDirection = direction(go, inputDirection = before)) {
//            2 -> {
//                return if (x == xMax) intArrayOf(y, 0, nextDirection)
//                else intArrayOf(y, x + 1, nextDirection)
//            }
//
//            3 -> {
//                return if (x == 0) intArrayOf(y, xMax, nextDirection)
//                else intArrayOf(y, x - 1, nextDirection)
//            }
//
//            1 -> {
//                return if (y == yMax) intArrayOf(0, x, nextDirection)
//                else intArrayOf(y + 1, x, nextDirection)
//            }
//
//            else -> {
//                return if (y == 0) intArrayOf(yMax, x, nextDirection)
//                else intArrayOf(y - 1, x, nextDirection)
//            }
//        }
//    }
//
//    private fun direction(node: Char, inputDirection: Int): Int {
//        when (node) {
//            'S' -> return inputDirection
//            'R' -> {
//                return when (inputDirection) {
//                    2 -> 1
//                    3 -> 0
//                    1 -> 3
//                    else -> 2
//                }
//            }
//
//            else -> {
//                return when (inputDirection) {
//                    2 -> 0
//                    3 -> 1
//                    1 -> 2
//                    else -> 3
//                }
//            }
//        }
//    }
//
//}
