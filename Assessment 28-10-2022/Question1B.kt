private fun main() {

    var string = "abca"

    var anagram = findAnagrams(string)


    println(anagram.toString())

    var anagaramList = mutableListOf<String>()

    for (i in 0 until anagram.size) {
        val string1 = anagram[i]
        if (i == anagram.size - 1) {
            break
        }
        for (j in i + 1 until anagram.size) {
            val string2 = anagram[j]
            if (isAnagrams(string1, string2)) {
                anagaramList.add(string1)
            }
        }
    }


    println(anagaramList.toString())
    println(anagaramList.size)


}

fun findAnagrams(string: String): MutableList<String> {
    val mList = mutableListOf<String>()
    for (firstNum in 0 until string.length) {
        var temp = ""
        for (secondNum in firstNum until string.length) {
            temp += string[secondNum].toString()
            mList.add(temp)
        }
    }
    return mList
}

fun isAnagrams(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }
    val strArray1 = str1.toCharArray()
    val strArray2 = str2.toCharArray()

    strArray1.sort()
    strArray2.sort()

    val sortedStr1 = String(strArray1)
    val sortedStr2 = String(strArray2)

    return sortedStr1 == sortedStr2
}