package iteration

fun main() {

    fun isAlive(alive: Boolean, numberOfLiveNeghbors: Int): Boolean {
        if (numberOfLiveNeghbors < 2) { return false }
        if (numberOfLiveNeghbors > 3) { return false }
        if (numberOfLiveNeghbors == 3) { return true }
        return alive && numberOfLiveNeghbors == 2
    }

}