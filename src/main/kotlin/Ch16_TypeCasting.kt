
//Type Casting: is a process of converting one type to another

fun main() {

    val obj: Any? = "Hello"


    val str: String = obj as String //not safe casting, might throw exception
    val str2: String? = obj as? String //safe casting

    val intVal = "56".toInt()


}
