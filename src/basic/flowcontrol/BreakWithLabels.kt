package basic.flowcontrol

fun main() {

    loop@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                continue@loop
            }
            println("$i & $j")
        }
    }
}