// Classes and Primary constructors

class Car(var name: String, var model: String, var year: Int) {

    fun move() {
        println("the $name is moving")
    }
    fun stop(){
        println("the $name is stopped")
    }
}

fun main() {

    val car1 = Car("Audi   ", "A8", 2018)

    println(car1.name)
    println(car1.model)
    println(car1.year)

    car1.move()
    car1.stop()

    val car2 = Car("Nissan", "GTR", 2015)

    println("\n")

    println(car2.name)
    println(car2.model)
    println(car2.year)

    car2.move()
    car2.stop()
}