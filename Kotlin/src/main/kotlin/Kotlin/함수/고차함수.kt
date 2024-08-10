package Kotlin.함수

fun a(str: String) {
    println("$str 함수 a")
}
fun b(function: (String) -> Unit) {
    function("b가 호출한")
}
fun main() {
    b(::a)
    val c: (String) -> Unit = {
            str -> println("$str 람다함수")
    }

    val d: (String) -> Unit = {
        str -> println("$str 함수 d")
    }

    b(c)
    b(d)
    println()

    twoAndThree() {a, b -> a + b}
    twoAndThree() {a, b -> a * b}
}

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2,3)
    println("The result is $result")
}


