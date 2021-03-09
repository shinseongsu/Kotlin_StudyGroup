package essence

fun main() {

    var factor = 2
    fun doubleIt(n: Int) = n * factor
    factor = 0
    println(doubleIt((2)))

}

// var 대신 val을 사용하려는 노력해야 한다.
// 나중에 보게 되겠지만, 코틀린은 다른 경우에서도 val과 이뮤터블을 기본으로 사용한다.

// 코틀린의 val은 java의 final과 비슷하다. java와 다르게 코틀린은 var를 사용해서 뮤터블 변수르 나타낸다.

// val도 주의해서 사용해야 한다.
// val은 변수나 참조만 상수로 만든다.
// 객체를 상수로 만드는 것은 불가능하다.