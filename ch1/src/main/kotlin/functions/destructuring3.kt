package functions

fun main() {

    fun getFullName() = Triple("John", "Quincy", "Adams")

    val (_, middle) = getFullName()
    println(middle)     // Quincy

}