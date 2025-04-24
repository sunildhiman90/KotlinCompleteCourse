
//Simple Function Structure: fun keyword is used to define a function
//fun functionName(parameter1: Type1, parameter2: Type2, ...): ReturnType {
//    // function body
//}


fun main() {

    println(add(5, 6))
    printMessage("Test message")
    println(multiply(5, 6))
    printMessage2(message = "test")
    println(sumWithVararg(5, 6, 7, 7))

}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun printMessage(message: String) {
    println(message)
}


fun multiply(a: Int, b: Int) = a * b


fun printMessage2(message: String = "Default Message") {
    println(message)
}


fun sumWithVararg(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}