/*
* This script should be executed after the class Computer is compiled.
*
* Running this code: scala -cp classes ComputerScript.scala.
*
*/

// Using named parameters (remember, order is not important!) and default value for 'usb'
val c1 = new Computer(memory = 8192, disk = 256, cpu = 2.5)
println(c1.usb)

val c2 = new Computer(memory = 8192, disk = 256, usb = 4, cpu = 2.5)
println(c2.usb)

val c3 = c2.upgradeMemory(16384)
println(c3.memory)

val c4 = c3.upgrade(disk = 512)
println(c4.memory, c4.disk)
