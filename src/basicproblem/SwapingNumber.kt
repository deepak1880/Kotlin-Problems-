package basicproblem

fun main() {
    var num1 = 23
    var num2 = 40
    println("Number Before Swapping $num1 and $num2")
//    var temp: Int = num1
//    num1 = num2
//    num2 = temp

    num1 = num1 + num2
    num2 = num1 - num2
    num1 = num1 - num2
    println("Number After Swapping $num1 and $num2")
}