package Kotlin.클래스

var a: String = "패키지 스코프"

class A() {
    fun print() {
        println(a)
    }
}
class B() {
    var a: String = "클래스 스코프"
    fun print() {
        println(a)
    }
}

fun main() {
    val a: String = "함수 스코프"

    A().print()
    B().print()
    println(a)
}