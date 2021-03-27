package iteration

fun main() {

    for( i in 5.downTo(1)) {
        print("$i, ")
    }
    // 5, 4, 3, 2, 1,

    println()

    for( i in 5 downTo 1) {
        print("$i, ")
    }
    // 5, 4, 3, 2, 1,


}

// 후 방향 반복

// 이전에는 정방향 반복을 보여줬다.
// 우리는 후방향 반복도 쉽게 할 수 있다.
// 5..1로 범위를 만드려하면 동작하지 않는다.