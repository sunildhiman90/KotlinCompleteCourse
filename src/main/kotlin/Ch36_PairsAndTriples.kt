// Pair and Triple are data classes used to store two and three values respectively.
// They are useful when you need to return multiple values from a function or
// when you need a simple structure to group values together.

fun main() {

    val pair = Pair(1,  "one")
    val pair2 = 2 to "Two"
    println(pair.first)
    println(pair.second)

    println(pair2.first)
    println(pair2.second)

    val triple = Triple(1,  "one", 1.0)
    println(triple.first)
    println(triple.second)
    println(triple.third)



}
