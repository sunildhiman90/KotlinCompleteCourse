// Two Ways to Create Arrays
// 1. Using the arrayOf function, 2. Using the Array constructor

fun main() {

    val names: Array<String> = arrayOf("Kotlin", "Java")
    println(names[0])
    println(names[1])


    val intArray = intArrayOf(1, 2, 3)
    println(intArray.contentToString())

    val zeroes = Array(10) { 0 }
    println(zeroes[0])
    zeroes[0] = 1
    println(zeroes[0])
    println(zeroes.contentToString())

    val intArray1 = IntArray(5) { 1 }
    println(intArray1.contentToString())

    val floatArray1 = FloatArray(5) { 1.0F }
    println(floatArray1.contentToString())


    //Useful methods
    println(names.first())
    println(names.last())
    println(names.size)
    println(names.indexOf("Java"))

    val copy1 = names.copyOf()

    println(copy1.contentToString())

    println(copy1.contains("Java"))
    println(intArray.sum())


}