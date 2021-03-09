package essence

import java.lang.RuntimeException

fun main() {

    fun nofluff() {
        println("nofluff called...")
        throw RuntimeException("oops")
    }

    println("not in a function, calling nofluff()")

    try {
        nofluff()
    } catch (ex: Exception) {
        val stackTrace = ex.getStackTrace()
        println(stackTrace[0])
        println(stackTrace[1])
    }
}

// 클래스와 함수는 생략 가능하다.
// Java와 같은 언어와 다르게, 코틀린은 명령문이나 표현식이 메소드에 속할 필요가 없고 메소드는 클래스에 속할 필요가 없다.

// try-catch는 선택사항이다.
// Java 컴파일러를 사용할 땐 명시적 예외를 확실하게 처리하거나 전달해야 한다.
// try-catch 문이 없는 함수를 호출했을 때 예외가 발생하면 자동으로 해당함수를 호출한 함수 또는 호출한 코드로 전달한다.