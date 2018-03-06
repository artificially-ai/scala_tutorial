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

val p = new Person("Wilder", "Rodrigues")
println(p.firstName)

p.lastName = "Cabral Rodrigues"
println(p.lastName)
