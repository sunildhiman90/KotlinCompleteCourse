// Kotlin Sequences are a powerful feature for handling collections in a more efficient
// and lazy way compared to traditional collections


//Benefits:
//Lazy Processing: : Sequences process elements one at a time, so they don’t need to build intermediate collections
// for each step of the transformation chain.

//Performance:
// Because of lazy evaluation, sequences can be more memory-efficient and faster for certain operations,
// especially when dealing with large data sets or complex pipelines.

fun main() {

    val numbers = sequenceOf(1, 2, 3)
    println(numbers.toList())

    val numbers2 = listOf(4, 5, 7).asSequence()
    println(numbers2.toList())

    val result = numbers
        .filter {
            it % 2 == 0
        }.map {
            it * it
        }

    




}