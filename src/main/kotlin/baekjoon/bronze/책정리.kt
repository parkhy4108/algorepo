package baekjoon.bronze

fun main(){
    val list = mutableListOf<String>()
    while(true){
        list.add(readlnOrNull()?:break)
    }
    val boxArr = list[1].split(" ").map{ it.toInt() }.toIntArray()
    val bookArr = list[2].split(" ").map{ it.toInt() }.toIntArray()
    for(i in bookArr.indices) {
        for(j in boxArr.indices) {
            if(bookArr[i]<=boxArr[j]){
                boxArr[j] -= bookArr[i]
                break
            }
        }
    }
    println(boxArr.sum())
    println((1.toDouble()/3.toDouble()))
}