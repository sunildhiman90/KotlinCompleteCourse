
fun main() {

    val fruits = arrayOf("banana", "apple", "mango")

    //for -in
    for (item in fruits) {
        println(item)
    }


    //for -in
    for ((index, item) in fruits.withIndex()) {
        if (index == 1) continue //skip the iteration
        println("item at index $index is $item")
    }

    var i = 10
    while (i > 5) {
        println(i)
        i--
    }


    i = 10
   do {
       println(i)
       i--
   } while (i > 5)

   i = 10
   while (true) {
       println(i)
       i--
       if (i == 2) break
   }




}