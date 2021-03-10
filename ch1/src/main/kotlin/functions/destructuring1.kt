package functions

fun main() {

    fun getFullName() = Triple("John", "Quincy", "Adams")

    val (first, middle, last) = getFullName()
    println("$first $middle $last")         // John Quincy Adams


}