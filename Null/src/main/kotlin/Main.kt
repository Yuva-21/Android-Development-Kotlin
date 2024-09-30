fun main() {
    var text: String? = "name"
    println(text!!.length)
    println(text?.length)

    var Text: String? = null
    println(Text?.length)
}
