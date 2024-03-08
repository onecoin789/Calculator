package com.example.calculator

fun main() {

}







//    var calc = Calc()
//
//    var add = calc.add(1, 5)
//    var moreAdd = calc.add(2, 6, 4)
//
//    println("${add}")
//    println("${moreAdd}")
//
//
//class Calc {
//    fun add(num1: Int, num2: Int): Int {
//        return num1 + num2
//    }
//    fun add(num1: Int, num2: Int, num3: Int): Int {
//        return num1 + num2 + num3
//    }
//}
//
//
//
//
//
//    var bird = Bird("꼬꼬", 2)
//    var chicken = Chicken("췩휜", 3)
//    var sparrow = Sparrow("짹짹이", 1,"파랑")
//    var pigeon = Pigeon("구구", 4, "대구")
//
//
//    bird.fly()
//    chicken.fly()
//    sparrow.fly()
//    pigeon.fly()
//
//
//
//open class Bird(name: String, age: Int) {
//    var name: String = ""
//    var age: Int = 0
//
//    init {
//        this.name = name
//        this.age = age
//    }
//
//    open fun fly() {
//        println("나이가 ${age}인 ${name} 날아요")
//    }
//}
//
//class Chicken(name: String, age: Int) :Bird(name, age) {
//
//
//    override fun fly() {
//        println("이름은 ${name}, 나이는 ${age}입니다")
//    }
//}
//class Sparrow(name:String, age: Int, color: String) : Bird(name, age) {
//    var color: String = ""
//    init {
//        this.color = color
//    }
//
//    override fun fly() {
//        println("이름은 ${name}, 나이는${age}, 색은 ${color}입니다")
//    }
//
//}
//class Pigeon(name: String, age: Int, address: String) : Bird(name, age) {
//    var address: String = ""
//    init {
//        this.address = address
//    }
//
//    override fun fly() {
//        println("이름은 ${name}, 나이는 ${age}, 주소는 ${address} 입니다")
//    }
//}