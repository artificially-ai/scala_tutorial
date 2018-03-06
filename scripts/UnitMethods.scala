def unitMethod(a:Unit):Int = 38

def add(x:Int, y:Int) = {
  x + y
}

def badAdd(x:Int, y:Int) {
  x + y
}

def addUnit(x:Int, y:Int):Unit = x + y

println(unitMethod(():Unit))
println(add(5, 5))
println(badAdd(5, 5))
println(addUnit(5, 5))
