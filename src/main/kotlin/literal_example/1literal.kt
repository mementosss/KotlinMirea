package literal_example

fun main(){
    val i = 10
    val a = "i = $i" // evaluates to "i = 10"

    val s = "abc"
    val str = "$s.length is ${s.length}" // evaluates to "abc.length is 3"

    val price = "${'$'}9.99"
    println(a + "\n" + str + "\n" + price)
}