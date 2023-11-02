import kotlin.random.Random

fun generateStrongPass(len: Int): String {
    var s = ""
    val charsUp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val charsLow = "abcdefghijklmnopqrstuvwxyz"
    val charsDig = "0123456789"
    val all = charsUp + charsLow + charsDig

    var smallLetters = 0
    var bigLetters = 0
    var digits = 0

    val rnd = Random

    while (s.length < len || bigLetters < 1 || smallLetters < 1 || digits < 1) {
        val c = all[rnd.nextInt(all.length)]
        when (c) {
            in charsUp -> bigLetters++
            in charsLow -> smallLetters++
            in charsDig -> digits++
        }
        s += c
    }

    return s
}

fun main() {
    val passwordLength = 10 // Здесь можно указать желаемую длину пароля
    val password =generateStrongPass(passwordLength)
    println("Сгенерированный пароль: $password")
}