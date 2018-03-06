// Used to apply type matching in the operations. By inference, the subtract method
// return a Double, which can not be passed into the add operation.
// The round returns a Long type, which is larger than Int and hence we need the .toInt.
// The code below is used just to make it work. Its use is not encourage.

def add(x:Int, y:Int) = x + y
def subtract(x:Double, y:Double) = x - y
println(add(subtract(10, 3).round.toInt, subtract(100, 32).round.toInt))


val x = 3
println(x.isInstanceOf[Int])

val b = true
println(b.isInstanceOf[Boolean])

// Assigning a subtype (String) to a super-type (Any)
val g:Any = "Apple, banana, pear, orange"
println(g)

// Casting in order to assign a super-type to a subtype
val s:String = g.asInstanceOf[String]
println(s)

def process(x:Any) = if (x.isInstanceOf[Int]) x.asInstanceOf[Int] * 2 else -1

println(process(55))
println(process("bug"))
