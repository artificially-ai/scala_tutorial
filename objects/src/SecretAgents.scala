/*
* Compile and run the code:
* scalac -d classes  src/*.scala
* scala -cp classes SecretAgentRunner
*/

class SecretAgent(val name:String) {
  def shoot(n:Int) {
    // Import everything from the SecretAgent Companion Object
    import SecretAgent._
    decrementBullets(n)
  }
}

object SecretAgent {
  private var bullets:Int = 3000

  private def decrementBullets(count:Int) {
    if (bullets - count <= 0) bullets = 0
    else bullets -= count
  }

  def remainingBullets = bullets
}

object SecretAgentRunner extends App {
  val bond = new SecretAgent("James Bond")
  val felix = new SecretAgent("Felix Leitner")
  val jason = new SecretAgent("Jason Bourne")
  val nick = new SecretAgent("Nick Fury")

  bond.shoot(800)
  felix.shoot(200)
  jason.shoot(550)
  nick.shoot(1200)

  println(SecretAgent.remainingBullets)
}
