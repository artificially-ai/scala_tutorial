/*
* So, as in a Java main method, we have main method with an array of strings as parameter and returning void (Unit, in our case).
* That's it! Just compile and run this file:
* scalac -d classes Runner.scala
* scala -cp classes Runner
*/
object Runner {
  def main(arg:Array[String]):Unit = {
    println("Hello, World!")
  }
}
