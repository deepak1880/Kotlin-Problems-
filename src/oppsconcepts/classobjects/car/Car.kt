package oppsconcepts.classobjects.car


class Car(val name:String,val type:String,val km:Int){

    fun driveCar(){
        println("$name car is Driving ")
    }

    fun applyBreak(){
        print("Apply breaks")
    }
}

