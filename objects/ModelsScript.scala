val department = new Department("Computer Science", "Technology")
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

val d1 = Department("HR", "Technology")
val d2 = Department("Finance", "Technology")

println(d1.name)
println(d2.name)

println("Should be false -> %s".format(d1 == d2))

val d3 = d2.copy(name = "HR")
println("Should be true -> %s".format(d3 == d1))

println("Should be false -> %s".format(d1 eq d2))

val d4 = d1
println("Should be true -> %s".format(d1 eq d4))

// Pattern Matching (comes for free on case classes)

val r1 = d1 match {
                case Department(n, m) => s"department is '$n' and business unit is '$m'"
                case _ => "Unknown" // Default case block.
              }

println(r1)
