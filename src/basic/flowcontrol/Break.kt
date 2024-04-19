package basic.flowcontrol

fun main() {

    for (i in 1..10) {
        if (i == 5) {
            continue
        }
        println(i)
    }
    print( add(3,5))

}

fun add(x: Int, y: Int): Int {
    return x + y
}