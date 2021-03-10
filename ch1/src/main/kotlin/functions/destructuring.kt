package functions

fun main() {

    fun getFullName() = Triple("John", "Quincy", "Adams")

    val result = getFullName()
    val first = result.first
    val middle = result.second
    val last = result.third
    println("$first $middle $last")         // John Quincy Adams

}