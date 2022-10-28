private fun main() {
    val a = listOf(16, 17, 4, 3, 5,2)
    val size = a.size
    var b = mutableListOf<Int>()

    for (i in 0 until size) {
        val firstNumber = a[i]
        var isFirstNumberGreater = true

        if (i == size) {
            b.add(firstNumber)
            break
        }


        for (j in i+1 until size) {
            val nextNumber = a[j]
            if (!isFirstNumberGreater) {
                break
            }
            if (firstNumber < nextNumber) {
                isFirstNumberGreater = false
            }
        }
        if (isFirstNumberGreater) {
            b.add(firstNumber)
        }
    }

    println(b.toString())
}