// Generics:
// Use generics to create type-safe and reusable code. Generics allow you to define
// classes, interfaces, and functions with type parameters.
// Sometime we may need to write some code which may need to be used with any data types


class Repository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun delete(item: T) {
        items.remove(item)
    }

    fun getAll(): List<T> = items.toList()

}

data class SomeProduct(val id: Int, val name: String, val price: Double)

//star projections
fun getAllItems(repo: Repository<*>): List<*> {
    return repo.getAll()
}

fun <T: Comparable<T>> compare(repo: Repository<T>): List<T> {
    return repo.getAll()
}


fun main() {

    val product1 = SomeProduct(
        1, "Laptop", 200.0
    )

    val product2 = SomeProduct(
        2, "Laptop2", 200.0
    )

    val productRepo = Repository<SomeProduct>()
    productRepo.add(product1)
    productRepo.add(product2)

//    productRepo.getAll().forEach {
//        println(it)
//    }

    getAllItems(productRepo).forEach {
        println(it)
    }


    val userRepo = Repository<User>()
    userRepo.add(User("User1", 21))
    userRepo.add(User("User2", 11))

    userRepo.getAll().forEach {
        println(it)
    }

}

