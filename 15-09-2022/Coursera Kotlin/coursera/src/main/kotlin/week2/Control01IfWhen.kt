package week2

import week2.Color.*
import java.lang.Exception

fun main() {
//    val a = 5;
//    val b = 88;
//    val max = if (a> b) a else b
//
//    println(max)

//    println(getDescription(BLUE))

//    respondToInput("yye")
//    mix(RED, VIOLET)
//    mix(YELLOW, RED)  // printing possible even if we swap the arguments

    updateWeather(15)
}


enum class Color {
    BLUE, ORANGE, RED, YELLOW, GREEN, VIOLET, INDIGO
}

fun getDescription(color: Color): String =
    when (color) {
        BLUE -> "Cold"
        ORANGE -> "Mild"
        RED -> "Hot"
        else -> "Don't Know"
    }

fun respondToInput(input: String) = when (input) {
    "y", "yes" -> println("I'm glad you agree")
    "n", "no" -> println("Sorry to hear that")
    else -> println("I don't understand you")
}

fun mix(color1: Color, color2: Color) =
    when (setOf(color1, color2)) {
        setOf(RED, YELLOW) -> println(ORANGE)
        setOf(YELLOW, BLUE) -> println(GREEN)
        setOf(BLUE, VIOLET) -> println(INDIGO)
        else -> throw Exception("Dirty Color")
    }

fun updateWeather(degrees: Int) {
    val (description, colour) = when {
        degrees < 5 -> "Cold" to BLUE
        degrees < 23 -> "Mild" to ORANGE
        else -> "Hot" to RED
    }
    println(setOf(description, colour))
}