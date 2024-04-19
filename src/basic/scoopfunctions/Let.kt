package basic.scoopfunctions

// let->It is use for null checks that is whenever our object contains a null value We have to put a null check everyWhere
//So Instead of this we cn use let scoop function which will contain only not null values
//reference ->it and returns lambda function

fun main() {
    val x = Employee("Deepak", "Mumbai", 12).let {
        println(it)
        it.empId = 23
        it.empName = "Vishal"
        it.empCity = "Pune"
        it
    }
    println(x)

    var name: String? = "Hello"

    name.let {
        println("In let block $it")
        println( it?.length)
    }
}

data class Employee(var empName: String?, var empCity: String, var empId: Int)