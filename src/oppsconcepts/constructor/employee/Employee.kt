package oppsconcepts.constructor.employee

fun main(){
    val employee=Employee("Deepak",12, companyName = "",)
    employee.companyName="NeoSoft"
    println(employee.companyName)
    println(employee.name)
    println(employee.age)
    print((employee.addres))

}
class Employee (val name:String,val age:Int,companyName:String,val addres:String="NA"){
    var companyName=companyName
}