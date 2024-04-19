package basic.lamdafunction

fun main() {

    var list = listOf("Arbaz", "Deepak", "Chandan", "Vishal")

    var filterList = list.filter {
        it.length > 6
    }
    var initialFilter=list.filter {
        it.contains("A" )
    }
    println(filterList)
    println(initialFilter)
}
