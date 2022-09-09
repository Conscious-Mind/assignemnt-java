import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val current = LocalDateTime.now()

    val formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyy")
    val formattedDate = current.format(formatterDate)

    val formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss")
    val formattedTime = current.format(formatterTime)
    println("The current Date is: $formattedDate")
    println("The current Time is: $formattedTime")
}