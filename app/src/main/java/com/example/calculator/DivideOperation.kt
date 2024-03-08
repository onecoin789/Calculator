package com.example.calculator

class DivideOperation : Operator() {
    override fun operate(num1:Double, num2:Double): Double {
        require(num2 != 0.0) {
            ArithmeticException("Divide by Zero")
        }
        return  (num1 / num2).toDouble()
    }
}