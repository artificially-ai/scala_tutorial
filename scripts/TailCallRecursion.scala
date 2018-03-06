import scala.annotation.tailrec

/*
* Needs an accumulator because when using Tail Call Recursion we are not allowed
* to compute operations when calling a recursive method. For example,
* the if we would do n * fact(n - 1) it would break.
*/
@tailrec
def fact(n:BigInt, acc:BigInt):BigInt = {
  if (n == 0 || n == 1) acc
  else fact(n - 1, acc * n)
}

def factorial(n:BigInt) = fact(n, 1)

println(factorial(10))
println(factorial(100))
println(factorial(1000))
println(factorial(10000))
