/*
* The 'secretIdentity' is private. As you might expect, it means that it's visible only inside the Hero class.
*/
class Hero private(val name:String, private val secretIdentity:String)

object Hero {
  /*
  * Quick reminder: Companion Objects have access to private information inside the accompanying class.
  * It helps to create factory methods and avoid the use of the constructor in other places. We simply use a factory method for that.
  */
  def create(name:String, secretIdentity:String) = {
    new Hero(name, secretIdentity)
  }
  def revealSecretIdentity(x:Hero) = x.secretIdentity
}

object SuperHeroesRunner extends App {
  val superman = Hero.create("Super-Man", "Clark Kent")
  val wolverine = Hero.create("Wolverine", "James Howlett")

  println(Hero.revealSecretIdentity(superman))
  println(Hero.revealSecretIdentity(wolverine))
}
