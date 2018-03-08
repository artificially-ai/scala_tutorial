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

// Here we say that this class os declared as a Person, but its implementation is a of a 'e2', which is an Employee.
// Any attempt to call e2.department.name will result in a type mismatch error because Person does not contain department.
val p2:Person = e2
// println(p2.department.name)

printDeptName(e2)

def printDeptName(e:Employee) {
  println(e.department.name)
}

// In this case, the output will be the same because although 'p2' is declared as Person, it's an instance of Employee
// So, since both classes contain the 'fullName' method, it will use the one which is part of the instance.
println(e2.fullName)
println(p2.fullName)
