// By default, all classes in Kotlin are final, we can't inherit from them
// To inherit from a class, we use the keyword "open"
// Similarly functions and properties are also final by default
// To override a function or property, we use the keyword "open"

open class Vehicle(
    private val name: String,
    private val speed: Int,
) {

    open fun displayInfo() {
        println("Vehicle Name: ${this.name}")
        println("Vehicle Speed: ${this.speed}")
    }

}

class Car(
    private val name: String,
    private val speed: Int,
    private val numOfDoors: Int,
) : Vehicle(
    name,
    speed
) {

    override fun displayInfo() {
        super.displayInfo()
        println("numOf Doors: ${this.numOfDoors}")
    }

}


fun main() {

    val car = Car(
        "Toyota", 200, 4
    )
    car.displayInfo()
}

