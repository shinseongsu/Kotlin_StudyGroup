package functions

fun main() {

    fun max(numbers: IntArray): Int {
        var large = Int.MIN_VALUE
        for (number in numbers) {
            large = if (number > large) number else large
        }
        return large
    }

    println(max(intArrayOf(1, 5, 2, 12, 7, 3)))     // 12

}

// 함수가 작을 때 우리는 =을 통해서 바디와 함수 선언부를 나누었다.
// 만일 함수가 더 복잡하다면 우리는 {} 블록을 사용해서 바디를 만든다.
// {} 블록 바디를 이용해서 함수를 정의하면 항상 리턴타입을 정의해줘야 한다.