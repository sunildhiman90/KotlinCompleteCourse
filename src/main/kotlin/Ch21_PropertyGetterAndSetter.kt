


class Person4 {

    var name: String = "John"
        get() = field.uppercase() //custom getter

    var age: Int = 0
        set(value) {
            if(value >= 0) {
                field = value
            } else {
                throw IllegalArgumentException("Age cannot be nagative")
            }
        }
}

fun main() {


    val person = Person4()
    person.age = 25
    println(person.age)

    person.name = "john" //setter method will called
    println(person.name) //getter method will be called




}