package baekjoon.bronze

fun main(){
    val list = mutableListOf<String>()
    while(true) {
        list.add(readlnOrNull()?:break)
    }
    val cArr = list[0].split(":").map{ it.toInt() }
    val mArr = list[1].split(":").map{ it.toInt() }
    val currentTime = cArr[0]*3600+cArr[1]*60+cArr[2]
    val missionTime = mArr[0]*3600+mArr[1]*60+mArr[2]
    val leftTime = if(currentTime < missionTime) missionTime-currentTime else currentTime-missionTime
    val h = if(leftTime/3600 < 10) "0${leftTime/3600}" else "${leftTime/3600}"
    val m = if((leftTime%3600)/60 < 10) "0${(leftTime%3600)/60}" else "${(leftTime%3600)/60}"
    val s = if((leftTime%3600)%60 < 10) "0${(leftTime%3600)%60}" else "${(leftTime%3600)%60}"
    println("$h:$m:$s")
}