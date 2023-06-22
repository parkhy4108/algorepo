package general


fun selectionSort(arr: IntArray) {
    for (i in 0 until arr.size - 1) {
        var minIndex = i
        for (j in i + 1 until arr.size) {
            if (arr[j] < arr[minIndex]) minIndex = j
        }
        arr.swap(i, minIndex)
    }
}

fun insertionSort(arr: IntArray) {
    for (i in 1 until arr.size) {
        var index = i
        while (index > 0 && arr[index - 1] > arr[index]) {
            arr.swap(index, index - 1)
            index--
        }
    }
}

fun bubbleSort(arr: IntArray) {
    for (i in 0 until arr.size) {
        for (j in 1 until arr.size - i) {
            if (arr[j - 1] > arr[j]) arr.swap(j - 1, j)
        }
    }
}

fun shellSort(arr: IntArray) {
    var gap = arr.size / 2
    while (gap > 0) {
        for (i in gap until arr.size) {
            var j = i
            while (j - gap >= 0 && arr[j - gap] > arr[j]) {
                arr.swap(j - gap, j)
                j -= gap
            }
        }
        gap /= 2
    }
}

fun mergeSort(arr: IntArray, left: Int, right: Int) {
    if (left < right) {
        val mid = (left + right) / 2
        mergeSort(arr, left, mid)
        mergeSort(arr, mid + 1, right)
        merge(arr, left, mid, right)
    }
}

fun merge(arr: IntArray, left: Int, mid: Int, right: Int) {
    var i = left
    var j = mid + 1
    val sortedArr = IntArray(arr.size)
    var k = left
    while (i <= mid && j <= right) {
        sortedArr[k++] = if (arr[i] <= arr[j]) arr[i++] else arr[j++]
    }
    if (i > mid) {
        for (l in j..right) sortedArr[k++] = arr[l]
    } else {
        for (l in i..mid) sortedArr[k++] = arr[l]
    }
    for (l in left..right) arr[l] = sortedArr[l]
}

fun quickSort(arr: IntArray, left: Int, right: Int) {
    if (left < right) {
        val q = partition(arr, left, right)
        quickSort(arr, left, q - 1)
        quickSort(arr, q + 1, right)
    }
}

fun partition(arr: IntArray, left: Int, right: Int): Int {
    var low = left + 1
    var high = right
    val pivot = arr[left]
    while (low < high) {
        while (low <= right && arr[low] < pivot) {
            low++
        }
        while (high >= left && arr[high] > pivot) {
            high--
        }
        if (low < high) arr.swap(low, high)
    }
    arr.swap(left, high)
    return high
}

fun IntArray.swap(a: Int, b: Int) {
    val temp = this[a]
    this[a] = this[b]
    this[b] = temp
}