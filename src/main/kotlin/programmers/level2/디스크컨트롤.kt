package programmers.level2//class level3.Solution {
//    fun solution(jobs: Array<IntArray>) {
////        val visited = BooleanArray(jobs.size) { false }
//        val sortedJobs = jobs.sortedWith(compareBy({ it[0] }, { it[1] }))
//        var cnt = 1
//        val current = sortedJobs[0]
//        var start = current[0]
//        var end = current[1]
//        var time = 0
//        val list = mutableListOf<IntArray>()
//        while (cnt < jobs.size) {
//            val l = sortedJobs.filter { it[0] in start..end }.sortedBy { it[1] }
//            l.forEach { list.add(it); cnt++ }
//            start = end
//            end = l.last()[1]
//        }
//        list.forEach {
//
//        }
//    }
//
//
//}
//
//
///*
//1. jobs 처리 중 들어온 new jobs 중에 처리 시간이 짧은 애들 처리
//2. 요청 시간이 같다면 task 시간이 짧은 job 먼저 처리
//*/