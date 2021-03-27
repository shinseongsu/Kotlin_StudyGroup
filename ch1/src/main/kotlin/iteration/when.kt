package iteration

fun main() {

    fun isAlive(alive: Boolean, numberOfLiveNeghbors: Int) = when {
        numberOfLiveNeghbors < 2 -> false
        numberOfLiveNeghbors > 3 -> false
        numberOfLiveNeghbors == 3 -> true
        else -> alive && numberOfLiveNeghbors == 2
    }

}