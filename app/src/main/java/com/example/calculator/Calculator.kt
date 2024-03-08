package com.example.calculator

class Calculator(private val operator : Operator) {
    fun operate(num1:Double, num2:Double): Double {
        return operator.operate(num1, num2)
    }



}