//Type Checking and Smart Casts
//Type Checking: is a process of checking if a variable is of a certain type
//Smart Casts: is a process of casting a variable to a certain type


fun main() {

    println(typeChecker("CodingAmbitions"))
    println(typeChecker(5))

}

fun typeChecker(obj: Any) {
    when(obj) {
        is String -> {
            //smart casted to String
            println("obj is String && its length is ${obj.length}")
        }
        is Int -> {
            //smart casted to Int
            println("obj is Int")
        }
    }
}