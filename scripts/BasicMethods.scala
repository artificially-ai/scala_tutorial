def add1(x:Int, y:Int):Int = {
  return x + y
}

def add2(x:Int, y:Int) = x + y

def numberStatus(n:Int) =
  if (n < 10) "Less than 10."
  else if (n > 10) "Greater than 10."
  else "It is 10!"

println(add2(6, 7))
println(numberStatus(99))
