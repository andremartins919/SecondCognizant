package com.example.secondcognizant.kotlindemos

fun composeFunctions(f: (Int) -> Int, g: (Int) -> Int): (Int) -> Int {
    return { x -> f(g(x)) }
}

fun increment(x: Int) = x + 1
fun double(x: Int) = x * 2

fun main() {
    val incrementThenDouble = composeFunctions(::double, ::increment)
    println("Increment then double: ${incrementThenDouble(3)}")  // (3 + 1) * 2 = 8

    val doubleThenIncrement = composeFunctions(::increment, ::double)
    println("Double then increment: ${doubleThenIncrement(3)}")  // (3 * 2) + 1 = 7
}
