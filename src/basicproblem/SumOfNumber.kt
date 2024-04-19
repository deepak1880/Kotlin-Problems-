package basicproblem

fun main() {
    var sum = 0
    var rem: Int
    print("Enter the Number: ")
    var nums = readLine()
    var num = nums?.toIntOrNull()

    while (num != 0) {
        if (num != null) {
            rem = num % 10
            sum += rem
            num /= 10
        }
    }
    print("Sum of the digits is $sum")
}

