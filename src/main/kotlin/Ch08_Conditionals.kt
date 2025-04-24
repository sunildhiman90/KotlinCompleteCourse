//ControlFlow/Conditionals: When we need to Control the flow of program

fun main() {

    val age = 15


    //if else as statement
    if (age >= 18) {
        println("Adult")
    } else {
        println("Not Adult")
    }

    //if else as expression
    val isAdult = if (age >= 18) true else false

    val number = 10
    if (number > 0) {
        println("Positive")
    } else if (number == 0) {
        println("zero")
    } else {
        println("Negative")
    }


    val day = 3
    when(day) {
        1 -> println("Mon")
        2 -> println("Tue")
        3 -> println("Wed")
        4 -> println("Thu")
        5 -> println("Fri")
        6 -> println("Sat")
        7 -> println("Sun")
    }

    val day1 = 3
    val stringDay = when(day1) {
        1 -> "Mon"
        2 -> "Tue"
        3 -> "Wed"
        4 -> "Thu"
        5 -> "Fri"
        6 -> "Sat"
        7 -> {
            print("Sun")
            "Sun"
        }
        else -> "None"
    }

    println(stringDay)




}