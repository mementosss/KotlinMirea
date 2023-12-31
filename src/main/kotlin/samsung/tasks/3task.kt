package samsung.tasks

import java.util.*

fun countVowels(str: String): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    var count = 0

    for (char in str.lowercase(Locale.getDefault())) {
        if (char in vowels) {
            count++
        }
    }
    return count
}

fun main() {
    val str = "Hello, how are you?"
    val vowelCount = countVowels(str)
    println("Number of vowels: $vowelCount")
}