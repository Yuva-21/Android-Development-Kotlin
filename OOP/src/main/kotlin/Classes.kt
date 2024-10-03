class Car(name: String, var model: String, var year: Int) {

    var name = name.trim()               // to remove unintended spaces in the variables of class Car

    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name is stopped")
    }
}