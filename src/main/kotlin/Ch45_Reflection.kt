import kotlin.reflect.KClass

//Reflection:- Kotlin reflection is a feature that allows you to inspect and manipulate Kotlin classes, functions,
// properties, and other elements at runtime. It can be quite powerful but should be used as less as possible
// due to potential performance overhead and increased complexity
// We may need them(::class) in android in specific scenarios:  While using Intent, Services etc..

class YourClass(val name: String) {

    fun yourFun() {
        println(name)
    }
}

fun main() {

     val kcls: KClass<YourClass> = YourClass::class
     val cls: Class<YourClass> = YourClass::class.java

    val func = YourClass::yourFun


}