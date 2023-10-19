fun main() {
    val input = readlnOrNull()?.split(" ")
    val a = input?.get(0)?.toDoubleOrNull()
    val b = input?.get(1)?.toDoubleOrNull()
    val m = input?.get(2)?.toDoubleOrNull()
    val n = input?.get(3)?.toDoubleOrNull()

    if (a != null && b != null && m != null && n != null) {
        if ((m <= a && n <= b) || (m <= b && n <= a)) {
            println("YES")
        } else {
            println("NO")
        }
    }
}