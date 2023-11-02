abstract class Text {
    abstract fun letters(): Int

    fun isTextTooBig(): Boolean {
        return letters() >= 100500
    }
}

internal class Book(val pages: Int) : Text() {
    override fun letters() = pages * 1000
}

fun main() {
    println(Book(1001).isTextTooBig())
    println(Book(1).isTextTooBig())
}