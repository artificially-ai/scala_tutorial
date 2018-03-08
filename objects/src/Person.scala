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

  // This method will be overridden in the Employee class.
  def fullName = s"$firstName $lastName"

  def update(firstName:String = this.firstName, lastName:String = this.lastName, address:String) = {
    new Person(firstName, lastName, address)
  }

  override def equals(x:Any):Boolean = {
    if (!x.isInstanceOf[Person]) false
    else {
      val other = x.asInstanceOf[Person]
      other.firstName == this.firstName &&
      other.lastName == this.lastName &&
      other.address == this.address
    }
  }

  override def hashCode:Int = {
    // It's fine to use var here. It will be mutable only within the context of this method.
    var result = 19
    result = 31 * result + firstName.hashCode
    result = 31 * result + lastName.hashCode
    result = 31 * result + address.hashCode
    result
  }

  override def toString:String = s"{'firstName' : '$firstName', 'lastName' : '$lastName', 'address' : '$address'}"
}
