package programmers.level3//class BestAlbum {
//    fun solution(genres: Array<String>, plays: IntArray): IntArray {
//        var answer = intArrayOf()
//        val hash = HashMap<String, MutableList<Song>>()
//        for (i in genres.indices) {
//            if (!hash.containsKey(genres[i])) hash[genres[i]] = mutableListOf()
//            hash[genres[i]]!!.add(Song(i, plays[i]))
//        }
//        answer = hash.toList().sortedByDescending {
//            it.second.fold(0) { acc, song -> acc + song.play }
//        }.map {
//            if (it.second.size >= 2) it.second.sortedByDescending { it.play }.map { it.number }.slice(0..1)
//                .slice(0..1) else it.second.sortedByDescending { it.play }.map { it.number }.slice(0..0)
//        }.flatten().toIntArray()
//
//        return answer
//    }
//}
//
//data class Song(
//    val number: Int,
//    val play: Int
//)