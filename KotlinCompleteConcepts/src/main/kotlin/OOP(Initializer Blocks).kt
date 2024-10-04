// Initializer Blocks

fun main() {
    var user = User("Alex", "Malone", 21)

    var friend = User("Jack", "Sollof", 32)

    println(user.name)
    println(friend.name)
}


class User(var name: String, var lastName: String, var age: Int) {

    init {
        if (name.lowercase().startsWith("a")) {

            this.name = name

        } else {
            this.name = "User"
        }

    }

}