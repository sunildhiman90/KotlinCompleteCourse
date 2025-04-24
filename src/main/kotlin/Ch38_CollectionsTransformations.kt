

fun main() {


    val list = listOf(1, 2, 3, 4)

    val firstElement = list.first()
    val nullableFirstElement = list.firstOrNull()
    println(firstElement)

    val lastElement = list.last()
    val lastElementNUllable = list.lastOrNull()
    println(lastElement)


    val filteredList = list.filter { item -> item % 2 == 0 }
    println(filteredList)


    val list2 = list.map { item -> item * 2 }
    println(list2)


    val groupBy = list.groupBy { item -> item % 2 == 0 }
    println(groupBy)


    val disList = list.distinct()
    println(disList)

    val sorList = list.sorted()
    println(sorList)


    val sorDescList = list.sortedDescending()
    println(sorDescList)

    val revList = list.reversed()
    println(revList)


    val assoc = list.associate {
        it to it * 2
    }
    println(assoc)

    val assocBy = list.associateBy {
        it % 2 == 0
    }
    println(assocBy)

    val assocWith = list.associateWith {
        it * 2
    }
    println(assocWith)


    val part = list.partition {
        it % 2 == 0
    }
    println(part.first)
    println(part.second)

    val str = list.joinToString(separator = " ", prefix = "<", postfix = ">")
    val str2 = list.joinToString(separator = " ", prefix = "<", postfix = ">") {
        (it*2).toString()
    }
    println(str)
    println(str2)

}
