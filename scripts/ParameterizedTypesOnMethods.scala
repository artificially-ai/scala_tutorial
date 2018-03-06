/*
* Parameterisation in Scala is analogous to Generics in Java. It helps to keep
* the code more polymorphic and abolish the use of isInstanceOf and asInstanceOf (casting).
* Before we get to implement it, let's have a look at all the code that we would have
* to write without using Parameterised Types.
*/

def decidePoorly(b:Boolean, x:Any, y:Any):Any = if (b) x else y

println(decidePoorly(true, 'A', 'B'))
println(decidePoorly(false, 'c', 'd'))
println(decidePoorly(true, 10, 20))

/*
* Here we have to use .toChar in order to convert it back to a Char.
* But why? Char is only 16 bits long. Any numeric operation on anything that
* is smaller than Int's bit size, will get converted to Int (which is 32 bits).
* Since we want a Char, to have to invoke .toChar
*/
def getNextChar(c:Char) = (c + 1).toChar

/*
* Although that works, the code is brittle and prone to error.
*/
println(getNextChar(decidePoorly(true, 'c', 'd').asInstanceOf[Char]))

/*
* Or it could be a bit uglier, but less prone to error.
*/

val result = decidePoorly(true, 'c', 'd')
if (result.isInstanceOf[Char]) {
   val charResult = result.asInstanceOf[Char]
   println(getNextChar(charResult))
}

/*
* Let's make it right!
*/

def decide[T](b:Boolean, x:T, y:T):T = if (b) x else y

val charResult = getNextChar(decide(true, 'W', 'Z'))
println(charResult)
println(charResult.getClass)

val intResult = decide(true, 20, 30)
println(intResult)
println(intResult.getClass)
