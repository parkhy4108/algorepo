package programmers.level2//import kotlin.math.max
//import kotlin.math.min
//
//fun level3.main() {
//    val miro = arrayOf(
//        intArrayOf(1, 0, 1, 1, 1, 1),
//        intArrayOf(1, 0, 1, 0, 1, 0),
//        intArrayOf(1, 0, 1, 0, 1, 1),
//        intArrayOf(1, 1, 1, 0, 1, 1)
//    )
//    val desti = intArrayOf(4, 6)
//    Solution2().solution(miro, desti)
//}
//
//class Solution2() {
//    fun solution(miro: Array<IntArray>, destination: IntArray): Int {
//        var answer = 0
//        answer = findExit(miro, start = intArrayOf(0, 0), end = destination)
//        println(answer)
//        return answer
//    }
//
//    fun findExit(miro: Array<IntArray>, start: IntArray, end: IntArray): Int {
//        val queue = ArrayDeque<IntArray>()
//        var miroDis = Array(miro.size) { IntArray(miro[0].size) { -1 } }
//        queue.add(start)
//        miroDis[start[0]][start[1]] = 1
//        while (queue.isNotEmpty()) {
//            val current = queue.removeFirst()
//            miro[current[0]][current[1]] = -1
//            val next = findNextAndDistUpdate(current, miro, miroDis)
//            miroDis = next.second
//            if (!next.first.contains(end)) queue += next.first else break
//        }
//        val exitDistance = miroDis[end[0]-1][end[1]-1]
//        return if(exitDistance==-1) -1 else exitDistance
//    }
//
//    fun findNextAndDistUpdate(
//        current: IntArray,
//        miro: Array<IntArray>,
//        miroDis: Array<IntArray>
//    ): Pair<ArrayDeque<IntArray>, Array<IntArray>> {
//        val nextArrayDeque = ArrayDeque<IntArray>()
//
//        val miroY = miro.size - 1
//        val miroX = miro[0].size - 1
//        val currentY = current[0]
//        val currentX = current[1]
//        val dis = miroDis[currentY][currentX] + 1
//        //위쪽
//        val upY = max(currentY - 1, 0)
//        val up = miro[upY][currentX]
//        if (up == 1) {
//            nextArrayDeque.add(intArrayOf(max(currentY - 1, 0), currentX))
//            miroDis[upY][currentX] = dis
//        }
//        //오른쪽
//        val rightX = min(currentX + 1, miroX)
//        val right = miro[currentY][rightX]
//        if (right == 1) {
//            nextArrayDeque.add(intArrayOf(currentY, rightX))
//            miroDis[currentY][rightX] = dis
//        }
//        //아래쪽
//        val downY = min(currentY + 1, miroY)
//        val down = miro[downY][currentX]
//        if (down == 1) {
//            nextArrayDeque.add(intArrayOf(downY, currentX))
//            miroDis[downY][currentX] = dis
//        }
//        //왼쪽
//        val leftX = max(currentX - 1, 0)
//        val left = miro[currentY][leftX]
//        if (left == 1) {
//            nextArrayDeque.add(intArrayOf(currentY, leftX))
//            miroDis[currentY][leftX] = dis
//        }
//        return Pair(nextArrayDeque, miroDis)
//    }
//}
//
