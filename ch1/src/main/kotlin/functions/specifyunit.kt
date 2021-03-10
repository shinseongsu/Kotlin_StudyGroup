package functions

fun main() {

    fun sayHello(): Unit = println("Well, hello")
    val message: Unit = sayHello()
    println("The result of sayHello is $message")

}

// Java에서 println()의 리턴값은 void 이다.
// 하지만 코틀린에서는 Unit을 리턴한다.