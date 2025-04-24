import kotlin.reflect.typeOf

// object keyword
// object keyword is used to create a companion object for creating static fields and methods of a class
// object keyword can be used to create a singleton
// object keyword can be used to create a factory function
// anonymous object can be created using the object keyword



object MySingleton {

    var name: String = "Singleton"

    fun printName() {
        println(name)
    }

}

class MyClass5 {

    val age = 5

    companion object {
        var name: String = "Singleton"

        fun printName() {
            println(name)
        }
    }

}





fun main() {

    println(MySingleton.name)
    MySingleton.printName()

    println(MyClass5.name)
    MyClass5.printName()

    val ob = MyClass5()
    println(ob.age)


    val anony = object : MyInterface {
        override fun abstractMethod() {
            println("testing object anonymous impl")
        }

        override val property: String
            get() = "Test"

    }

    anony.abstractMethod()

}