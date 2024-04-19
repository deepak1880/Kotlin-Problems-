package basicproblem

fun main() {

    val array = arrayOf(1, 3, 4, 5, 6, 7)

    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE

    for (element in array) {

        if (element > max) {
            max = element
        }

        if (element < min) {
            min = element
        }
    }
    println("The maximum value is $max and the minimum value is $min")
}