package week2

fun main() {
//    printable()
//    displaySeparator()
//    displaySeparator('#')
//    displaySeparator(3, '5')

}

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) { print(character) }
}

fun printable() {
    println(listOf('a', 'b', 'c').joinToString(
        separator = "", prefix = "(", postfix = ")"))
    println(listOf('a', 'b', 'c').joinToString(postfix = "."))
}

@JvmOverloads
fun sum(a: Int = 0, b: Int =  0, c: Int = 0) = println(a + b + c)