/*
* Method signature in Scala follows the same Java way: the return type
* is not part of the signature. Thus, if one tries this out:
*
* def addNum(x:Int, y:Int):Double = x + y
* def addNum(x:Int, y:Int):Int = x + y
*
* It will break during compilation time (or execution, if running as script).
*/

def addNum(x:Int) = x + 1
def addNum(x:Double) = x + 30.0
def addNum(x:String) = x + 20

println(addNum(10))
println(addNum(20.0))
println(addNum("Hello "))
