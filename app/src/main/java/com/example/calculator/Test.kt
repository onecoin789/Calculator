//package com.example.calculator
//
//import android.graphics.BitmapRegionDecoder
//
//fun main() {
//    println("몇 마리를 생성하시겠습니까?")
//    var count = readLine()!!.toInt()
//    var birds = mutableListOf<Bird>()
//
//    for(idx in 0..count-1) {
//        println("조류의 이름을 입력해주세요")
//        var name = readLine()!!
//
//        // as Bird는 생략가능
//        birds.add(Sparrow(name) as Bird)
//    }
//    println("============조류 생성완료============")
//    for(bird in birds) {
//        bird.fly()
//    }
//}
//
//open class Bird(name: String) {
//    var name: String
//
//    init {
//        this.name = name
//    }
//
//    fun fly() {
//        println("${name}이름의 조류가 날아요~")
//    }
//}
//
//class Sparrow(name: String): Bird(name) {
//
//}
//
//
//
//
//
//
//
//
////    var stcNum1 = "10.25"
////    var strNum2 = "20"
////
////    var num1 = stcNum1.toDouble()
////    var num2 = strNum2.toInt()
////    var num3 = Integer.parseInt(strNum2)
////
////    println("${num1}")
////    println("${num2}")
////    println("${num3}")
////    var calc = Calc()
////
////
////
////    var add = calc.add(1, 5)
////    var moreAdd = calc.add(2, 6, 4)
////
////    println("${add}")
////    println("${moreAdd}")
////
////
////class Calc {
////    fun add(num1: Int, num2: Int): Int {
////        return num1 + num2
////    }
////    fun add(num1: Int, num2: Int, num3: Int): Int {
////        return num1 + num2 + num3
////    }
////}
////
////
////
////
////
////    var bird = Bird("꼬꼬", 2)
////    var chicken = Chicken("췩휜", 3)
////    var sparrow = Sparrow("짹짹이", 1,"파랑")
////    var pigeon = Pigeon("구구", 4, "대구")
////
////
////    bird.fly()
////    chicken.fly()
////    sparrow.fly()
////    pigeon.fly()
////
////
////
////open class Bird(name: String, age: Int) {
////    var name: String = ""
////    var age: Int = 0
////
////    init {
////        this.name = name
////        this.age = age
////    }
////
////    open fun fly() {
////        println("나이가 ${age}인 ${name} 날아요")
////    }
////}
////
////class Chicken(name: String, age: Int) :Bird(name, age) {
////
////
////    override fun fly() {
////        println("이름은 ${name}, 나이는 ${age}입니다")
////    }
////}
////class Sparrow(name:String, age: Int, color: String) : Bird(name, age) {
////    var color: String = ""
////    init {
////        this.color = color
////    }
////
////    override fun fly() {
////        println("이름은 ${name}, 나이는${age}, 색은 ${color}입니다")
////    }
////
////}
////class Pigeon(name: String, age: Int, address: String) : Bird(name, age) {
////    var address: String = ""
////    init {
////        this.address = address
////    }
////
////    override fun fly() {
////        println("이름은 ${name}, 나이는 ${age}, 주소는 ${address} 입니다")
////    }
////}