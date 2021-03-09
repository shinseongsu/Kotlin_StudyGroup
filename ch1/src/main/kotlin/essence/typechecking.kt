package essence

fun main(args: Array<String>) {

    val greet = "hello"
    println(greet)

    // greet = 0   // 에러

}

// 코틀린은 컴파일 시점에서 greet의 타입이 문자열이라고 판단했다.
// 그 결과 greet에 정수를 할당하려고 하자 유효하지 않다는 사실을 알 수 있다.