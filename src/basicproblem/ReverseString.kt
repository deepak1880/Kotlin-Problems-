package basicproblem

fun main() {

    println("Enter the String")
    var str = readLine()
    var string = str.toString()
    var reverse = ""

    for (i in string.length - 1 downTo 0) {
        reverse += string[i]
    }
    println("The Reverse String is $reverse")
}