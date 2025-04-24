
// Strings are immutable, Each time we assign a new value to the variable, a new object is created

// StringBuilder and StringBuffer are mutable, so it can be changed in place


fun main() {


    val name: String = "Coding Ambitions"
    println(name)


    val multilineString = """
        Coding
        Ambitions
    """.trimIndent()
    println(multilineString)

    val escapedString = "This is an \"escaped\" string"
    println(escapedString)

    val country = "India"
    println("My name is $name and my country is $country")

    println("My name length is ${name.length}")


    //Useful methods
    println(name.length)
    println(name[0]) // C

    println(name.substring(0,7)) //from 0 to 6

    println(name.contains("coding"))
    println(name.contains("coding", ignoreCase = true))

    println(name.replace("Coding", "Kotlin"))
    println(name.uppercase())
    println(name.lowercase())


    println(name.isEmpty())
    println(name.isBlank())
    println(name.isNullOrBlank())
    println(name.isNullOrEmpty())

    //StringBuilder, and String Buffer

    val sb = StringBuilder("Hello")
    sb.append(" World", " Hi, Kotlin")
    sb.insert(0, "Hi ")
    println(sb)


    val sbuffer = StringBuffer("Hello")
    sbuffer.append(" World", " Hi, Kotlin")
    sbuffer.insert(0, "Hi ")
    println(sbuffer)





}