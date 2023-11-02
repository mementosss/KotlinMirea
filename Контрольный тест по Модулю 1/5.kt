fun main() {
    val password = readLine() ?: ""
    val uppercaseCount = password.count { it.isUpperCase() }
    val lowercaseCount = password.count { it.isLowerCase() }
    val digitCount = password.count { it.isDigit() }
    val specialCharCount = password.count { it.isLetterOrDigit().not() }

    println("$uppercaseCount $lowercaseCount $digitCount $specialCharCount")
}