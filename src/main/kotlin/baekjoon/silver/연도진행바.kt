package baekjoon.silver

fun main(){
    val arr = intArrayOf(1,1,2,3,4,2,1)
    val cntArr = IntArray(arr.maxOf { it } - arr.minOf { it }) { 0 }
    arr.forEach {
        cntArr[it] = cntArr[it] + 1
    }
    val stack = mutableListOf<Int>()
    arr.forEachIndexed { i, n ->
        while(stack.isNotEmpty() && cntArr[stack.last()] < cntArr[n]) {
            arr[stack.removeLast()] = n
        }
        stack.add(i)
    }
    while(stack.isNotEmpty()){
        arr[stack.removeLast()] = -1
    }

    println(arr.toList())
}