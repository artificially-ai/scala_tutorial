class Car private(val model:String, val year:Int)

object Car {
  /*
  * Factory method here. But instead of calling it create, we just use apply instead.
  */
  def apply(model:String, year:Int) = {
    new Car(model, year)
  }
}

object CarsRunner extends App {
  val c1 = Car.apply("Audi A4", 2018)
  val c2 = Car("Volvo v40", 2017)

  println(c1.model)
  println(c2.model)
}
