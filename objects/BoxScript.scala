val box1 = Box(1) //Box[Int]
val box2:Box[Int] = Box(1) //Box[Int]
val box3 = Box(1):Box[Int] //Coercion Box[Int]

val box3Result:Int = box3.t
println(box3Result)

val box4 = Box("Hello") //Box[String]
val box5 = Box[String]("Hello") //Box[String]

val box6 = Box[Person](new Employee("Wilder", "Rodrigues", "Netherlands", Department("DS", "Tech")))
println(box6.t)

val box7 = Box(Box(3.14))
println(box7.t.t)

val box8 = box7.boxedCouple("PI")
println(box8)
