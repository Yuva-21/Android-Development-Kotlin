// Classes and Primary constructors

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

     Initializer Blocks

    var user = User("Alex","Malone",21)

    var friend = User("Jack","Sollof", 32)

    println(user.name)
    println(friend.name)
}

    class User(var name: String, var lastName: String, var age: Int) {

        init {
            if (name.lowercase().startsWith("a")){

                this.name = name

            }else{
                this.name = "User"
            }
        }


    var user = User("Alex", "Malone", 21)

    var friend = User("Jack", "Sollof", 32)


}

class User(var name: String, var lastName: String, var age: Int) {

}

