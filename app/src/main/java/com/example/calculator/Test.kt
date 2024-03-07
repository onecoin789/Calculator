package com.example.calculator

import java.lang.NumberFormatException

fun main() {
    var num1: Double = 0.0
    var oper: String = ""
    var num2: Double = 0.0
    var select: Int = 0
    var result: Double = 0.0

    while (select != 3) {
        try {
            println("")
            println("원하시는 번호를 선택하세요")
            println("1.계산하기  2.1번 이어서 계산하기 3.종료하기")
            select = readln().toInt()
        } catch (e:NumberFormatException) {
            println("")
            println("정확하게 입력해주세요")
            continue
        }

        try {
            if (select == 1) {
                println("첫번째 숫자를 입력하세요")
                num1 = readln().toDouble()
                println("연산자를 입력해주세요 ex | +, -, *, / |")
            }
        } catch (e:NumberFormatException) {
            println("")
            println("숫자를 입력해주세요")
            continue
        }

        try {
            if (select == 2) {
                num1 = result
                println("")
                println("결과값은 ${result}입니다")
                println("추가 연산자를 입력해주세요 ex| +, -, *, / |")
            }
        } catch (e: NumberFormatException) {
            println("")
            println("숫자를 입력해주세요")
            continue
        }

        if (select == 3) {
            println("종료합니다.")
            break
        }
        oper = readln()

        try {
            println("두번째 숫자를 입력하세요")
            num2 = readln().toDouble()
        } catch (e:NumberFormatException) {
            println("")
            println("숫자를 입력해주세요")
            continue
        }


        when (oper) {
            "+" -> {
                result = Calculator().addOperation(num1, num2)
            }

            "-" -> {
                result = Calculator().substractOperation(num1, num2)
            }

            "*" -> {
                result = Calculator().multiplyOperation(num1, num2)
            }

            "/" -> {
                result = Calculator().divideOperation(num1, num2)
            }

            else -> "다시 입력해주세요"
        }
        println("${num1} ${oper} ${num2} = ${result}입니다.")


    }
}