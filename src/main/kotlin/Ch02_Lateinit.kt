// lateinit variables
// Non-nullable variable that will be initialized later.
// Cannot be used with Primitive types in Kotlin: Byte, Short, Int, Long, Float, Double, Char, and Boolean

fun main() {

    val example = LateinitExample()
    example.initializeName()
    example.printName()
}


class LateinitExample {
    lateinit var name: String

    fun initializeName() {
        name = "Kotlin"
    }

    fun printName() {
        if (::name.isInitialized) {
            println(name)
        }
    }
}


