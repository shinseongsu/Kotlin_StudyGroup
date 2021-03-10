package functions

fun main() {

    fun max(vararg numbers: Int): Int {
        var large = Int.MIN_VALUE
        for( number in numbers) {
            large = if (number > large) number else large
        }
        return large
    }

    val values = intArrayOf(1, 21, 3)

    println(max(values[0], values[1], values[2]))       // 21
    println(max(*values))                               // 21
    println(max(*listOf(1, 4, 18, 12).toIntArray()))    // 18

}


// 인자의 앞에 *를 붙이는 것만으로 우리는 배열의 값들을 추출해서 vararg 파라미터에 다중인자로 넘기라고 요청하게 되는 것이다.
// 배열이 있으면 스프레드를 사용할 수 있지만 보통은 배열보다 리스트를 많이 사용한다.