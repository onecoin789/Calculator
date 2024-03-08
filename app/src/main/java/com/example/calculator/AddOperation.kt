package com.example.calculator

class AddOperation : Operator() {
    override fun operate(num1: Double, num2: Double): Double = (num1 + num2).toDouble()
}