import scala.beans.BeanProperty
import scala.annotation.elidable

/*
* Here we user 'var' for both memory and disk properties as those are cable to  be updated.
* Using 'val' and 'var' would already be enough to have accessors and mutators. However,
* if one wants to have Java-style getters and setters, the BeanProperty annotation can help.
*
* I'm new of Scala, but I'm already in love with the semantics of 'val' and 'var'. So,
* I would not use the BeanProperty at all.
*
* Compile this class and check the byte-code structure:
* scalac -d classes src/Computer.scala
* javap -p -cp classes Computer
*/

class Computer(@BeanProperty var memory:Long,
               @BeanProperty val cpu:Double,
               @BeanProperty val disk:Int,
               @BeanProperty val usb:Int = 2) {

  require(memory >= 8192, "Memory must be greater than or equal to 8192.")
  require(cpu >= 1.5, "CPU must be greater than or equal to 1.5.")

  // Not the more elegant way.
  // 1. To enforce immutability, we do not change the internal state of the object, but instead we create a new one.
  //    Note that we have changed the 'disk' and 'usb' member from 'var' to 'val'.
  // 2. We return a new Computer, with the memory parameter that has been passed and the current parameters held by the object.
  def upgradeMemory(memory:Long) = new Computer(memory, this.cpu, this.disk, this.usb)

  // Better approach.
  // Uses default parameters instead the need to have 1 upgrade method per member.
  def upgrade(memory:Long = this.memory,
              cpu:Double = this.cpu,
              disk:Int = this.disk,
              usb:Int = this.usb) = {
    new Computer(memory, cpu, disk, usb)
  }
}
