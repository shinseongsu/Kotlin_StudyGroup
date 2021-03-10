package functions

fun main() {

    fun createPerson(name: String, age: Int = 1, height: Int, weight: Int) {
        println("$name $age $height $weight")
    }
    createPerson("Jake", 12, 152, 43)   // Jake 12 152 43

    createPerson(name = "Jake", age = 12, weight = 43, height = 152)    // Jake 12 152 43

}


// 명시적 아큐먼트는 메소드 호출 부분의 가독성을 높여준다.
// 그리고 함수의 변경으로 인한 파라미터 추가시 함수에 발생할 수 있는 잠재적인 오류의 가능성들을 제거해 준다.