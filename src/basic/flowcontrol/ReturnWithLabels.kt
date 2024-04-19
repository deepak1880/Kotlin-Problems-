package basic.flowcontrol

fun main(){

    val list= listOf(2,3,4,5,6)

    list.forEach list@{
        if(it==3)
            return@list
        println(it)
    }
}