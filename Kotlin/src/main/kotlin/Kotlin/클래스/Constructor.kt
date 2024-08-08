package Kotlin.클래스

fun main() {
    var a = Constructor("박보영", 1990)
    var b = Constructor("전정국", 1997)
    var c = Constructor("장원영", 2004)

    var d = Constructor("이루다")
    var e = Constructor("차은우")
    var f = Constructor("류수정")

}
class Constructor (var name: String, var birthYear: Int){
    init {
        println("${this.birthYear}년생 ${this.name}님이 생성됨")
    }

    constructor(name:String) : this(name, 1997) {
        println("보조 생성자 생성됨")
    }
}