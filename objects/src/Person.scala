/*
* The code below defines a class with a parameterised construct, which has 2
* parameters.
*
* Using 'val' before the parameter creates an accessor method to read the value.
* Using 'var' before the parameter creates an accessor method and also mutator method,
* which is used to set new values.
*
* This all works thanks to the Uniform Access Principle, which says that variable
* and parameterless methods should be accessed using the same syntax.
*
* A class file doesn't have to have the same name as the class defined in it. Also,
* a file can contain multiple classes inside it.
*
* Compiling it: scalac -d classes Person.scala
*/

class Person(val firstName:String, val lastName:String, val address:String = "Unknown") {

  // As you can see, the ancillary constructor needs no 'val' or 'var' declaration.
  // It's all done in the primary constructor, which already declares all the class needs.
  def this(firstName:String, lastName:String) = this(firstName, lastName, "Netherlands")

  // This method will be overridden in the Employee class.
  def fullName = s"$firstName $lastName"

  def update(firstName:String = this.firstName, lastName:String = this.lastName, address:String) = {
    new Person(firstName, lastName, address)
  }
}
