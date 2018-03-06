def processNumbers(x:Int, y:Int, b:Boolean = true) = if (b) x else y

println(processNumbers(10, 41, true))

// Or we can call like this.
// The order doesn't matter as we can use the parameters' names.

println(processNumbers(x = 10, b = false, y = 41))

// And here the default value of 'b'

println(processNumbers(y = 41, x = 10))

// Default values are also available. But when using them, the parameters with
// default values should be the last ones in the method signature.

def add(x:Int, y:Int = 10) = x + y

println(add(3, 4))
println(add(30))
