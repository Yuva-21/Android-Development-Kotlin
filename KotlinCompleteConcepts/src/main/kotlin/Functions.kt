fun main() {
    myName("Yuva Aditya Singh", 20)

    val noInternetConnection = false

    if (!noInternetConnection) {
        println(hasData("has internet connection"))
    } else {
        showMessage()
    }

    println(giveAnswer(10, 9, 12))

    showMessage()
}

fun myName(name: String, age: Int) {
    println("My name is $name and my age is $age")
}

fun hasData(data: String) {
    println(data)
}

fun showMessage() {
    println("No internet connection")
}


//  Function: return and expressions

fun giveAnswer(a: Int, b: Int) = if (a > b) a else b

fun giveAnswer(a: Double, b: Double) = if (a > b) a else b

fun giveAnswer(a: Int, b: Int, c: Int): Int {

    return if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }
}


// Named and Default Parameter Functions

fun showMessage(name: String = "Yuva", message: String = showText()) {
    println("name: $name , message: $message")
}

fun showText() = "Hi"

// Functions using varArg

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}







