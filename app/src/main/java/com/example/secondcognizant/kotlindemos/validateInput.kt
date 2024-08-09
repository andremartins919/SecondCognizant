package com.example.secondcognizant.kotlindemos

fun validateInput(input: String, validator: (String) -> Boolean): Boolean {
    return validator(input)
}

fun isNotEmpty(input: String) = input.isNotEmpty()
fun isEmail(input: String) = input.contains("@") && input.contains(".")

fun main() {
    val email = "test@example.com"
    val emptyString = ""

    // Validate non-empty string
    val isEmptyValidation = validateInput(emptyString, ::isNotEmpty)
    println("Is not empty: $isEmptyValidation")  // false

    // Validate email format
    val isEmailValidation = validateInput(email, ::isEmail)
    println("Is valid email: $isEmailValidation")  // true
}
