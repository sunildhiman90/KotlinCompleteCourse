// Inline Functions
// They are functions that are copied directly into their calling site

inline fun addInline(a: Int, b: Int): Int {
    return a + b
}

inline fun calculate(operation : () -> Unit) {
    return operation()
}

inline fun execute(crossinline block: () -> Unit) {
    println("before block")
    block() //returned from here
    println("after block")
}

fun main() {

    val result = calculate {
        10 + 20
    }

    execute {
        println("inside block")
    }

}
