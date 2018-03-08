case class Couple[A, B](a:A, b:B) {

  /*
  * Simple swap method depicting that we do not need to declare the types in the method.
  * It's just a swap operation and the members 'a' and 'b' have already been given.
  *
  * Again, the return type is not really needed because Scala's inference. I added it just for the sake of it.
  */
  def swap():Couple[B, A] = Couple(b, a)
}
