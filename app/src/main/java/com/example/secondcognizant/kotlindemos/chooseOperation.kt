package com.example.secondcognizant.kotlindemos

fun chooseOperation(operation: String): (Int, Int) -> Int {
    return when (operation) {
        "add" -> { a, b -> a + b }
        "subtract" -> { a, b -> a - b }
        "multiply" -> { a, b -> a * b }
        else -> { _, _ -> 0 }
    }
}

fun main() {
    val addOperation = chooseOperation("add")
    println("Add: ${addOperation(10, 5)}")

    val subtractOperation = chooseOperation("subtract")
    println("Subtract: ${subtractOperation(10, 5)}")

    val multiplyOperation = chooseOperation("multiply")
    println("Multiply: ${multiplyOperation(10, 5)}")

    val unknownOperation = chooseOperation("divide")
    println("Unknown: ${unknownOperation(10, 5)}")  // Will return 0
}
