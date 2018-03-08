val c1 = Couple(1, "A") //Couple[Int, String]
val c2:Couple[Int, String] = Couple(1, "A") //Couple[Int, String]
val c3 = Couple(1, "A"):Couple[Int, String] //Couple[Int, String]
val c4 = Couple(1, Couple("key", "value")) //Couple[Int, Couple[Any, String]]

println(c4.a)
println(c4.b.a)
println(c4.b.b)

val c5 = Couple(new Person("Wilder", "Rodrigues", "Netherlands"), new Person("Erika", "Nattrodt", "Netherlands"))
println("Printing before swap...")
println(c5.a)
println(c5.b)

val c6 = c5.swap()
println("Printing after swap...")
println(c6.a)
println(c6.b)
