package Kotlin.funciton

fun main(args: Array<String>) {
    val item = Item_("연필", 1000)
    println("This name is ${item.name}, price is ${item.price}")
}
class Item_(
    val name: String,
    val price: Int
)