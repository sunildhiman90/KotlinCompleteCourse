//A data class must have at least one parameter in the primary constructor.
//data class Empty() //Not allowed

//Data classes cannot be abstract, open, sealed or inner
//data class User2(val name: String, val age: Int): User(name, age)

data class User(val name: String, val age: Int) {
    //custom
    override fun toString(): String {
        return "Name: $name, Age: $age"
    }
}

fun main() {

    val user1 = User("Alice", 30)
    val user2 = User("Alice", 30)

    println(user1 == user2)

    println(user1)

    val user3 = user1.copy()

    println(user1 == user3) //true
    println(user1 === user3) //false

    println(user3.component1())
    println(user3.component2())
}



