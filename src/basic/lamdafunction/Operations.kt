package basic.lamdafunction

fun main() {
    val sum = calculator(2, 3) { nums1, nums2 -> nums1 + nums2 }
    println(sum)
    val sub = calculator(2, 3) { num1, num2 -> num1 - num2 }
    println(sub)
    val multiple = calculator(2, 3) { nums1, nums2 -> nums1 * nums2 }
    println(multiple)
    val divide = calculator(10, 5) { nums1, nums2 -> nums1 / nums2 }
    println(divide)
}

fun calculator(nums1: Int, nums2: Int, operationToPerform: (Int, Int) -> Int): Int {
    return operationToPerform(nums1, nums2)
}