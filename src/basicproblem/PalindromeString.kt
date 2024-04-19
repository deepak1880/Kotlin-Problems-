package basicproblem

fun main() {

    print("Enter the String: ")
    var str= readLine()
    var string=str.toString()

    var reverse=""
    var temp=string

    for(i in string.length-1 downTo 0){
        reverse += string[i]
    }
    if(reverse==temp){
        println("It is a palindrome String")
    }else{
        println("It is not a palindrome String")
    }
}