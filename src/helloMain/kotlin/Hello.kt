package sample.hello

fun hello(): String = "Hello, Kotlin/Native!"

fun main() {
    val a = 43
    val b = listOf(1, 2, 3)
    println("$a: $b: " + hello())
}
