//Ranges: A range is a set of values

fun main() {

    val range1 = 1..10

    for (item in range1) {
        println(item)
    }


    for (item in 1..15) {
        //println(item)
    }


    for (item in 1..15 step 2) {
        println(item)
    }


    //open range
    for (item in 1 until  15 step 2) {
        println(item)
    }


    for (item in 15 downTo 1 step 2) {
        println(item)
    }

    val charRange = 'a'..'z'

    for (char in charRange) {
        println(char)
    }

}