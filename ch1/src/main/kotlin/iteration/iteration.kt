package iteration

fun main() {

    val array = arrayOf(1, 2, 3)

    for ( e in array ) {
        print("$e, ")
    }
    // 1, 2, 3,

    println()

    val list = listOf(1, 2, 3)
    println(list.javaClass)
    for(e in list) {
        print("$e, ")
    }
    // class java.util.Arrays$ArrayList
    // 1, 2, 3

    println()

    val names = listOf("Tom", "Jerry", "Spike")
    for (index in names.indices) {
        println("Position of ${names.get(index)} is $index ")
    }
    // Position of Tom is 0
    // Position of Jerry is 1
    // Position of Spike is 2

    println()

    for((index, name) in names.withIndex()) {
        println("Position of $name is $index")
    }
    // Position of Tom is 0
    // Position of Jerry is 1
    // Position of Spike is 2

}

// 배열을 만들기 위해서 kotlin패키지에 포함된 arrayOf() 함수를 사용한다.
// 정수 객체 아니고 원시 자료형인 Int 배열을 생성하기 위해서는 intArrayOf() 함수를 사용하면 된다.
