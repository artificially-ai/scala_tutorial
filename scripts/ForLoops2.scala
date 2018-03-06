val xs = List(1, 2, 3, 4)
// Since the list is empt, we need to declare a type.
var result = List[Int]()

for (a <- xs) {
  result = result :+ (a + 1)
}

println(result)
