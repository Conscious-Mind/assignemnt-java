import kotlin.math.abs

fun main() {
    print("The MRP of Product: ")
    val mrp =readln().toInt()
    print("The Buying Discount: ")
    val buyDis = readln().toDouble()
    print("The SellingPercent: ")
    val sellPer = readln().toDouble()

    val profit = calculateProfit(mrp, buyDis, sellPer)

    if (profit > 0)
        println("Customer get a profit of $profit")
    else
        println("Customer get a loss of $profit")
}

fun calculateProfit(mrpPrice: Int, buyDiscount: Double, sellingPer: Double): Double {

    val buyPrice = mrpPrice - (mrpPrice * (buyDiscount / 100))
    val sellingPrice = buyPrice + (buyPrice * (sellingPer / 100))

    return (mrpPrice - sellingPrice)
}