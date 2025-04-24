
interface MyInterface {

    fun abstractMethod() //abstract method

    fun concreteMethod() {
        println("This is a concrete method 1")
    }

    val property: String
    val propertyWithDefault: String
        get() = "Default"

}


class MyClass : MyInterface {
    override fun abstractMethod() {
        println("Abstract method implemented")
    }

    override val property: String = "Property value"

}



interface MyInterface2 {

    fun concreteMethod() {
        println("This is a concrete method")
    }

}

class MyClass2 : MyInterface, MyInterface2 {
    override fun abstractMethod() {
        println("Abstract method implemented")
    }

    override fun concreteMethod() {
        super<MyInterface>.concreteMethod()
    }
    override val property: String = "Property value"

}


fun main() {

    val obj = MyClass()
    obj.abstractMethod()
    obj.concreteMethod()
    println(obj.property)
    println(obj.propertyWithDefault)


    val obj2 = MyClass2()
    obj2.abstractMethod()
    obj2.concreteMethod()
    println(obj2.property)
    println(obj2.propertyWithDefault)


}