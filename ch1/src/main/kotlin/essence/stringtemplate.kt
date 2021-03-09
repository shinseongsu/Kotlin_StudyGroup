package essence

fun main() {

    val price = 12.25
    val taxRate = 0.08
    val output = "The amount $price after tax comes to $${price * (1 + taxRate)}"
    val disclaimer = "The amount is in US$, that's right in \$only"

    println(output)
    println(disclaimer)

}

// 문자열 템플릿
// 큰따옴표 문자열 안에서 $ 심볼을 변수 앞에 붙여주면 어떤 변수라도 문자열 안에 들어간다.
// 만약에 들어가야 할 표현식이 변수 하나보다 더 복잡한 명령문이라면 ${}로 감싸서 사용할 수 있다.