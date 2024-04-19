import kotlin.system.exitProcess

fun main() {

  for(i in 0 until 5){
      println(i)
      if(i==3){
          return
      }
      println("After the continue $i")
  }
   println("Completed")
}