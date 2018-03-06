val xs = List(1, 2, 3, 4)
val result = for (a <- xs) yield (a + 1)
println(result)
