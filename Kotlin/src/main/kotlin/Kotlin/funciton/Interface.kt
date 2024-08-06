package Kotlin.funciton

fun main(args: Array<String>) {
    val item = Item("연필", 1000)
    println("This name is ${item.name}, price is ${item.price}원")

    item.buy()
    item.sell()
}

class Item(
    val name: String,
    val price: Int
): ItemTrade {
    override fun buy() {
        println("[buy] $name")
    }

    override fun sell() {
        println("[sell] $name")
    }
}

interface ItemTrade{
    fun buy()
    fun sell()
}