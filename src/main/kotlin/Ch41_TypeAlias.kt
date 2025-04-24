
// Typealias:
// typealias is a keyword used to create an alias for an existing type. This can make code more readable and concise
// by providing a more meaningful name for a complex or less descriptive type.

//Usecases:
// 1. Simplifying the type names
// 2. Complex Generic Types
// 3. Function Types


typealias UserId = String

typealias StringMap = Map<String, String>

typealias ClickHandler = (Int) -> Unit

fun setClickHandler(handler: ClickHandler) {
  handler(5)
}

fun main() {

    val userId: UserId = "5"


    val stringMap: StringMap = mapOf("1" to "one")

    val clickHandler: ClickHandler = {
        println("Handling click event")
    }
    setClickHandler(clickHandler)

    setClickHandler {
        println("Handling click event2")
    }

}