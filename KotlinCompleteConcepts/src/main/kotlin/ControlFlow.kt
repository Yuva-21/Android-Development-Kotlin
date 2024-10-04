fun main() {
    var alarm = 15
    var text = when (alarm) {
        in 1 .. 10->"The number is in 1...10"
        7 -> "The time is $alarm"
        14 -> "The time is $alarm"
        else -> "The time is $alarm"
    }
    println(text)

}