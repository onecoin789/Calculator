package com.example.calculator

fun main() {
    var num1: Double = 0.0
    var oper: String = ""
    var num2: Double = 0.0
    var select: Int = 0
    var calc: Double = 0.0

    while (select != 3) {
        println("")
        println("원하시는 번호를 선택하세요")
        println("1.계산하기  2.1번 이어서 계산하기 3.종료하기")
        select = readln().toInt()

        if (select == 1) {
            println("첫번째 숫자를 입력하세요")
            num1 = readln().toDouble()
            println("연산자를 입력해주세요 ex | +, -, *, / |")
        } else if (select == 2) {
            num1 = calc
            println("")
            println("결과값은 ${calc}입니다")
            println("추가 연산자를 입력해주세요 ex| +, -, *, / |")
        } else if (select == 3) {
            println("종료합니다.")
            break
        }
        oper = readln()

        println("두번째 수를 입력하세요")
        num2 = readln().toDouble()

        when (oper) {
            "+" -> {
                calc = Calculator().addOperation(num1, num2)
            }

            "-" -> {
                calc = Calculator().substractOperation(num1, num2)
            }

            "*" -> {
                calc = Calculator().multiplyOperation(num1, num2)
            }

            "/" -> {
                calc = Calculator().divideOperation(num1, num2)
            }

            else -> "다시 입력해주세요"
        }
        println("${num1} ${oper} ${num2} = ${calc}입니다.")


    }
}