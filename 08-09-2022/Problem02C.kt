import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.*

fun main() {
//    val current = LocalDateTime.now()

    val formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss")
//    val formattedTime = current.format(formatterTime)

    val t = Timer()
    t.schedule(object : TimerTask() {
        override fun run() {
            val current = LocalDateTime.now()
            println(current.format(formatterTime))
        }
    }, 0, 1000)
}