def factorial(n:BigInt):BigInt = {
  if (n == 0 || n == 1) 1
  else n * factorial(n - 1)
}
println(factorial(10))
println(factorial(100))
println(factorial(1000))

// Stack Overflow
// println(factorial(10000))
