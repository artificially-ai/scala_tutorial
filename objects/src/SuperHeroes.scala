/*
* The 'secretIdentity' is private. As you might expect, it means that it's visible only inside the Hero class.
*/
class Hero(val name:String, private val secretIdentity:String)

object Hero {
  def revealSecretIdentity(x:Hero) = x.secretIdentity
}

object SuperHeroesRunner extends App {
  val superman = new Hero("Super-Man", "Clark Kent")
  val wolverine = new Hero("Wolverine", "James Howlett")

  println(Hero.revealSecretIdentity(superman))
  println(Hero.revealSecretIdentity(wolverine))
}
