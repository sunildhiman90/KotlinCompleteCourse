// Delegation
// It is used to delegate properties and methods to another object


interface Sound {
    fun makeSound()
}


class Dog: Sound {
    override fun makeSound() {
        println("Bark")
    }
}


class Cat: Sound {
    override fun makeSound() {
        println("Meow")
    }
}

class PetShop(private val sound: Sound) : Sound by sound

class Example {
    val lazyValue: String by lazy {
        println("computed")
        "hello"
    }
}

fun main() {

    val dog = Dog()
    val cat = Cat()

    val petShopDog = PetShop(dog)
    val petShopCat = PetShop(cat)

    petShopCat.makeSound()
    petShopDog.makeSound()

}
