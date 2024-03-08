package com.example.calculator

class MultiplyOperation : Operator() {
    override fun operate(num1: Double, num2: Double): Double = (num1 * num2).toDouble()
}