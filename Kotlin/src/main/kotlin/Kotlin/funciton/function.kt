package Kotlin.funciton

fun main(args: Array<String>) {
    val price1 = 100
    val price2 = 200
    val price3 = sumPrice(price1, price2)

    println(price3)
}
fun sumPrice(price1: Int, price2: Int): Int{
    val price = price1 + price2
    return price
}
//fun sumPrice(price1: Int, price2: Int): Int {
//    return price1 + price2
//}

//fun sumPrice(price1: Int, price2: Int): Int = price1 + price2
// price1, price2 둘 다 Int 타입 이기 때문에 return 생략 가능