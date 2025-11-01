import java.util.Arrays

fun main() {
    // Create Array-1 by using arrayOf()
    val array1 = arrayOf(10, 90, 60, 80, 100)
    println("Create Array-1 by using arrayOf() method:")
    println(array1.contentToString())

    // Create Array-2 by using Array<>
    val array2 = Array<Int>(5) { 0 }
    println("Create Array-2 by using Array<>():")
    println(array2.contentToString())

    // Create Array-3 by using Array<> and lambda
    val array3 = Array(7) { it }
    println("Create Array-3 by using Array<>() and 'lambda' function:")
    println(array3.contentToString())

    // Create Array-4 by using IntArray()
    val array4 = IntArray(5)
    println("Create Array-4 by using IntArray():")
    println(array4.joinToString())

    // Create Array-5 by using intArrayOf()
    val array5 = intArrayOf(12, 10, 1, 5, 18, 19)
    println("\nCreate Array-5 by using intArrayOf():")
    println(array5.joinToString())

    // Create 2D Array-6 by using arrayOf() and intArrayOf()
    val array6 = arrayOf(intArrayOf(1, 3), intArrayOf(4, 5), intArrayOf(6, 7))
    println("\nCreate 2D Array-6 by using arrayOf() and intArrayOf():")
    println(array6.contentDeepToString())

    // Taking array input from user
    val arr = IntArray(5)
    for (i in arr.indices) {
        print("a[$i]=")
        arr[i] = readLine()!!.toInt()
    }

    println("Entered Array:")
    println(arr.joinToString())

    // Built-in sort
    println("\n*************With Built-in Function*************")
    arr.sort()
    println("After sorting by built-in function:")
    println(arr.joinToString())

    // Without built-in sort (Bubble sort)
    val arr2 = intArrayOf(56, 23, 49, 12, 2) // Example data
    println("\n*************Without Built-in Function*************")
    println("Before Sorting:")
    println(arr2.joinToString())
    bubbleSort(arr2)
    println("After Sorting without built-in function:")
    println(arr2.joinToString())
}

fun bubbleSort(arr: IntArray) {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}
