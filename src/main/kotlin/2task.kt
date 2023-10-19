fun main() {
    val dnaString = readlnOrNull()
    val counts = IntArray(4)
    dnaString?.forEach { nuc ->
        when (nuc) {
            'A' -> counts[0]++
            'T' -> counts[1]++
            'G' -> counts[2]++
            'C' -> counts[3]++
        }
    }
    val result = counts.joinToString(" ")
    println(result)
}