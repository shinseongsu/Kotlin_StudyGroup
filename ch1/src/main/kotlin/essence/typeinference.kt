package essence

fun main(args: Array<String>) {
    val greet = "hello"

    println(greet)
    println(greet::class)
    println(greet.javaClass)
}

// 변수 타입 지정은 생략해도 된다.
// 코틀린은 정적 타입이다. 하지만 그게 변수의 타입을 꼭 지정해야 한다는 뜻은 아니다.
// 정적 타입이란 변수의 타입이 컴파일 시점에 검증되고 정확해져야 한다는 의미다.