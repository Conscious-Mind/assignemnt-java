package week2

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false

}

fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty() || s[0].isDigit()) return false
    for (c in s)
        if (!isValidCharacter(c)) return false
    return true
}

fun isValidCharacter(ch: Char) =
    ch == '_' || ch in '0'..'9' || ch in 'a'..'z' || ch in 'A'..'Z'