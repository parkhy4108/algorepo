package baekjoon.silver

fun main(){
    val n = readln().toInt()
    val list = mutableListOf<String>()
    repeat(n) {
        list.add(readln())
    }
    for(i in 1..list[0].length) {
        val set = HashSet<Int>()
        for(str in list) {
            var s = ""
            for(j in str.length-i until str.length) s += str[j]
            if(set.contains(s.toInt())) break
            else set.add(s.toInt())
        }
        if(set.size == n) {
            println(i)
            break
        }
    }
}