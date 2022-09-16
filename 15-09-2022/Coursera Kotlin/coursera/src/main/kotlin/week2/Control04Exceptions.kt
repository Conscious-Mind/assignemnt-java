package week2

import java.io.IOException
import java.lang.IllegalArgumentException
import kotlin.jvm.Throws

fun main() {
//    val number = -1
//
////    throw is an expression
//    val percentage =
//        if (number in 0..100) number
//    else
//        throw IllegalArgumentException(
//            "A percentage value must be between 0 and 100: $number"
//        )
//    println(number)


////    try is an expression
//    val string = "aba"
//    val number1 = try {
//        Integer.parseInt(string)
//    } catch (e: NumberFormatException) {
//        null
//    }
//    println(number1)

//    Throws annotation

}

@Throws(IOException::class)
fun bar() {throw IOException()}