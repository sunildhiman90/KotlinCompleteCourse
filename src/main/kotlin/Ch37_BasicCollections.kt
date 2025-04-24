import kotlin.collections.mutableListOf

// Basic Collections
// In Kotlin, we have standard library functions for working with collections
// List
// Set
// Map


fun main() {

    val list = listOf<Int>(1, 2, 3, 1)
    //list.add()

    val mList = mutableListOf<Int>(1, 2, 3)
    mList.add(4)

    println(list)
    println(mList)


    val set = setOf<Int>(1, 2, 3, 1)
    //set.add()
    println(set)

    val mSet = mutableSetOf<Int>(1, 2, 3)
    mSet.add(6)
    println(mSet)


    val map = mapOf<Int, String>(
        1 to "ONe",
        2 to "Two",
        Pair(3, "Three")
    )
    //map.put
    println(map)

    val mMap = mutableMapOf<Int, String>(
        1 to "ONe",
        2 to "Two",
        Pair(3, "Three")
    )
    mMap.put(4, "Four")
    println(mMap)

}
