package basic.lamdafunction

fun main() {

    val result = operationOnNumber(3, 4) { x, y -> x + y }
    val result2 = operationOnNumber(3, 4) { x, y -> x * y }
    println(result)
    println(result2)
}

fun operationOnNumber(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}


