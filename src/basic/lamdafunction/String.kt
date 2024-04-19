package basic.lamdafunction

fun main(){
    val result=personName("Deepak","23"){name,age->name+age}
    println(result)
}

fun personName(name:String,age:String,detailsOfPerson:(String,String)->String):String{
    return detailsOfPerson(name,age)
}