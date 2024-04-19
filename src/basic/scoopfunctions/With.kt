package basic.scoopfunctions

fun main() {

    val employee = Employee("Vishal", "", 23)

    println("Before with block $employee")
    with(employee) {
        empCity = "Patna"
    }
    print(employee)
}
