package com.example.calculator

fun main() {
    println("첫번째 숫자를 입력해주세요.")
    var num1 = readLine()!!.toInt()
    println("연산자를 입력해주세요.")
    var oper = readLine().toString()
    println("두번째 숫자를 입력해주세요.")
    var num2 = readLine()!!.toInt()

    val choice =
        when (oper) {
            "+" -> num1 + num2//AddOperation.()
            "-" -> num1 - num2//SubstractOperation.()
            "*" -> num1 * num2//MultiplyOperation()
            "/" -> num1 / num2//DivideOperation()
            else -> "다시 입력해주세요"
        }
    println("${num1} ${oper} ${num2} = ${choice}")
}


//open class Calculator {
//    var num1: Int = 0 // num1 값 받아오는 변수
//    var oper: String = "" // oper 값 받아오는 변수
//    var num2: Int = 0 // num2 값 받아오는 변수
//    val choice =  // 연산자에 따라 하위 클래스로 보내주기
//        when (oper) {
//            "+" -> num1 + num2//AddOperation.() // 더하기 클래스로
//            "-" -> num1 - num2//SubstractOperation.() // 빼기 클래스로
//            "*" -> num1 * num2//MultiplyOperation() //곱하기 클래스로
//            "/" -> num1 / num2//DivideOperation() // 나누기 클래스로
//            else -> "다시 입력해주세요" //연산자가 잘못 입력될 경우
//        }
//
//
//    constructor(_num1: Int, _oper: String, _num2: Int) { //부 연산자
//
//        num1 = _num1
//        oper = _oper
//        num2 = _num2
//    }
//}
//
//class AddOperation(_num1: Int, _oper: String, _num2: Int) : Calculator(_num1, _oper, _num2) {
//    fun add() {
//        var add = (num1 + num2)
//        println("${num1} ${oper} ${num2} = ${add}")
//    }
//}
//
//class SubstractOperation(_num1: Int, _oper: String, _num2: Int) :
//    Calculator(_num1, _oper, _num2) {
//    fun sub() {
//        var sub = (num1 - num2)
//        println("${num1} ${oper} ${num2} = ${sub}")
//    }
//}
//
//class MultiplyOperation(_num1: Int, _oper: String, _num2: Int) :
//    Calculator(_num1, _oper, _num2) {
//    fun multi() {
//        var multi = (num1 * num2)
//        println("${num1} ${oper} ${num2} = ${multi}")
//    }
//}
//
//class DivideOperation(_num1: Int, _oper: String, _num2: Int) : Calculator(_num1, _oper, _num2) {
//    fun divid() {
//        var divid = (num1 / num2)
//        println("${num1} ${oper} ${num2} = ${divid}")
//    }
//}


