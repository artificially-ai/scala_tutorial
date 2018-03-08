case class Box[T](t:T) {
  /*
  * There is now 'new' keyword being used because this is a case class.
  * I'm making the return type explicitly just for clarity, but that's not needed.
  *
  * Feel free to compile this class and run the following to see how amazing this is:
  * javap -p -cp classes Box
  */
  def boxedCouple[U](u:U):Box[Couple[T, U]] = Box(Couple(t, u))
}
