
// Any: Used to represent any type of value, parent of all types
// Nothing: Used to represent a value that does not exist, Subtype/child of all types

fun main() {


    val obj: Any = "Hello"

    val str1: String? = obj as? String
    val str2: String = obj as String

     val result = try {
         fail("any error")
     } catch (e: IllegalArgumentException) {
         println(e.stackTrace)
     }


}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}
