package for_example

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println("[" + array.joinToString() + "]")
    for ((index, value) in array.withIndex()) {
        println("the element at index $index is $value")
    }
}