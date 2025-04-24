
// Destructing Declarations:-
// Are used to unpack values from collections into variables

fun main() {

    val user1 = User("Alice", 30)

    val (name, _) = user1

    println(name)

}