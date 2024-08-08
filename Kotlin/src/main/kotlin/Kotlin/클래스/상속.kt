package Kotlin.클래스

fun main() {

    var a = Animal("꼬꼬", 5, "비둘기")
    var b = Dog("별이", 5)
    var c = Cat("나비", 3)

    a.introduce()
    b.introduce()
    c.introduce()
    println()

    b.bark()
    c.meow()
}
//open 은 상속 할 수 있도록 해주는 키워드
// Animal 클래스는 수퍼 클래스
open class Animal (var name: String, var age: Int, var type: String) {
    fun introduce() {
        println("저는 ${type}, ${name}이고 ${age}살 입니다")
    }
}

//서브 클래스는 var, val을 파라미터에 붙이지 않음
//수퍼 클래스에 그대로 넘겨줌
class Dog(name: String, age: Int) : Animal (name, age, "개") {
    fun bark() {
        println("멍멍")
    }
}

class Cat(name: String, age: Int) : Animal (name, age, "고양이") {
    fun meow() {
        println("야옹야옹")
    }
}