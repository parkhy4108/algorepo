package general

fun main() {
    val arr = intArrayOf(5, 3, 8, 4, 9, 1, 6, 2, 7)
    println("selection Sort: ${arr.selectionSort().toList()}")
    println("insertion Sort: ${arr.insertionSort().toList()}")
    println("bubble Sort: ${arr.bubbleSort().toList()}")
    println("shell Sort: ${arr.shellSort().toList()}")
//    mergeSort2(arr, 0, arr.size - 1)
    quickSort2(arr, 0, arr.lastIndex)
    println(arr.toList())

//    println("quick Sort: ${arr.toList()}")
//    println(shell(arr).toList())
//    mergeS(arr,0,arr.size-1)
//    println(arr.toList())
//    mergeSort(arr, 0, arr.size - 1)
//    quickSort(arr, 0, arr.size - 1)

}


//fun partition(arr: IntArray, left: Int, right: Int, pivotIndex: Int): Int {
//    val pivot = arr[pivotIndex]
//    var i = left
//    for (j in left..right) {
//        if (arr[j] < pivot) {
//            i++
//            arr.swap(i,j)
//        }
//    }
//    arr.swap(pivotIndex,i)
//    return i
//}


fun IntArray.selectionSort(): IntArray {
    val sortedArr = this.clone()
    for (i in 0 until this.lastIndex) {
        var minI = i
        for (j in i..this.lastIndex) {
            if (sortedArr[minI] > sortedArr[j]) minI = j
        }
        sortedArr.swap(minI, i)
    }
    return sortedArr
}

fun IntArray.insertionSort(): IntArray {
    val sortedArr = this.clone()
    for (i in 1..this.lastIndex) {
        var j = i
        while (j > 0 && sortedArr[j] < sortedArr[j - 1]) {
            sortedArr.swap(j - 1, j--)
        }
    }
    return sortedArr
}

fun IntArray.bubbleSort(): IntArray {
    val sortedArr = this.clone()
    var end = this.lastIndex
    while (end > 0) {
        var flag = false
        var index = 1
        for (j in 1..end) {
            if (sortedArr[j] < sortedArr[j - 1]) {
                sortedArr.swap(j, j - 1)
                flag = true
                index = j
            }
        }
        if (!flag) break
        end = index
    }
    return sortedArr
}

fun IntArray.shellSort(): IntArray {
    val sortedArr = this.clone()
    var gap = this.size / 2
    while (gap > 0) {
        for (i in gap..this.lastIndex) {
            var j = i
            while (j - gap >= 0 && sortedArr[j - gap] > sortedArr[j]) {
                sortedArr.swap(j - gap, j)
                j -= gap
            }
        }
        gap /= 2
    }
    return sortedArr
}

fun mergeSort2(arr: IntArray, left: Int, right: Int) {
    if (left < right) {
        val mid = (left + right) / 2
        mergeSort2(arr, left, mid)
        mergeSort2(arr, mid + 1, right)
        merge2(arr, left, mid, right)
    }
}

fun merge2(arr: IntArray, left: Int, mid: Int, right: Int) {
    var i = left
    var j = mid + 1
    val sortedArr = IntArray(arr.size)
    var k = left
    while (i <= mid && j <= right) {
        sortedArr[k++] = if (arr[i] <= arr[j]) arr[i++] else arr[j++]
    }
    if (i <= mid) {
        for (l in i..mid) sortedArr[k++] = arr[l]
    } else {
        for (l in j..right) sortedArr[k++] = arr[l]
    }
    for (l in left..right) arr[l] = sortedArr[l]
}

fun quickSort2(arr: IntArray, left: Int, right: Int) {
    if(left<right) {
        val p = partition2(arr,left,right,left)
        quickSort2(arr, left, p-1)
        quickSort2(arr, p+1, right)
    }
}

fun partition2(arr: IntArray, left: Int, right: Int, pivotIndex: Int): Int {
    var i = left
    val pivot = arr[pivotIndex]
    for(j in left..right) {
        if(arr[j] < pivot) arr.swap(++i, j)
    }
    arr.swap(pivotIndex, i)
    return i
}