package essence

fun main() {

    println("hi" == "hi")   // true
    println("hi" == "Hi")   // false
    println(null == "hi")   // false
    println("hi" == null)   // false
    println(null == null)   // true

}

// 향상된 동일성 체크