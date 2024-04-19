package basicproblem

fun main() {
    var num1 = 0
    var num2 = 1

    print("Enter the number of Fibonacci series: ")
    var countNumber = readLine()
    var count = countNumber?.toIntOrNull()

    print("The Fibonacci series is: ")
    print("$num1,$num2,")
    for (i in 2 until count!!) {
        var num3 = num1 + num2
        print("$num3,")
        num1 = num2
        num2 = num3
    }
}
