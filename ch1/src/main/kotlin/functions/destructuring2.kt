package functions

fun main() {

    fun getFullName() = Triple("John", "Quincy", "Adams")

    val (first, _, last) = getFullName()
    println("$first $last")

}