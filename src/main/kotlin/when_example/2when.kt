package when_example

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    print("Введите целое число: ")
    val x = scanner.nextInt()
    val validNumbers = arrayOf(21, 22, 23)
    println("Доступные значения: " + validNumbers.joinToString())
    when (x) {
        in 1..10 -> print("x в диапазоне")
        in validNumbers -> print("x действительный")
        !in 10..20 -> print("x вне диапазона")
        else -> print("Ни одно из вышеперечисленного")
    }
}