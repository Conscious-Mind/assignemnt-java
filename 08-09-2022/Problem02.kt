import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.math.abs

fun main() {
    val current = LocalDateTime.now()

    val formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss")
    val formattedTime = current.format(formatterTime)

    val formatterSeconds = DateTimeFormatter.ofPattern("ss")
    var startingSeconds = current.format(formatterSeconds)
    println(formattedTime)
//    println(startingSeconds.toInt() - startingSeconds.toInt())
    while (true) {
        val current = LocalDateTime.now()
        var nowSeconds = current.format((formatterSeconds))
        if (abs(startingSeconds.toInt() - nowSeconds.toInt()) == 1) {
            startingSeconds = nowSeconds
            print(current.format(formatterTime))
        }
    }
}