package basicproblem

fun main() {

    print("Enter the Number: ")
    var nums = readlnOrNull()
    var num = nums?.toIntOrNull()
    var reverse = 0
    var rem = 0
    var temp = num

    while (num != 0) {
        if (num != null) {
            rem = num % 10
            reverse = reverse * 10 + rem
            num /= 10
        }
    }
    if (temp == reverse) {
        println("It is a palindrome number ")
    } else {
        println("It is not a palindrome number")
    }
}