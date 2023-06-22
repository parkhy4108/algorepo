package baekjoon.bronze

fun main(args: Array<String>){
    var result = Pair(1,1)
    val n = readln().toInt()
    val list = mutableListOf<IntArray>()
    repeat(n) {
        list.add(readln().split(" ").map { it.toInt() }.toIntArray())
    }
    for(studentNum in 0 until n) {
//        print("${studentNum+1}번 학생 ")
        val hashSet = HashSet<Int>()
        for(grade in 0..4) {
            val cla = list[studentNum][grade]
//            println("${grade+1}학년 ${cla}반")
            for(i in 0 until n) {
                if(i != studentNum && cla == list[i][grade]) {
//                    println("같은 학생 ${i+1}, 반 ${list[i][grade]}")
                    hashSet.add(i)
                }
            }
        }
        println("result: $result ,size: ${hashSet.size}")
        result = if(hashSet.size > result.second) Pair(studentNum+1, hashSet.size) else result
    }
    println(result.first)
}