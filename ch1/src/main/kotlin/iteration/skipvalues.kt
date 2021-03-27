package iteration

fun main() {

    for( i in 1 until 5 ) {
        print("$i, ")
    }
    // 1, 2, 3, 4,

    println()

    for(i in 1 until 10 step 3) {
        print("$i, ")
    }
    // 1, 4, 7,

    println()

    for(i in 10 downTo 0 step 3) {
        print("$i, ")
    }
    // 10, 7, 4, 1,

    println()

    for(i in (1..9).filter { it % 3 == 0 || it % 5 == 0 }) {
        print("$i, ")
    }
    // 3, 5, 6, 9,

}

// 범위 안의 값 건너뛰기

// 숫자 범위를 반복할 때 마지막 값을 건너뛰려면 until()을 이용해서 범위를 만들면 된다.
// ..과는 다르게 until() 메소드는 마지막 값을 포함시키지 않는다.

// step()은 명백하게 뛰어난 표현력과 적은 오류를 위한 방향으로 가는 발걸음이다.

// filter() 메소드는 람다표현식을 인자로 사용한다. 람다와 함수형 프로그래밍에 대해서 나중에 다시 다루겠습니다.