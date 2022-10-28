private fun main() {
    val a = listOf(1, 2, 5, 4, 0)
    val b = listOf(2, 4, 5, 0, 1)

    println(isTwoListEqual(a, b))

}

fun isTwoListEqual(list1: List<Int>, list2: List<Int>) : Boolean {
    return list1.size == list2.size && list1.sorted() == list2.sorted()
}

