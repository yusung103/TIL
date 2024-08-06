package Kotlin.base

fun main(args: Array<String>) {
    val price = 100

    if (price in arrayOf(100, 200, 300))
        println("contain")
    else
        println("not contained")
}