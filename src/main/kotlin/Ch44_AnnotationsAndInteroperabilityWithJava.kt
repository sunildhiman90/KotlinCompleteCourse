
// Kotlin annotations are a way to attach metadata to code elements like classes, functions, properties, and more.
// They can be used for various purposes, such as code generation, configuration, di etc..


//JvmField: Exposes a Kotlin property as a field to Java code without getter and setter

class KotlinInJavaExample {
    //If we dont use @JvmField annotation, it will show error in Java compiler while accesing value field on this class object

    @JvmField
    var value = 42

    fun testMes() {
        KotlinUtility.printMessage("test")
    }
}

//JvmStatic: Marks a method or property as static when accessed from Java.
object KotlinUtility {

    // Now we can use it in Java like this :
    // KotlinUtility.printMessage("Hello World!")
    // But if we dont use @JvmStatic annotation, it will show error in Java compiler

    @JvmStatic
    fun printMessage(message: String) {
        println(message)
    }
}


//Some other annotations such as @Deprecated and @Serializable are also available in Kotlin



