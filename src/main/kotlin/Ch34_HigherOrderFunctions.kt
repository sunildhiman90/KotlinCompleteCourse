//Higher-order functions in Kotlin are functions that can take other functions as parameters or return functions
//They are widely used in Kotlin for tasks like filtering collections, event handling, dependency injection, and more

// Kotlin's standard library provides useful higher-order functions like map, filter, reduce etc. for manipulating collections,
// which accept lambdas as parameters


fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun getMathOp(opName: String): (Int, Int) -> Int {
    return when(opName) {
        "add" -> { a, b -> a + b }
        "sub" -> { a, b -> a - b }
        "mul" -> { a, b -> a * b }
        else -> { _ , _ -> 0 }
    }
}

fun main() {

    val result = operateOnNumbers(10, 20) { a, b ->
        a + b
    }

    val result2 = operateOnNumbers(10, 20) { a, b ->
        a * b
    }

    println(result)
    println(result2)

    val op = getMathOp("add")

    println(op(2, 3))


}
