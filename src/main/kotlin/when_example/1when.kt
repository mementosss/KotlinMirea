package when_example

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    print("Введите время: ")
    val hourOfDay = scanner.nextInt()
    val timeOfDay: String = when (hourOfDay) {
        0, 1, 2, 3, 4, 5 -> "Early morning"
        6, 7, 8, 9, 10, 11 -> "Morning"
        12, 13, 14, 15, 16 -> "Afternoon"
        17, 18, 19 -> "Evening"
        20, 21, 22, 23 -> "Late evening"
        else -> "Invalid"
    }
    println(timeOfDay)
}