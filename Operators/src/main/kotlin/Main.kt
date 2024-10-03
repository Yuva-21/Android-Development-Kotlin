fun main() {

    var x = 5
    val y = 3

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    println("3 + 4 * 3 = ${3 + 4 * 3}")

    x = 0

    println("x = ${x++}")
    println("x = ${++x}")

    println("x = ${x--}")
    println("x = ${--x}")

    val isactive = true

    if (isactive == true) {
        println("The User is Active")
    } else {
        println("The User is Inactive")
    }

    val myNumber = 100

    if (myNumber > 90) {
        println("The User is Active")
    } else if (myNumber >= 100) {
        println("The User is away")
    } else {
        println("The User is Inactive")
    }

    var isPlaying = true
    var score = 80

    if (isPlaying && score == 100) {
        println("The User moves to next level")
    } else {
        println("The User stays on the same level")
    }

    var num1 = 2
    var num2 = 2

    if (num1 < 2 || num2 > 2) {
        println("The condition is true")
    } else {
        println("The condition is false")
    }


}
