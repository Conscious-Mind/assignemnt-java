private fun main() {
    val size = 7
    val repetition = 2
    val aList = listOf(1, 7, 4, 3, 4, 8, 7)
    val numbersRepeating = mutableMapOf<Int, Int>()
    val numberList = mutableListOf<Int>()


    for (i in 0 until size) {
        val num = aList[i]
        var repeating = 0
        val repeatingOrder = mutableListOf<Int>()

        if (!numberList.contains(num)) {
            for (j in 0 until size) {
                if (num == aList[j] && i != j) {
                    repeating++
                    repeatingOrder.add(j)
                }
            }
        }
        if (repeating == repetition - 1 ) {
            numbersRepeating[num] = repeatingOrder.min()
        }
        numberList.add(num)
    }

    var num = 0
    var order = size -1

    numbersRepeating.forEach { t, u ->
        if (u < order) {
            num = t
            order = u
        }
    }
    println(num)

}
