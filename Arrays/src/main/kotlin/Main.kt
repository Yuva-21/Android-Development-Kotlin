fun main() {

    // Introduction to Arrays


    var names = arrayOf("Yuva", "Ashutosh", "Daksh")

    var mixedElements = arrayOf(1, 20, 3, 4, 5, 6, "Aayush", 'A')

    println("My name is ${names[0]}")
    println("I am ${mixedElements[1]} years old")

    for (i in mixedElements) {
        println(i)
    }

    for (i in mixedElements) {
        if (i is Int) {
            println(i)
        }
    }

    for (i in mixedElements) {
        if (i is String) {
            println(i)
        }
    }

    for (i in mixedElements) {
        if (i is Char) {
            println(i)
        }
    }


    // Arrays Challenge

    var max = findMaxAndMin(arrayOf(1,5,20,40,60), true)
    var min = findMaxAndMin(arrayOf(4,5,20,40,60), false)
    println("the max value is $max")
    println("the min value is $min")
}

    fun findMaxAndMin (numbers: Array<Int>, searchMax: Boolean): Int {
        var max = numbers[0]
        var min = numbers[0]

        if (searchMax) {
            for (number in numbers) {
                if(max < number){
                    max = number
                }
            }
            return max
        } else {
            for (number in numbers){
                if(min > number){
                    min = number
                }
            }
            return min
        }

    }