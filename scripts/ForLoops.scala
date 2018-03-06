var result = ""
for (a <- 1 to 100) {
  result = result + a
  if (a < 100) result = result + ","
}
println(result)
