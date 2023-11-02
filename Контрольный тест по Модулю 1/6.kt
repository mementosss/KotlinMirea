fun binom(n: Int, k: Int): Int {
    if (n == k || k == 0) return 1
    if (k == 1) return n
    return binom(n - 1, k - 1) + binom(n - 1, k)
}
fun main() {
    val n = 5
    val k = 2
    val result = binom(n, k)
    println("Результат: $result")
}