package Kotlin.base

fun main(args: Array<String>) {
    val price: Int? = null

    if (price == null)
        println("null check ture")
    else
        println("price = $price")
}