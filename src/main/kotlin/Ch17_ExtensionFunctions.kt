
fun String.greet(): String {
    return "Hello $this"
}

fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun main() {

    println("Kotlin".greet())
    println(1.isEven())
    println(2.isEven())
}



