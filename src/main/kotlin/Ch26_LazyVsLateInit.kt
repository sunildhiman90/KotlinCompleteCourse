// Lazy vs lateinit
// Lazy: Delayed initialization of properties
// lateinit: Non-nullable variable that will be initialized later.


class LazyVsLateInit {
    lateinit var userLateInit: User //android views

    val userLazy: User by lazy {
        User("Coding", 4)
    }

}

fun main() {

    val obj = LazyVsLateInit()
    //println(obj.userLateInit)
    obj.userLateInit = User("Name", 1)
    println(obj.userLateInit)

    println(obj.userLazy)

}
