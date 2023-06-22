package baekjoon.silver

fun main() {

    val list = mutableListOf<String>()
    val map = HashMap<Char, Boolean>()
    val iList = mutableListOf<Pair<Int, Int>>()

    repeat(readln().toInt()) {
        val word = readln()
        list.add(word)
    }

    ('a'..'z').forEach {
        map[it] = false
    }

    list.forEach { str ->
        val strArr = str.split(" ")
        var find = false

        for (i in strArr.indices) {
            val alpha = strArr[i][0].lowercase()[0]
            if (!map[alpha]!!) {
                map[alpha] = true
                find = true
                iList.add(Pair(i, 0))
                break
            }
        }

        if (!find) {
            for (i in strArr.indices) {
                val word = strArr[i]
                for (j in word.indices) {
                    val alpha = word[j].lowercase()[0]
                    if (!map[alpha]!!) {
                        map[alpha] = true
                        iList.add(Pair(i, j))
                        find = true
                        break
                    }
                }
                if (find) break
            }
            if(!find) iList.add(Pair(-1, -1))
        }
    }

    list.forEachIndexed { index, str ->
        if (iList[index].first != -1) {
            var result = ""
            val strArr = str.split(" ")
            for (i in strArr.indices) {
                val word = strArr[i]
                if (i == iList[index].first) {
                    for (j in word.indices) {
                        val ch = word[j].toString()
                        result += if (j == iList[index].second) "[$ch]" else ch
                    }
                } else result += word
                result += " "
            }
            println(result)
        } else println(str)
    }
}