package basicproblem

fun main() {

    print("Enter the Number: ")
    var nums = readLine()
    var num = nums?.toIntOrNull()
    var rem: Int
    var reverse = 0

    while (num != 0) {
        if (num != null) {
            rem = num % 10
            reverse = reverse * 10 + rem
            num /= 10
        }
    }
    print("Reverse of the number is $reverse")

}