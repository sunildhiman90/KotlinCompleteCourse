// Null safety is a crucial feature in programming languages like Kotlin
// that helps prevent null pointer exceptions at runtime

//Variables in Kotlin are non-nullable by default, to make a variable nullable
// we use the ? symbol

fun main() {


    var nullableString: String? = null

    val length = nullableString?.length ?: 0
    println("length of nullableString is $length")

    if (nullableString != null) {
        val length = nullableString!!.length
    }
    
    val obj: Any = "Hello"
    val stringLenght = obj as? String










}