private fun main() {
    val a = listOf(15, -2, 2, -8, 1, 7, 10, 23)
    val size = a.size
    val b = mutableListOf<Int>()

    for (firstNum in 0 until size) {

        if (firstNum == size && a[firstNum] == 0) {
            b.add(1)
        }
        for (secondNum in firstNum + 1 until size) {
            val subarray = a.subList(firstNum, secondNum)
            if (addInList(subarray) == 0) {
                b.add(subarray.size)
            }
        }
    }

    println(b.max())


}

fun addInList(list: List<Int>) : Int {
    var sum = 0

    for (num in list) {
        sum += num
    }
    return sum
}