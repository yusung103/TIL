package Kotlin.반복문

fun main() {
    for (i in 0..9){
        print(i)
        print(" ")
    }
    println()

    // downTo는 거꾸로
    for (i in 9 downTo  0) {
        print(i)
        print(" ")
    }
    println()

    //문자열에도 가능
    for (i in 'a'..'e') {
        print(i)
        print(" ")
    }
    println()

    // 3씩 증가
    // step은 downTo, char 등 가능
    for (i in 0 .. 9 step 3) {
        print(i)
        print(" ")
    }
}