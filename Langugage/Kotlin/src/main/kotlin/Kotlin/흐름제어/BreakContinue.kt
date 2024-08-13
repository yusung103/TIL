package Kotlin.흐름제어

fun main() {
    for (i in 1..10) {
        if (i == 3) break
        println(i)
    }
println()

    for (i in 1..10) {
        if (i == 3) continue
        println(i)
    }
println()

    // 다중 for문에서도 @를 통해 제어 가능
    loop@for (i in 1..10) {
        for (j in 1..10) {
            if (i == 1 && j == 5) break@loop
            println("i = $i j = $j")
        }
    }
println()

    loop@for (i in 1..2){
        for (j in 1..5){
            if (i == 1 && j == 3) continue@loop
            println("i = $i j = $j")
        }
    }
}