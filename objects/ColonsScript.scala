object ColonsRunner extends App {

  class Foo(x:Int) {
    def bar(y:Int) = x + y
    def ~:(y:Int) = x * y
  }

  val foo = new Foo(10)
  println(foo.bar(10))

  /*
  * Right associative way. As you can see, the object if on the right and the parameter
  * on the left.
  */
  println(15 ~: foo)
}
