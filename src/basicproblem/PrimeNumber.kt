package basicproblem

fun main() {

    print("Enter the Number: ")
    var nums = readlnOrNull()
    var num = nums?.toIntOrNull()
    var temp = 0

    if (num != null) {
        for (i in 2 until num - 2) {
            if (num % i == 0) {
                temp = temp + 1
            }
        }
        if (temp > 0) {
            println("It is a not Prime Number ")
        } else {
            println("It is a Prime Number ")
        }
    }
}