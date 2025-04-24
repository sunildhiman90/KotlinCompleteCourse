
//Visibility Modifiers:- public, private, protected, internal
//internal: visible in the same module

//Default visibility: public, visible everywhere
//protected: only visible in the same package to subclasses of that class
//private: only visible in the same class

class Person {

    //Properties
    var name: String = ""
    var age: Int = 0


    //Method
    fun printInfo() {
        println("Name: $name, Age: $age")
    }



}


//Primary Constructor
class Person2(
    val name: String = "" ,
    val age: Int = 0
) {

    init {
        println("Person2 is created with name = $name and age = $age")
    }

    //Method
    fun printInfo() {
        println("Name: $name, Age: $age")
    }

}


//only 1 Primary Constructor
class Person3(
    private var name: String = "" ,
    private var age: Int = 0
) {

    init {
        println("Person3 is created with name = $name and age = $age")
    }

    constructor(
        name: String
    ): this() {

    }

    constructor(
        person2: Person2
    ): this() {
        this.age = person2.age
        this.name = person2.name

    }

    //Method
    fun printInfo() {
        println("Name: $name, Age: $age")
    }

}


fun main() {

    val person = Person()
    person.name = "User1"
    person.age = 17

    val person2 = Person2(name = "User2", 18)

    val person3 = Person3(name = "User3", 18)
    val person4 = Person3(person2)

    person.printInfo()
    person2.printInfo()
    person3.printInfo()
    person4.printInfo()



}

