package programmers.level2
//fun binarySearch(arr: IntArray, target: Int) : Int {
//    var left = 0
//    var right = arr.size-1
//    while(left<=right) {
//        val mid = (left+right)/2
//        if(arr[mid] == target) return mid
//        else if(arr[mid] > target) right = mid-1
//        else left = mid+1
//    }
//    return -1
//}
//
//fun lowerBound(arr: IntArray, target: Int) : Int {
//    var left = 0
//    var right = arr.size
//    while(left<right) {
//        val mid = (left+right)/2
//        if(arr[mid]<target) left = mid+1
//        else right = mid
//    }
//    return right
//}
//
//fun upperBound(arr: IntArray, target: Int): Int {
//    var left= 0
//    var right = arr.size
//    while(left<right) {
//        val mid = (left+right)/2
//        if(arr[mid] <= target) left = mid+1
//        else right = mid
//    }
//    return right
//}