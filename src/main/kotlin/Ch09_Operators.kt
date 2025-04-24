
//Operators: Are used to perform mathematical or boolean operations on two or more variables
//Arithmetic Operators: +, -, *, /, %
//Comparison Operators: <, >, <=, >=
//Logical Operators: &&, ||, !


fun main() {

    val a = 10
    val b = 5
    val sum = a + b
    val diff = a - b
    val mul = a * b
    val div = a / b
    val mod = 7 % 2

    println(sum)
    println(div)
    println(diff)
    println(mul)
    println(mod)


    var num = 4
    println(num++)
    println(++num)
    println(--num)

    println("a > b = ${a > b}")
    println("a < b = ${a < b}")
    println("a <= b = ${a <= b}")
    println("a >= b = ${a >= b}")

    //Assignment oper
    var d = 20
    d = d + 5
    d += 5

    //logical
    val var1 = false
    val var2 = true
    println("a < b && b < 6 = ${a < 5 && b < 6}")
    println("var1 && var2 = ${var1 && var2}")
    println("var1 || var2 = ${var1 || var2}")
    println("!var2 = ${!var2}")


}