/*
* This script should be executed after the class Person is compiled.
*
* Running this code: scala -cp classes PersonScript.scala
*
* If you want to have a look at what byte-code looks like, try the following
* javap -p classes/Person
*
* It will print the class struct, with the accessors and mutator methods, the latter
* should look like: public void lastName_$eq(java.lang.String);
*
* The $eq is an operator character and is equivalent to: p.lastName = "blah blah"
*/

// Using the secondary constructor
val p1 = new Person("Wilder", "Rodrigues")
println(p1.firstName)
println(p1.address)

// Using the primary constructor
val p2 = new Person("Wilder", "Rodrigues", "Vleuten")
println(p2.address)

println("Equals should return false -> %s".format(p1 == p2))
println("hashCode should be different (false) -> %s".format(p1.hashCode == p2.hashCode))

val p3 = p1.update(address = "Vleuten")

println("Equals should return true -> %s".format(p2 == p3))
println("hashCode should be the same (true) -> %s".format(p3.hashCode == p2.hashCode))

// Check reference equality
println("Reference should be false -> %s".format(p2 eq p3))

val p4 = p3
println("Reference should be true -> %s".format(p3 eq p4))

println(p4.toString)
