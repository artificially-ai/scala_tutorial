class Department(val name:String)

/*
* The parameters on the Employee constructor have no 'val' or 'var' type modifier because they
* are already defined in the Person class.
*
* The 'department' however, has it as we want to access it from the Employee class.
*
*/
class Employee(firstName:String, lastName:String, address:String, val department:Department)
  extends Person(firstName, lastName, address) {

  /*
  * Overrides the fullName method from the Person class. It is a simple method, just doing String interpolation
  * so we concatenated the class members in a cleaner way.
  */
  override def fullName = s"$firstName $lastName - $department.name" 
}
