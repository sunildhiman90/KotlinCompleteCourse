
// Operator Functions:
// Kotlin operator functions allow you to define custom behavior for operators like +, -, *, /, [], ==, etc., in your classes.
// They make it possible to use these operators with your custom types in a more intuitive and readable way.

data class Point(val x: Int, val y: Int) {

    operator fun plus(other: Point): Point {
        return Point(x = x + other.x, y = y + other.y)
    }

    operator fun minus(other: Point): Point {
        return Point(x = x - other.x, y = y - other.y)
    }

    operator fun times(scaler: Int): Point {
        return Point(x = x * scaler, y = y * scaler)
    }



}

fun main() {

    val point = Point(1, 3)
    val point2 = Point(3, 6)

    val point3 = point + point2
    val point4 = point3 * 4
    println(point3.x)
    println(point3.y)
    println(point4)

}

//Arithmetic Operator functions:
//plus: +
//minus: -
//times: *
//div: /
//rem: %
//unaryPlus: +a
//unaryMinus: -a
//inc: ++
//dec: --

//Comparison Operator functions:
//compareTo: <, >, <=, >=
//equals: ==, !=


//Collection-like Operator functions:
//get: a[i]
//set: a[i] = b
//contains: in
//iterator: for (a in b)


//Other Useful Operator functions:
//invoke: a()
