package iteration

fun main() {

    val oneToFive: IntRange = 1..5
    val aToE: CharRange = 'a'..'e'
    val seekHelp: ClosedRange<String> = "hell".."help"

    println(seekHelp.contains("helm"))  // true
    println(seekHelp.contains("helq"))  // false

    for ( i in 1..5 ) {
        print("$i, ")
    }
    // 1, 2, 3, 4, 5,
    println()

    for( ch in 'a'..'e' ) {
        print(ch)
    }
    // abcde

}

// 레인지 클래스

// 코르린은 특정 범위의 ㄱ밧들을 반복하기 위해서 특화된 클래스들로 추상수준을 올렸다.
// 1~5까지 숫자의 범위를 만들려면 1..5 처럼 만들 수 있다.
// 숫자 뿐만 아니라 문자도 이렇게 바꿀 수 있다.