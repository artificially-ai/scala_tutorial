val department = new Department("Computer Science")
val p1 = new Person("Wilder", "Rodrigues", "Netherlands")
val e1 = new Employee("Wilder", "Rodrigues", "Vleuten", department)

printName(p1)
printName(e1)

// Polymorphic method accepting Person instances.
def printName(p:Person) {
  println(p.firstName)
}

val e2 = new Employee("Erika", "Nattrod", "Netherlands", department)

// Here we say that this class references an instance of Person, although we assigned 'e2' to it.
// Any attempt to call e2.department.name will result in a type mismatch error.
val p2:Person = e2
// println(p2.department.name)

printDeptName(e2)

def printDeptName(e:Employee) {
  println(e.department.name)
}
