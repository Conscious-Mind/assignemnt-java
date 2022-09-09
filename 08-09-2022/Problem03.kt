fun main() {
    print("Input Number: ")
    val number = readLine()!!
    val num1 = number.slice(0..1).toInt()
    val num2 = number.slice(2..3).toInt()


    if (((num1 + num2)*(num1 + num2)) == number.toInt())
        println("The number $number is a fashion number")
    else
        println("The number $number is not a fashion number")
}
