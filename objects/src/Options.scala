case class Employee(firstName:String, middleName:Option[String], lastName:String)

object OptionsRunner extends App {

  val e1 = Employee("Wilder", Some("Cabral"), "Rodrigues")
  val e2 = Employee("John", None, "Wick")

  println(e1)
  println(e2)

  val middleName1 = e1.middleName.getOrElse("Unknown")
  val middleName2 = e2.middleName.getOrElse("Unknown")

  println(middleName1)
  println(middleName2)
}
