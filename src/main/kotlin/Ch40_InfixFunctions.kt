// Infix Functions:-
// In Kotlin, infix functions are special types of member functions or extension functions that
// can be called using infix notation (without using the dot and parentheses).
// This makes the code more readable and expressive

infix fun Point.moveBy(offset: Point): Point {
    return Point(this.x + offset.x, this.y + offset.y)
}

fun main() {


    val pair = 1 to "One"
    println(pair)

    val point1 = Point(1, 3)
    val point2 = Point(2, 4)
    val point3 = point1 moveBy point2
    println(point3)

}
