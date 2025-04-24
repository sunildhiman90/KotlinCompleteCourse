
//Exceptions: An exception is an error, which occurs during the execution of a program
//Exception Handling: We can handle exceptions with try-catch block

fun main() {


    try {
        val result = 10 / 2
    } catch (e: Exception) {
        println("Exception: ${e.message}")
    }


    try {
        val data = "123a"
        val number = data.toInt()
        println(number)
    } catch (e: ArithmeticException) {
        println("Exception Detail: ${e}")
    } catch (e: Exception) {
        println("Exception: ${e}")
    } finally {
        println("It will always be executed")
    }

    //Custom Exception

    class InvalidInputException(message: String) : Exception(message)

}
