val str = String.format("This is a %s", "test.")
println(str)

val str2 = "This is a %s".format("test.")
println(str2)

println("Because you are %s, %s, %s times a lady.".format("Three", "Twice", "Once"))
println("Because you are %3$s, %2$s, %1$s times a lady.".format("Three", "Twice", "Once"))

import java.time._

println("We will be having lunch on %1$tB the %1$te in the year %1$tY".format(LocalDate.now))
printf("We will be having lunch on %1$tB the %1$te in the year %1$tY", LocalDate.now)
