package com.example.calculator

class Calculator {
    fun addOperation(num1: Double, num2: Double): Double = AddOperation().addOperation(num1, num2)

    fun substractOperation(num1: Double, num2: Double): Double = SubstractOperation().substractOperation(num1, num2)

    fun multiplyOperation(num1: Double, num2: Double): Double = MultiplyOperation().multiplyOperation(num1, num2)

    fun divideOperation(num1:Double, num2:Double): Double = DivideOperation().divideOperation(num1, num2)



}