package week2

fun main() {
    println(isLetter('D'))
    println(isNotDigit('9'))
    println(recognize('7'))
    println(recognize('*'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a Digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a Letter!"
    else -> "I don't Know..."
}