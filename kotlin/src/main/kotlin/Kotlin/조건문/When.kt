package Kotlin.조건문

fun main() {
    doWhen(1)
    doWhen("Yuseong")
    doWhen(12L)
    doWhen(3.141592)
    doWhen("Kotlin")
}

fun doWhen(a: Any) {
//    when(a) {
//        1 -> println("정수 1 입니다")
//        "Yuseong" -> println("이름 입니다")
//        is Long -> println("Long 타입 입니다")
//        !is String -> println("String 타입이 아닙니다")
//        else -> println("어떠한 조건도 만족하지 않습니다")
//    }
    var result = when(a){
        1 -> "정수 1 입니다"
        "Yuseong" -> "이름 입니다"
        is Long -> "Long 타입 입니다"
        !is String -> "String 타입이 아닙니다"
        else -> "어떠한 조건도 만족하지 않습니다"
    }
    println(result)
}