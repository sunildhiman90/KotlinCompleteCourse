//Enum Classes: Enum classes are used to define a set of constants
//Enum classes can have properties and methods
//Enum classes cannot be abstract, open, sealed
enum class Direction(private val degrees: Int) {

    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(360);

    fun description(): String {
        return "Direction is $name and degrees are $degrees"
    }

}

fun main() {

    val direction = Direction.EAST
    println(direction.description())

    println(direction.name)
    println(direction.ordinal)

    //after kotlin 1.9.0
    for(dir in Direction.entries) {
        println(dir)
    }

    for(dir in Direction.values()) {
        println(dir)
    }

}

